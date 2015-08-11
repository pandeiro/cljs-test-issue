(ns app.core
  (:require
   app.test
   [cljs.test :as t :refer-macros [deftest testing is async run-tests]]))

(enable-console-print!)

(run-tests (t/empty-env) 'app.test)

(println "Hello World!")
