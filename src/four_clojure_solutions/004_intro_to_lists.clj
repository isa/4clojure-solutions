(ns four_clojure_solutions.004_intro_to_lists)

; Intro to Lists
; (= (list __) '(:a :b :c))
;
; Fill in the blanks

(defn solution [ & candidate ]
   (= (apply list candidate) '(:a :b :c)))
