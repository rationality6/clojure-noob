(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "foo")
  (map (println args))
  (println "bar")

  (println "no prompt here!")
  (+ 1 3)

  (defn error-message
    [severity]
    (str "Oh god it's a disaster! we're "
         (if (= severity :mild)
           "true"
           "false")))
  (println (error-message :mild))

  (defn too-enthusiastic
    "Return a cheer that might be a bit too enthusiastic"
    [name]
    (str "OH. MY. GOD! " name " YOU ARE MOST DEFINITELY LIKE THE BEST "
         "MAN SLASH WOMAN EVER I LOVE YOU AND WE SHOULD RUN AWAY SOMEWHERE"))

  (println (too-enthusiastic "Zelda"))
  (defn x-chop
    ([name chop-type]
     (str "I " chop-type " chop " name "! Take that!"))
    ([name]
     (x-chop name "takendo")))
  (println (x-chop "hyun"))

  (defn saying
    [name]
    (str "Get off my lawn, " name " !!!"))

  (defn codger
    [& whippers]
    (map saying whippers))

  (println (codger "Billy" "Anne-Marie" "The Incredible Bulk"))
  (defn favorite-things
    [name & things]
    (str "Hi, " name ", here are my favorate things: "
         (clojure.string/join ", " things)))
  (println (favorite-things "Doreen" "gum" "shoes" "kara-te"))
  
  (def box0 {:width 10 :height 20})
  
  (defn print-box [box]
    (println "Width" (:width box) "Height" (:height box)))
  
  (print-box box0)
  
  (defn my-first
    [[& first-thing]]
    (println first-thing))
  
  (my-first ["oven" "bike" "war-axe"])
  
  (defn chooser
    [[first-choice second-choice & unimportant-choices]]
    (println (str "foobar" first-choice))
    (println (str "bar" second-choice))
    (println (str "baz" (clojure.string/join ", " unimportant-choices))))
  
  (chooser ["Marmalade", "Handsome Jack", "Pigpen", "Aquaman"])
  
  (defn announce-treasure-location
    [{lat :lat lng :lng}]
    (println (str "Treasure lat: " lat))
    (println (str "Treasure lng: " lng))
    )
  (announce-treasure-location {:lat 28.22 :lng 81.33})
  )

