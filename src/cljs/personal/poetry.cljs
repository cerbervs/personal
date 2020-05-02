(ns personal.poetry
  (:require [clojure.string :as str :refer [replace]]
            [goog.string :as gstring]))

(def poems {"Demagogue"
                 "I want you to fall for me, as if you slipped at the top of ten flights of stairs. 
Like you tried to grab the rungs for the banister, desperately clutched at them, only to realize they are slick with something and you can't get a grip.
Sliding down the stairs, wooden, no carpeting, just hard edges to knock the breath from your body.
Steep as they are, you ended up going head over heels, tumbling down, elbows thrown into walls, fingernails dug into any surface where they could find purchase. 
But to no avail.

The fall has claimed you, there's no way to stop it, and you've still got six flights left.
So maybe you close your eyes, begin to accept it for what it is, a cruel twist of fate. 
Maybe you lean into each turn of your body, let yourself meld with with the stairs, momentarily, before tearing off toward your final destination.
Slowly, as slowly as it can be for the speed at which you fall, you learn to love the lack of oxygen;
the way it feels when you catch the stairs so hard your eyes water, fly open, and reveal the world again.
The landing at the bottom is concrete, and it looks soft, like a proper resting place, cool and welcoming to your aching, bruised body.

Little did you know, as you were falling I came through the door at the end of the hall. Stepped through and heard your racket, coming from on high, somewhere I couldn't ascertain. 
So I ran, bolted like a scared dog, for the landing of the stairs, I had to see what was coming.
And as we both reached the landing, I could see what was really going on.
I know now that you're falling, and I'll be damned if I don't catch you."

                 "Week Two"
                 "Tired like a bird dog, all but spent, just enough of himself left to trudge the mile or so home.
Ready to collapse as soon as the threshold has been crossed, bed not far from the door of this tiny abode. 
A hard day's work done, sun from the window glinting off the hairs laid flat across his back; hackles no longer raised at the fleeting thought of some tasty morsel, falling fast from the sky.
All of that is gone now, replaced by a full belly and long sleep, no dreams, save those of tomorrow trials, same as today's.

Like the dog, I too have no recourse. 
No choice other than the one that has been made for me. No chance to escape my fate. I am too small, and too weak. 
I have been led by the hand down this darkened, muddied road, and I can no longer see the way back. 
Thank you, I have missed the woods."

                 "Limbo"
                 "As this day draws to a sweltering close,
I am afforded a look at the length of time we have occupied
together.
It seems far longer than it was and far shorter than it ever could have been. 
Caught in some sort of limbo, we floated,
not daring to look down, not striving to reach up.
Gorging ourselves on the fruits we found on the underside of branches, tickling the tops of our heads. 
Here is where we part ways, friend.
Step down from our dizzying height, I'll turn right, and you, left. 
Turn your face to the sun, breathe in and step out. 
Keep walking, don't turn back, there's nothing for you that way."})

(defn poetry []
  (fn []
    [:div
     (for [poem poems]
       [:p {:key (first poem)}
        [:span.font-bold.text-center (first poem)]
        [:br]
        [:span.text-justify (replace (second poem) #"\n" "\r\n")]
        [:br]
        [:br]])]))
