(defproject rockpaperscissors "0.0.1-SNAPSHOT"
  :description "Rock, Paper, Scissors using Clojure multimethods"
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :profiles {:dev {:dependencies [[midje "1.5.0"]]
                   :plugins [[lein-midje "3.0.0"]]}})  
