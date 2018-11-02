(ns workshop
  (:require [devcards.core :as dc :include-macros true]
            [workshop.core]
            [workshop.material]
            [workshop.react-dnd]))

(defn ^:dev/after-load start! []
  (dc/start-devcard-ui!))

(defn init! [] (start!))

(init!)
