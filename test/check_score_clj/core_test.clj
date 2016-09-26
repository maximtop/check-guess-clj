(ns check-score-clj.core-test
  (:require [clojure.test :refer :all]
            [check-score-clj.core :refer :all]))

(deftest check-score-clj-test
  (testing "If player guessed right score result must return 2"
    (are [expected guessed real] (= expected (score guessed real))
      2 "5:5" "5:5"
      2 "1:2" "1:2"
      2 "2:1" "2:1"))
  (testing "If player guessed right match function must return 1"
    (are [expected guessed real] (= expected (score guessed real))
      1 "1:1" "0:0"
      1 "2:1" "3:1"
      1 "1:2" "2:3"))
  (testing "If player guess was wrong function must return 0"
    (are [expected guessed real] (= expected (score guessed real))
      0 "1:2" "2:1"
      0 "1:2" "2:2"
      0 "2:1" "1:3")))
