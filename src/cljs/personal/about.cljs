(ns personal.about)

(defn about []
  (fn []
    [:div
     [:p.line-break [:span.text-2xl "I"] " have been programming computers since" [:span.font-bold " 11 "] "years old. During the interim between now and then, I have been programming for school assignments, personal improvement, and occasionally as a side-career. In those years of programming I have taught myself" [:span.font-bold " 19+ "] "programming languages."]
     [:br]
     [:p.line-break [:span.text-2xl "I"] " have dabbled in HTML/CSS, JavaScript (including several frameworks), Python, Ruby, PHP, Haskell (to much trouble and many headaches), Common Lisp, and Clojure/ClojureScript, to name a few."]
     [:br]
     [:p.line-break [:span.text-2xl "A"] "s for poetry, I have been consistent with writing since" [:span.font-bold " 14 "] "years old. I find it to be one of the best cathartic activities for me. I find inspiration at odd times, often, and out comes a poem. I enjoy conciseness while writing, and try to pack as much emotion into the fewest words that I can. This leads to short, intense pieces, often chock-full of personal feelings."]
     [:br]
     [:br]
     [:br]
     [:br]
     [:br]
     [:p.line-break.text-2xl "Contact me via:"]
     [:br]
     [:p.line-break [:span.text-xl "Email: "][:a {:href "mailto:markbaileyio.contact@gmail.com"} "markbaileyio.contact@gmail.com"]]]))
