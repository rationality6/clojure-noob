(ns clojure-noob.yourname)

(defn -main
  []
  (defn get-name
    "name print function"
    [name-param]
    (let [name (read-line)]
      (println "Hello," name))
    (println name-param)
    (println name)
    name)

(get-name "Hyun")
  )