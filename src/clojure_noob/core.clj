(ns clojure-noob.core)

(defn -main
  "foo"
  []

  (def user {:id 1 :name "eunmin" :level 1})

  (update-in user [:level] inc)
  
  )