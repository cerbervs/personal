(ns personal.main-view
  (:require [personal.home :refer [home]]
            [personal.about :refer [about]]
            [personal.websites :refer [websites]]
            [personal.poetry :refer [poetry]]))

(defn main-view
  [state]
  (fn []
    [:div.h-screen.w-full.p-4.lg:col-span-4.bg-gray-300
     (case (:active-page @state)
       :home [home]
       :about [about]
       :websites [websites]
       :poetry [poetry])]))
