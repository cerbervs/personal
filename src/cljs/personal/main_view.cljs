(ns personal.main-view
  (:require [personal.home :refer [home]]
            [personal.about :refer [about]]
            [personal.websites :refer [websites]]
            [personal.poetry :refer [poetry]]))

(defn main-view
  [state]
  (fn []
    [:div.bg-gray-300.text-gray-900.p-4.col-span-4
    (case (:active-page @state)
      :home [home]
      :about [about]
      :websites [websites]
      :poetry [poetry])]))
