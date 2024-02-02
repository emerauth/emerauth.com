(ns com.emerauth.components.navbar
  (:require
   [helix.core :refer [$ defnc <>]]
   [helix.dom :as hd]
   [helix.hooks :as hh]
   [refx.alpha :as refx]))

(defnc navbar []
  (hd/nav
    {:class "bg-white border-gray-200 dark:border-gray-600 dark:bg-[#010812]"}
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
          "Emerauth"))
      (hd/button
        {:data-collapse-toggle "mega-menu-full"
         :type "button"
         :class "inline-flex items-center p-2 w-10 h-10 justify-center text-sm text-gray-500 rounded-lg md:hidden hover:bg-gray-100 focus:outline-none focus:ring-2 focus:ring-gray-200 dark:text-gray-400 dark:hover:bg-gray-700 dark:focus:ring-gray-600"
         :aria-controls "mega-menu-full"
         :aria-expanded "false"}
        (hd/span
          {:class "sr-only"}
          "Open main menu")
        (hd/svg
          {:class "w-5 h-5"
           :aria-hidden "true"
           :xmlns "http://www.w3.org/2000/svg"
           :fill "none"
           :viewBox "0 0 17 14"}
          (hd/path
            {:stroke "currentColor"
             :stroke-linecap "round"
             :stroke-linejoin "round"
             :stroke-width "2"
             :d "M1 1h15M1 7h15M1 13h15"}))))))
