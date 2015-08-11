(ns hello-world.core
  (:require
   hello-world.test
   [cljs.test :as t :refer-macros [deftest testing is async run-tests]]))

(enable-console-print!)

(run-tests (t/empty-env) 'hello-world.test)

(println "Hello world!")
