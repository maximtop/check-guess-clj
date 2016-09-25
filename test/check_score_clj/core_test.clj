(ns check-score-clj.core-test
  (:require [clojure.test :refer :all]
            [check-score-clj.core :refer :all]))

(deftest check-score-clj-test
  (testing "If player guessed right score result must return 2"
    (are [expected real guessed] (= expected (score real guessed))
      2 "5:5" "5:5"
      2 "1:2" "1:2"
      2 "2:1" "2:2")
  (testing "If player guessed right match result function must return 1"
    (is (= 1 (score "6:7" "5:6"))))
  (testing "If player guess was wrong result function must return 0"
    (is (= 0 (score "6:7" "5:4")))))
