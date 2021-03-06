(ns clojure-noob.memopad00
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
    (println (str "Treasure lng: " lng)))
  (announce-treasure-location {:lat 28.22 :lng 81.33})

  (defn announce-treasure-location0
    [{:keys [lat lng]}]
    (println (str "lat" lat))
    (println (str "lng" lng)))

  (announce-treasure-location0 {:lat 28.22 :lng 81.33})
  (defn illustrative-function
    []
    (+ 1 304)
    30
    "joe")
  (println (illustrative-function))

  (defn number-comment
    [x]
    (if (> x 6)
      "Oh my gosh! What a big number!"
      "That number's OK, I guess"))

  (println (number-comment 5))
  (println (number-comment 7))

  (def greetings
    (map
     (fn
       [name]
       (str "Hi, " name))
     ["Darth Vader" "Mr. Magoo"]))
  (println greetings)

  (println ((fn [x] (* x 3)) 8))
  (println (#(* % 3) 8))
  (map #(str "Hi, " %)
       ["Darth Vader" "Mr. Magoo"])

  (println (#(str %1 " and " %2) "cornbread" "butter beans"))

  (defn inc-maker
    [inc-by]
    #(+ % inc-by))

  (def inc3 (inc-maker 3))

  (println (inc3 7))

  (def asym-hobbit-body-parts [{:name "head" :size 3}
                               {:name "left-eye" :size 1}
                               {:name "left-ear" :size 1}
                               {:name "mouth" :size 1}
                               {:name "nose" :size 1}
                               {:name "neck" :size 2}
                               {:name "left-shoulder" :size 3}
                               {:name "left-upper-arm" :size 3}
                               {:name "chest" :size 10}
                               {:name "back" :size 10}
                               {:name "left-forearm" :size 3}
                               {:name "abdomen" :size 6}
                               {:name "left-kidney" :size 1}
                               {:name "left-hand" :size 2}
                               {:name "left-knee" :size 2}
                               {:name "left-thigh" :size 4}
                               {:name "left-lower-leg" :size 3}
                               {:name "left-achilles" :size 1}
                               {:name "left-foot" :size 2}])

  (defn matching-part
    [part]
    {:name (clojure.string/replace (:name part) #"^left-" "right-")
     :size (:size part)})

  (defn symmetrize-body-parts
    "Expects a seq of maps that have a :name and :size"
    [asym-body-parts]
    (loop [remaining-asym-parts asym-body-parts final-body-parts []]
      (if (empty? remaining-asym-parts)
        final-body-parts
        (let [[part & remaining] remaining-asym-parts]
          (recur remaining
                 (into final-body-parts
                       (set [part (matching-part part)])))))))

  (println (symmetrize-body-parts asym-hobbit-body-parts))

  (println (let [x 3]
             x))

  (def dalmatian-list
    ["Pongo" "perdita" "Puppy1" "Puppy2"])
  (println (let [dalmatians (take 3 dalmatian-list)]
             dalmatians))

  (def x 0)
  (println (let [x (inc x)] x))

  (println (let [[pongo & dalmatians] dalmatian-list]
             [pongo dalmatians]))

  (reduce + [1 2 3 4 5])
  (+ (+ (+ 1 2) 3) 4)

  (def double (fn [x] (* x 2)))
  (double 5)

  (def double2 double)

  (double2 10)

  (= double double2)

  (defn operator [op]
    (cond
      (= op :plus) +
      (= op :minus) -))
  ((operator :plus) 10 20 30)

  ;; high order functions 고차함수

  (defn multiple [n]
    (fn [a] (* n a)))

  (def double (multiple 2))

  (def triple (multiple 3))

  (double 10)

  (triple 10)
  
  )
