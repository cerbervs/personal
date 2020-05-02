(ns personal.nav-item)

(defn nav-item
  [state link]
  (fn []
    (let [{:keys [title href id]} (second link)]
      [:a.flex-initial.mx-auto.text-center {:key id
                                            :id id
                                            :href href
                                            :on-click #(reset! state (assoc @state :active-page id))} title])))
