
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (str "Hello, World!" args))

  (def greeting_string "hello")
  (str greeting_string "world")

  (defn looping
    [count]
    (loop [iter 0]
      (println (str "iter" iter))
      (if (> iter count)
        (println "done")
        (recur (inc iter)))))

  (looping 5)

  (defn printInventoryList
    "print all the item list in the inventory"
    [current_inventory]
    (loop [iter 0]
      (println (get current_inventory iter))
      (if (> iter (count current_inventory))
        (println "done")
        (recur (inc iter)))))

  (run! println (range (count inventory)))

  (def inventory [])
  (def inventory (conj inventory "마나포션" "힐링포션"))
  (def inventory (conj inventory "감자"))
  (def inventory (conj inventory "빵"))

  (def inventory [])
  (def blade0 {:name "Iron-blade" :ap 7})
  (def inventory (conj inventory blade0))
  (def inventory (conj inventory blade0))
  (def shield0 {:name "Iron-Shield" :dp 4})
  (def inventory (conj inventory shield0))

  (printInventoryList inventory)

  (doseq [[i x] (map-indexed inventory)]
    (println i ":" x))

  (def dbl-to-x-fn (fn
                     [x]
                     (dotimes [i x]
                       (println (* i 2)))))

  (dbl-to-x-fn 5)

  (defn dotimes-to-x
    [x]
    (dotimes [i x]
      (println i)))

  (dotimes-to-x 5)

  (ns foo)
  (defn print-item-list
    [inven]
    (dotimes [i (count inven)]
      (println (get (get inven i) :name))))

  (print-item-list inventory))