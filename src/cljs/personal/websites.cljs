(ns personal.websites)

(defn websites []
  (fn []
    [:div
     [:a.meddon.text-2xl {:href "http://www.loveandlabradorite.com"
                 :target "_blank"} "Love and Labradorite"]
     [:br]
     [:div.grid.grid-rows-flow
      [:div.flex.flex-none.grid.grid-cols-3.w-full
       [:img.website-img.lg:w-auto.lg:max-w-md.zoom {:src "img/lal1.png"}]
       [:img.website-img.lg:w-auto.lg:max-w-md.zoom {:src "img/lal2.png"}]
       [:img.website-img.lg:w-auto.lg:max-w-md.zoom {:src "img/lal3.png"}]]
      [:div.flex.flex-none.grid.grid-cols-3.w-full
       [:img.website-img.lg:w-auto.lg:max-w-md.zoom {:src "img/lal4.png"}]
       [:img.website-img.lg:w-auto.lg:max-w-md.zoom {:src "img/lal5.png"}]
       [:img.website-img.lg:w-auto.lg:max-w-md.zoom {:src "img/lal6.png"}]]]
     [:br]
     [:p.text-md "Created for Kira, by hand, using CLJS and ReactJS together."]]))
