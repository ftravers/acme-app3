(ns main.blah
  (:require
   [rum.core :refer [defc mount] :as rum]))

(defc hello []
  [:div "HelloT!"])

(defn main-page [comp]
  (mount
   (comp)
   (js/document.getElementById "app")))

(defn go []
  (main-page hello))
