(ns four_clojure_solutions.test_004_intro_to_lists
   (:use [midje.sweet])
   (:use four_clojure_solutions.004_intro_to_lists))

(fact "should return true when the right arguments given"
  (solution :a :b :c) => true)

(fact "should return false for anything else"
  (solution nil) => false)

