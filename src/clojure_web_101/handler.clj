(ns clojure-web-101.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [clojure-web-101.templates :refer [tpl-helloworld]]))

(defroutes app-routes
  (GET "/" [] (tpl-helloworld "Hello World"))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
