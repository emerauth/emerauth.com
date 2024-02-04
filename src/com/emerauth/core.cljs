(ns com.emerauth.core
  (:require
   ["react" :as react]
   ["react-dom/client" :as react-dom-client]
   [helix.core :refer [$]]
   [helix.dom :as hd]
   [refx.alpha :as refx]
   [com.emerauth.views.landing :refer [landing]]))

(enable-console-print!)

(defonce app-root
  (-> js/document
      (.getElementById "app")
      react-dom-client/createRoot))

(defn render []
  (->> ($ landing)
       ($ react/StrictMode)
       (.render app-root)))

(defn ^:dev/after-load clear-cache-and-render! []
  (refx/clear-subscription-cache!)
  (render))

(defn ^:export init []
  #_(refx/dispatch [:initialize-db])
  (render))
