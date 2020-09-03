(ns personal.home)

(defn home []
  (fn []
    [:div
     [:p.text-center.text-6xl "Hello!"]
     [:br][:br][:br]
     [:p [:span.text-2xl "M"] "y  name is " [:span.text-3xl.meddon "Mark Bailey."]]
     [:br]
     [:br]
     [:br]
     [:p.text-center.text-xs 
      [:img.mx-auto.rounded-lg {:src "img/headshot_beard.jpg"
                                :alt "Me!"
                                :width "175px"
                                :height "auto"}]
      "This is what I look like"]
     [:br]
     [:br]
     [:br]
     [:p [:span.text-2xl "I"] "  make websites and write poetry among a number of another involuntary and voluntary things throughout the day."]
     [:p [:span.text-2xl "P"] "lease take a look through my website. You may find things here that you like. All I ask is that if you do, you also take a look at my About Me page and drop me a line through whichever method suits you."]
     [:br]
     [:br]
     [:br]
     [:p.text-sm "Thank you for having a look-see! I hope you enjoy your stay!"]]))
