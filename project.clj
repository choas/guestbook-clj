(defproject guestbook-clj "1.0.1"
  :description "A very simple starting off point for appengine-clj."
  :dependencies [[org.clojure/clojure "1.2.0-master-SNAPSHOT"]
                 [org.clojure/clojure-contrib "1.2.0-SNAPSHOT"]
                 ;[lein-gae "1.0.0-SNAPSHOT"]
                 [commons-codec "1.3"]
                 [commons-io "1.4"]
                 [appengine "0.1"]
                 [compojure-gae "0.3.3"] ; see http://github.com/choas/compojure-gae
                 [org.mortbay.jetty/jetty "6.1.21"]
                 [com.google.appengine/appengine-api-1.0-sdk "1.3.2"]
                 [com.google.appengine/appengine-tools-sdk "1.3.0"]]
  :dev-dependencies [[swank-clojure "1.1.0"]
		     [com.google.appengine/appengine-api-1.0-sdk "1.3.2"]
		     [com.google.appengine/appengine-api-labs "1.3.2"]
		     [com.google.appengine/appengine-api-stubs "1.3.2"]
		     [com.google.appengine/appengine-local-runtime "1.3.2"]
		     [com.google.appengine/appengine-testing "1.3.2"]]
  :namespaces [guestbook.servlet]
  :compile-path "war/WEB-INF/classes"
  :library-path "war/WEB-INF/lib"
  :appengine {:id "guestbook-clj",
              :display-name "guestbook-clj",
              :version 1,
              :devport 8080}
)


