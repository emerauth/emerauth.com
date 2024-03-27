(ns com.emerauth.components.footer
  (:require
   [helix.core :refer [$ defnc <>]]
   [helix.dom :as hd]
   [helix.hooks :as hh]
   [refx.alpha :as refx]
   [com.emerauth.components.svg :as svg]))

(defnc footer []
  (hd/footer 
    {:class "light:bg-emerauth-green dark:bg-emerauth-green text-white fixed bottom-0 w-full"}
    (hd/div 
      {:class "flex flex-row justify-between text-center p-5"}
      (hd/p "© 2024 Emerauth. All rights reserved.")
      (hd/ul 
        {:class "flex flex-row space-x-4"}
        (for [{:keys [name url icon]} svg/socials]
          (hd/li
            (hd/a 
              {:key url
               :href url
               :class "text-white hover:text-emerauth-blue"
               :target "_blank"
               :alt name}
              ($ icon))))))))
