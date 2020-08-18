(ns main.blah
  (:require
   [rum.core :refer [defc mount] :as rum]))

(defc hello []
  [:div "HelloTTTTFFFFooo!"])

(defn main-page [comp]
  (mount
   (comp)
   (js/document.getElementById "app")))

(main-page hello)
