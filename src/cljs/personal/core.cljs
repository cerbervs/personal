(ns personal.core
  (:require
   [reagent.core :as reagent :refer [atom]]
   [reagent.dom :as rdom]
   [reagent.session :as session]
   [reitit.frontend :as reitit]
   [clerk.core :as clerk]
   [accountant.core :as accountant];; -- components --
   [personal.nav :refer [nav]]
   [personal.main-view :refer [main-view]]
))

(defonce state (atom {:pages {:home {:title "Home"
                                     :href "#home"
                                     :id :home}
                              :about {:title "About Me"
                                      :href "#about"
                                      :id :about}
                              :websites {:title "Websites I've Created"
                                         :href "#websites"
                                         :id :websites}
                              :poetry {:title "My Poetry"
                                       :href "#poetry"
                                       :id :poetry}}
                      :active-page :home
                      :contact-info {:name "Mark Bailey"
                                     :email "mbbailey96@gmail.com"}}))

;; -------------------------
;; Routes

(def router
  (reitit/router
   ["/" :index]))

(defn path-for [route & [params]]
  (if params
    (:path (reitit/match-by-name router route params))
    (:path (reitit/match-by-name router route))))

;; -------------------------
;; Page components

(defn home-page []
  (fn []
    [:div.h-full.w-full.absolute.top-0.left-0
     [:div.w-screen.h-auto.bg-gray-900.lg:h-full.lg:fixed.lg:float-left
     {:class "lg:w-1/5"}
     [nav state]]
    [:div.h-screen.bottom-0.p-4.lg:float-right
     {:class "lg:w-4/5"}
     [main-view state]]]))

;; -------------------------
;; Translate routes -> page components

(defn page-for [route]
  (case route
    :index #'home-page))


;; -------------------------
;; Page mounting component

(defn current-page []
  (fn []
    (let [page (:current-page (session/get :route))]
      [:div
       [page]])))

;; -------------------------
;; Initialize app

(defn mount-root []
  (rdom/render [current-page] (.getElementById js/document "app")))

(defn init! []
  (clerk/initialize!)
  (accountant/configure-navigation!
   {:nav-handler
    (fn [path]
      (let [match (reitit/match-by-path router path)
            current-page (:name (:data  match))
            route-params (:path-params match)]
        (reagent/after-render clerk/after-render!)
        (session/put! :route {:current-page (page-for current-page)
                              :route-params route-params})
        (clerk/navigate-page! path)
        ))
    :path-exists?
    (fn [path]
      (boolean (reitit/match-by-path router path)))})
  (accountant/dispatch-current!)
  (mount-root))
