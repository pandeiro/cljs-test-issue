(ns app.test
  (:require
   [cljs.test :as t :refer-macros [deftest testing is async run-tests]]))

(deftest sample
  (testing "sample"
    (is (= 1 1))))

;; (deftest sample-2
;;   (testing "sample-2"
;;     (is (= 2 2))))
