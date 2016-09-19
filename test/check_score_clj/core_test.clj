(ns check-score-clj.core-test
  (:require [clojure.test :refer :all]
            [check-score-clj.core :refer :all]))

(deftest a-test
  (testing "If player guessed right score result must return 2"
    (is (= "2" (score "6:6" "6:6"))))
  (testing "If player guessed right match result function must return 1"
    (is (= "1" (score "6:7" "5:6"))))
  (testing "If player guess was wrong result function must return 0"
    (is (= "0" (score "6:7" "5:4")))))
