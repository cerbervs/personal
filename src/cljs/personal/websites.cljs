(ns personal.websites)

(defn websites []
  (fn []
    [:div
     [:a.inconsolata.text-2xl {:href "http://www.loveandlabradorite.com"
                               :target "_blank"} "www.loveandlabradorite.com"]
     [:p.text-md "Created for Kira, by hand, using CLJS and ReactJS together."]
     [:br]
     [:div.grid.grid-rows-flow
      [:div.flex.flex-none.grid.grid-cols-2.w-full.xl:grid-cols-3
       [:img.website-img.zoom.lg:w-auto.lg:max-w-md {:src "img/lal1.png"}]
       [:img.website-img.zoom.lg:w-auto.lg:max-w-md {:src "img/lal2.png"}]
       [:img.website-img.zoom.lg:w-auto.lg:max-w-md {:src "img/lal3.png"}]
       [:img.website-img.zoom.lg:w-auto.lg:max-w-md {:src "img/lal4.png"}]
       [:img.website-img.zoom.lg:w-auto.lg:max-w-md {:src "img/lal5.png"}]
       [:img.website-img.zoom.lg:w-auto.lg:max-w-md {:src "img/lal6.png"}]]]]))
