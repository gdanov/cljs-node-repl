(ns repl.two
	(:require [clojure.string :refer [split-lines]]))

(defn two []
	(println "two++!!")
	(println (split-lines "one\ntwo")))

(two)
