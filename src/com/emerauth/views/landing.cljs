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
    (hd/div
      {:class "flex flex-row w-full md:w-3/4 lg:w-2/3 mx-auto pt-12"}
      (hd/div
        {:class "w-full"}
        (hd/article
          {:class "flex flex-col space-y-4"}
          (hd/h1
            {:class "text-2xl font-bold"}
            "Hands free, configurable and extensible authentication & authorization.")
          (hd/p 
            "Emerauth is a simple and secure way to authenticate your users.")
          (hd/p "It's a modern, flexible and extensible authentication and authorization library for Clojure and ClojureScript.")))
      (hd/div
        {:class "w-full"}
        (hd/img
          {:src "/resources/assets/img/pc.svg"})))

    (js/console.error "NAO FAZ MERGE DISSO")
    ($ footer/footer)))
