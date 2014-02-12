(ns rockpaperscissors.core)

(derive ::Rock ::Gesture)
(derive ::Paper ::Gesture)
(derive ::Scissors ::Gesture)

(defmulti hand (fn [x y] [(:Gesture x) (:Gesture y)]))

(defmethod hand [:Rock :Paper] [_ _] 
  "Second player's Paper beats first player's Rock")

(defmethod hand [:Rock :Rock] [_ _] 
  "Two players with Rock, the game is tied")

(defmethod hand [:Rock :Scissors] [_ _] 
  "First player's Rock beats second player's Scissors")

(defmethod hand [:Paper :Rock] [_ _] 
  "First player's Paper beats second player's Rock")

(defmethod hand [:Paper :Scissors] [_ _] 
  "Second player's Scissors beats first player's Paper")

(defmethod hand [:Paper :Paper] [_ _] 
  "Two players with Paper, the game is tied")

(defmethod hand [:Scissors :Rock] [_ _] 
  "Second player's Rock beats first player's Scissors")

(defmethod hand [:Scissors :Paper] [_ _] 
  "First player's Scissors beats second player's Paper")

(defmethod hand [:Scissors :Scissors ] [_ _] 
  "Two players with Scissors, the game is tied")
