(ns personal.nav
  (:require [personal.nav-item :refer [nav-item]]))

(defn nav
  [state]
  (fn []
    [:div.col-span-1.border-black.border-2.bg-gray-900.h-screen
     [:div.grid.grid-rows-4.flex.content-center.h-full
      [:div]
      [:div
       [:img.flex-auto.circle.mx-auto.mb-4
        {:class "w-40 h-40"
         :src "img/headshot.jpg"
         :alt "Me!"}]]
      [:div
       [:ul.flex-none (for [link (:pages @state)]
                        [:div.flex.content-center.bg-gray-100.rounded-m.mx-auto
                         {:class "w-3/4"}
                         [nav-item state link]])]]
      [:div]]]))
