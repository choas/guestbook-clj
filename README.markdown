# guestbook-clj

a tutorial app for Clojure on Google AppEngine

This version forks [duelinmarkers / guestbook-clj](http://github.com/duelinmarkers/guestbook-clj), written by 
John Hume for his blog post [Clojure on Google AppEngine](http://elhumidor.blogspot.com/2009/04/clojure-on-google-appengine.html).

----

This up-to-date version uses  
* appengine 0.1 from [r0man / appengine-clj](http://github.com/r0man/appengine-clj)
* compojure-gae 0.3.3 from [choas / compojure-gae](http://github.com/choas/compojure-gae)

To compile and start just use [Leiningen](http://github.com/technomancy/leiningen):
    lein compile
    ../appengine-java-sdk-1.3.3/bin/dev_appserver.sh war

----

#### What about build.xml?
"Unless the ants were clever enough to build rafts." -- Leiningen Versus the Ants by Carl Stephenson

I use [Leiningen](http://github.com/technomancy/leiningen) and don't use build.xml (at the moment).


#### What about test?
If you want to run the test you have to get all dependent libraries:
    lein deps
... and run the test:
    lein test

After testing you have to clean and compile, because there are to many libraries and app engine couldn't start:
    lein clean
    lein compile


#### Other tutorials:
* [Interactive Programming with Clojure, Compojure, Google App Engine and Emacs](http://www.hackers-with-attitude.com/2009/08/intertactive-programming-with-clojure.html) 
