(ns check-score-clj.core)

(require '[clojure.string :as str])

(defn get-winner [score]
  (let [[first second] (str/split score #":")]
    (cond
     (< (read-string first) (read-string second)) "second"
     (> (read-string first) (read-string second)) "first"
     :else "draw")))

(defn score [guessed, real]
  (cond
    (= guessed real) "2"
    (= (get-winner guessed) (get-winner real)) "1"
    :else "0"))

(defn -main [& args]
  (println (score "6:6" "6:6")))
