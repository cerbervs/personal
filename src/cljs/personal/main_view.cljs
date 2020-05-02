(ns personal.main-view
  (:require [personal.home :refer [home]]
            [personal.about :refer [about]]
            [personal.websites :refer [websites]]
            [personal.poetry :refer [poetry]]))

(defn main-view
  [state]
  (fn []
    (case (:active-page @state)
      :home [home]
      :about [about]
      :websites [websites]
      :poetry [poetry])))
