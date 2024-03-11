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
    (hd/div {:class "flex flex-col items-center justify-center h-screen"}
            (hd/h1 {:class "text-4xl font-bold text-center dark:text-white"}
                   "Emerauth")
            (hd/p {:class "text-lg text-center"}
                  "Hands free, configurable and extensible authentication & authorization.")
            (hd/div {:class "flex space-x-4 mt-4"}
                    (hd/a {:href "https://github.com/emerauth/emerauth"
                           :class "btn btn-primary"}
                          "GitHub")
                    (hd/a {:href "https://emerauth.com"
                           :class "btn btn-secondary"}
                          "Website")))

    ($ footer/footer)))
