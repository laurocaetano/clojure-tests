(ns learning.test.core
  (:use [learning.core])
  (:use [clojure.test]))

(deftest should-sum-two 
  (is (= 3 (+two 1)) "1 plus 2 should be 3"))

(deftest fibonacci-test
	(is (= (fib 3) [0 1 1])))