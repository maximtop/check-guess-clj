(ns check-score-clj.core)

(require '[clojure.string :as str])

(defn get-winner [score]
  (let [[first second] (str/split score #":")]
    (cond
      (< (bigint first) (bigint second)) :second
      (> (bigint first) (bigint second)) :first
     :else :draw)))

(defn score [guessed, real]
  (cond
    (= guessed real) 2
    (= (get-winner guessed) (get-winner real)) 1
    :else 0))

(defn score [guessed, real]
  (cond
    (= guessed real) 2
    (= (get-winner guessed) (get-winner real)) 1
    :else 0))
