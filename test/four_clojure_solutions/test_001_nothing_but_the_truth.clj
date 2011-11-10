(ns four_clojure_solutions.test_001_nothing_but_the_truth
   (:use [midje.sweet])
   (:use four_clojure_solutions.001_nothing_but_the_truth))

(fact "should return true when true given"
  (solution true) => true)

(fact "should return false for anything else"
  (solution 1) => false)

