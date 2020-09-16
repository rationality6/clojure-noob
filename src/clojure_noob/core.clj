(ns clojure-noob.core)

(defn -main
  "foo"
  []

  (def user {:id 1 :name "eunmin" :level 1})

  (update-in user [:level] inc)

  (let [x 3]
    x)

  (let [x 3]
    (inc x))

  (def dalmatian-list ["Pongo" "Perdita" "Puppy1" "Puppy2"])

  (let [dalmatians (take 2 dalmatian-list)]
    (println dalmatians))

  (def x 0)
  (let [x 1] x)

  (def x 0)
  (let [x (inc (inc x))] x)
  
  (def dalmatian-list ["Pongo" "Perdita" "Puppy1" "Puppy2"])
  
  (let [[a & dalmatians] dalmatian-list]
    (println a)
    (println dalmatians))
  )