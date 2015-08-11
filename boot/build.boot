(set-env!
 :source-paths #{"src"}
 :resource-paths #{"html"}
 :dependencies '[[org.clojure/clojure "1.7.0"]
                 [adzerk/boot-cljs "1.7.48-SNAPSHOT"]])

(require '[adzerk.boot-cljs :refer [cljs]])

(deftask go []
  (comp
   (watch)
   (cljs :compiler-options {:verbose true})))
