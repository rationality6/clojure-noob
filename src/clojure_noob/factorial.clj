(ns facto.core)

(defn -main
  []
  ;; (* 999999999 9999999999)
  (*' 999999999 9999999999)

  (defn fact-1
    [n]
    (if (< n 2)
      1
      (*' n (fact-1 (dec n)))))

  (fact-1 5)

  (defn factorial-recor
    [n]
    (if (< n 2)
      1
      (* n (factorial-recor (- n 1)))))

  (factorial-recor 6)

  (defn fact-bot
    [n]
    (inc n)
    n)

  (fact-bot 3)
  )

