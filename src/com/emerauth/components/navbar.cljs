(ns com.emerauth.components.navbar
  (:require
   [helix.core :refer [$ defnc <>]]
   [helix.dom :as hd]
   [helix.hooks :as hh]
   [refx.alpha :as refx]
   [com.emerauth.components.svg :as svg]))

(def github-star
  (hd/a
    {:class "github-button"
     :href "https://github.com/emerauth/emerauth"
     :data-icon "octicon-star"
     :data-size "large"
     :data-show-count "true"
     :data-color-scheme "no-preference: dark; light: light; dark: dark;"
     :aria-label "Star emerauth/emerauth on GitHub"}
    "Star"))

(defnc navbar []
  (hd/nav
    {:class "bg-white border-gray-200 dark:border-gray-600 dark:bg-emerauth-green"}
    (hd/div
      {:class "flex flex-wrap justify-between items-center mx-auto max-w-screen-xl p-4"}
      (hd/a
        {:href "https://emerauth.com"
         :class "flex items-center space-x-3 rtl:space-x-reverse"}
        (hd/img
          {:src svg/emerauth-logo
           :class "h-10"
           :width "5%"
           :alt "Emerauth Logo"})
        (hd/span
          {:class "self-center text-2xl font-semibold whitespace-nowrap dark:text-white"}
          "Emerauth"))
      (hd/div github-star))))
