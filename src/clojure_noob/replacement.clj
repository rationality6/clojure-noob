(def inventory
  [{:name "전설의 타이즈" :part "방어구"}
   {:name "전설의 빠다 칼" :part "무기"}
   {:name "용접헬멧" :part "투구"}
   {:name "스페이스히피" :part "신발"}])

(defn show-list
  [inven]
  (def length (- (count inven) 1))
  (loop [iter 0]
    (println (get inven iter))
    (if (>= iter length)
      (println "done")
      (recur (inc iter)))))

(show-list inventory)

(defn show-list
  [inven]
  (def length (count inven))
  (dotimes [i length]
    (println (get inven i))))

(show-list inventory)

(defn show-list
  [inven]
  (dotimes [i (count inven)]
    (println (get inven i))))

(show-list inventory)

(defn matching-part
  [part]
  {:name (clojure.string/replace (:name part) #"^left-" "right-")
   :size (:size part)})

(defn symmetrize-body-parts
  "Expects a seq of maps that have a :name and :size"
  [asym-body-parts]
  (loop [remaining-asym-parts asym-body-parts
         final-body-parts []]
    (if (empty? remaining-asym-parts)
      final-body-parts
      (let [[part & remaining] remaining-asym-parts]
        (recur remaining
               (into final-body-parts
                     (set [part (matching-part part)])))))))