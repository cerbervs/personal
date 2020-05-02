(ns personal.nav
  (:require [personal.nav-item :refer [nav-item]]))

(defn nav
  [state]
  (fn []
    [:div.w-screen.h-full.top-0.bg-gray-900.lg:h-screen.lg:w-full.lg:sticky
     [:div.flex.content-center.grid.grid-rows-2
      [:div
       [:img.flex-auto.circle.mx-auto.mb-4
        {:class "w-40 h-40"
         :src "img/headshot.jpg"
         :alt "Me!"}]
       [:p.text-gray-300.text-center.text-4xl.meddon "Mark Bailey"]]
      [:div
       [:ul.flex-none.mt-4 (for [link (:pages @state)]
                        [:div.flex.content-center.bg-gray-300.rounded-m.mx-auto.border.border-gray-900
                         {:class "w-3/4"}
                         [nav-item state link]])]]]]))
