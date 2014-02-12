(ns rockpaperscissors.t-core
  (:use midje.sweet)
  (:use [rockpaperscissors.core]))

(def rock {:Gesture :Rock})
(def paper {:Gesture :Paper})
(def scissors {:Gesture :Scissors})

(facts "about RockPaperScissors"

  (fact "Rocks beat Scissors"
    (hand rock scissors) => "First player's Rock beats second player's Scissors"
    (hand scissors rock) => "Second player's Rock beats first player's Scissors")

  (fact "Papers beat Rocks"
    (hand paper rock) => "First player's Paper beats second player's Rock"
    (hand rock paper) => "Second player's Paper beats first player's Rock")

  (fact "Scissors beat Papers"
    (hand scissors paper) => "First player's Scissors beats second player's Paper"
    (hand paper scissors) => "Second player's Scissors beats first player's Paper")  

  (fact "Two Papers tie"
    (hand paper {:Gesture :Paper}) => "Two players with Paper, the game is tied")

  (fact "Two Scissors tie"
    (hand scissors {:Gesture :Scissors}) => "Two players with Scissors, the game is tied")

  (fact "Two Rocks tie"
    (hand rock {:Gesture :Rock}) => "Two players with Rock, the game is tied")
)
