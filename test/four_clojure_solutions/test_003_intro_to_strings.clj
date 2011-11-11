(ns four_clojure_solutions.test_003_intro_to_strings
   (:use [midje.sweet])
   (:use four_clojure_solutions.003_intro_to_strings))

(fact "should return true when 'HELLO WORLD' given"
  (solution "HELLO WORLD") => true)

(fact "should return false for anything else"
  (solution "something else") => false)

