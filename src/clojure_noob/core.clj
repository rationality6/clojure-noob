(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "foo")
  (println "bar")

  (do (println "no prompt here!")
      (+ 1 3))

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
  
  (println(codger "Billy" "Anne-Marie" "The Incredible Bulk")))

