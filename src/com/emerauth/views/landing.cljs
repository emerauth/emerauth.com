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
      {:class "flex flex-row w-full md:w-3/4 lg:w-2/3 mx-auto"}
      (hd/div
        {:class "w-full border-2 border-red-500"}
        "guto")
      (hd/div
        {:class "w-full border-2 border-red-500"}
        "josue"))

    (js/console.error "NAO FAZ MERGE DISSO")
    ($ footer/footer)))
