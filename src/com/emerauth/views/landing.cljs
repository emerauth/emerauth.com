(ns com.emerauth.views.landing
  (:require
   [helix.core :refer [$ defnc <>]]
   [helix.dom :as hd]
   [helix.hooks :as hh]
   [refx.alpha :as refx]
   [com.emerauth.components.navbar :as navbar]
   [com.emerauth.components.footer :as footer]))

(defnc landing []
  (hd/div
    ($ navbar/navbar)
    (hd/h1 "Landing Page")
    (hd/img {:src "https://i.pinimg.com/originals/23/51/bc/2351bc65b2b5d75cef146b7edddf805b.gif"
             :class "h-100"
             :alt "Dancing cat"})
    ($ footer/footer)))
