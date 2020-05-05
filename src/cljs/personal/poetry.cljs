(ns personal.poetry
  (:require [clojure.string :as str :refer [replace escape]]
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
Keep walking, don't turn back, there's nothing for you that way."

            "Winter is Coming"
            "Time and time again we struggle through the thick of it.
You, crying, me, somewhat steadfast, somehow unflinching. 
Winter is near, I can feel it in my bones. 
But I am ready for the cold. I have been preparing for those days, when the world is white, blinding, and silent.
So come, bring your iciest words to the table.
Give me shivers that last a life time, wake me in the dead of night, like it's the dead of winter, and my fan is still on, and my blanket is thin, and my bed is empty, save my hollow body. 
Pour your liquid nitrogen breath down my throat, let it freeze me up, keep me stable, because I can't fucking move anymore. 
It's alright. It's okay. I'll thaw eventually.
I might lose a finger, maybe a toe or two, god forbid something important, something
vital.
But in the end I'll still walk, talk, pretend,
it's okay, it's alright. 
Please, bring your mightiest blizzard."

            "This Time, We Lost"
            "So everyone has left, I am here alone,
for a week, give or take.
And this weight I've been feeling on my shoulders,
it's on my chest now too.
It's getting real heavy, it's starting to hurt real bad. 
Felt like I was scraping by, up there, with you.
And now I'm home again, and I fucking hate that I have to be here. 
But there was no other way, just the road in front of me as I slipped further from you.

I am so sorry I had to do this. 
It broke me too, and it will break me further; there's more to come, there always is. 
My heart's been bleeding, it's been on my sleeve, but you can't see the blood.
Good thing is, if it isn't in my chest, this weight can't crush it.

We'll meet those final moments together, together. 
Seeing the last sunset from years and years apart; wholly different vantage points.
Silence as the last goodbye, I imagine.
We'll see this through, until it is, and we can both rest. 
Because it's been a long slog, we fought hard, but this time, we lost."

            "If You'd Care to Talk"
            "Please use my name when you address me.
I will hear all the words you speak, again, when the time comes to lay my head down.
It sounds so delicate, wrapped gently in your voice.
I want to clutch it in my head, black and silken, stitched just so around the edges of the way you call me. 
I want it to echo through me, bursting like claps of thunder, and calmly like the pitter-patter of soft rains.
This way, when all I have left is my name, it will be clothed in your softest tones, as if it's better unsaid unless spoken by you."

            "I Will Carry You, as Atlas Carries the Sky (Reprise)"
            "We will be the salt of the earth at the end of days. 
Returned from dust, to dust.
Made from ash, molded by fire, and flame.
We came into this world screaming, and we will not leave quietly, not without struggle.
We will have stood tall at times, we will have crawled a time a time or two,
And our hands and feet will be calloused. 
Sometimes carrying each other, sometimes dragged by the little clothing we have left.

We will arrive,
at the perfect time,
to see him stand, with the sky on his shoulders.
And we will nod as we pass by, limping, slightly lame, and silent. 
He will shrug. He knows struggle greater than we ever could.
A gentle smile will cross his lips, as we, among many, make our pilgrimage on. 
Your arm over my shoulders, I am stooped to bear your weight, so that we may march unto the sun.

We've come so far,
and we've pushed up with all our might, out of frozen ground,
like seeds of something great.
We've got to keep on going,
we can't stop.
I've given too much to this cause, I won't let up.
For years we have trudged along, and for years more we will continue.
And I swear to you, I won't let us fall.
We will press onward, until only God can stop us. 
Because I will carry you, as Atlas carries the sky."})

(defn poetry []
  (fn []
    [:div
     (for [poem poems]
       [:p {:key (first poem)}
        [:span.font-bold.text-center (first poem)]
        [:br]
        [:span.text-justify.poem (escape (second poem) {"\n" "\u000a\u000d"})]
        [:br]
        [:br]])]))
