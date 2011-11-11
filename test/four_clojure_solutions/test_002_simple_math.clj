(ns four_clojure_solutions.test_002_simple_math
   (:use [midje.sweet])
   (:use four_clojure_solutions.002_simple_math))

(fact "should return true when 4 given"
  (solution 4) => true)

(fact "should return false for anything else"
  (solution -1) => false)

