(ns com.emerauth.components.navbar
  (:require
   [helix.core :refer [$ defnc <>]]
   [helix.dom :as hd]
   [helix.hooks :as hh]
   [refx.alpha :as refx]))

(defnc navbar []
  (hd/nav
    {:class "bg-white border-gray-200 dark:border-gray-600 dark:bg-emerauth-blue"}
    (hd/div
      {:class "flex flex-wrap justify-between items-center mx-auto max-w-screen-xl p-4"}
      (hd/a
        {:href "https://emerauth.com"
         :class "flex items-center space-x-3 rtl:space-x-reverse"}
        (hd/img
          {:src "https://avatars.githubusercontent.com/u/156383797"
           :class "h-10"
           :alt "Emerauth Logo"})
        (hd/span
          {:class "self-center text-2xl font-semibold whitespace-nowrap dark:text-white"}
          "Emerauth")))))
