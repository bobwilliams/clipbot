(defproject clipbot "0.1.0-SNAPSHOT"
  :description "Clojure HipChat Bot"
  :url "http://bryangilbert.com"
  :main clipbot.core
  :plugins [[lein-ring "0.8.6"]]
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [jivesoftware/smack "3.1.0"]
                 [jivesoftware/smackx "3.1.0"]
                 [net.java.dev.rome/rome "1.0.0"]
                 [clj-http "0.7.4"],
                 [cheshire "5.2.0"],
                 [org.clojure/core.match "0.2.0-rc2"]
                 [compojure "1.1.5"]
                 [http-kit "2.1.16"]
                 ;[org.thnetos/cd-client "0.3.6-SNAPSHOT"]
                 [clojail "1.0.6"]
                 [tentacles "0.2.5"]])