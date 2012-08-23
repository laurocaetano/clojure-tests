(ns learning.test.core
  (:use [learning.core])
  (:use [clojure.test]))

(deftest should-sum-two 
  (is (= 3 (+two 2)) "1 plus 2 should be 3"))
