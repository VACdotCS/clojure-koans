(ns koans.04-vectors
  (:require [koan-engine.core :refer :all]))

(meditations
  "You can use vectors in clojure as arrays"
  (= :vector (type []))

  "They can contain anything"
  (= [:a :b :c] [:a :b :c])

  "Even other collections"
  (= [1 [2 3] 4] [1 [2 3] 4])

  "Or even functions"
  (= [1 2 +] [1 2 +])

  "You can get the first element of a vector like a list"
  (= 1 (first [1 2 3 4 5]))

  "Or the last one"
  (= 5 (last [1 2 3 4 5]))

  "You can also get the rest"
  (= [2 3 4 5] (rest [1 2 3 4 5]))

  "Count your blessings, count your vectors"
  (= 4 (count [1 2 3 4]))

  "Or make a new vector"
  (= [1 2 3] (vec '(1 2 3)))

  "Vectors can be constructed with vector function"
  (= [1 2 3] (vector 1 2 3))

  "Or with the literal syntax"
  (= [1 2 3] [1 2 3])

  "You can get an element by index"
  (= 2 (nth [1 2 3 4 5] 1))

  "You can conj to the end"
  (= [1 2 3 4] (conj [1 2 3] 4))

  "Or subvec to get a subvector"
  (= [2 3] (subvec [1 2 3 4] 1 3))

  "You can peek and pop like a stack"
  (= 3 (peek [1 2 3]))
  (= [1 2] (pop [1 2 3]))

  "But empty vector throws on pop"
  (= "No dice!" (try
                 (pop [])
                 (catch IllegalStateException _
                   "No dice!"))))
