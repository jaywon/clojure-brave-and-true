(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little teapot!"))

(println "Cleanliness is next to godliness")

(defn train
  "This is a choo choo train"
  []
  (println "Choo choo!"))

(def failed-protagonist-names
  ["Laryy Potter" "Doreen the Explorer" "The Incredible Bulk"])

(defn error-message
  [severity]
  (str "OH GOD! IT'S A DISASTER! WE'RE "
      (if (= severity :mild)
        "MILDLY INCONVENIENCED!"
        "DOOOOOOMED!")))

(defn codger-communication
  [whippersnapper]
  (str "Get off my lawn " whippersnapper "!!!"))

(defn codger 
  [& whippersnappers]
  (map codger-communication whippersnappers))

(defn favorite-things
  [name & things]
  (str "Hi my name is " name " and these are my favorite things: "
   (clojure.string/join ", " things)))

(defn important-things
  [[first-choice second-choice & unimportant-choices]]
  (println (str "You're first choice is " first-choice))
  (println (str "You're second choice is " second-choice))
  (println (str "You're unimportant choices are: " 
                (clojure.string/join ", " unimportant-choices))))

(defn geo-me
  [{lat :lat lng :lng}]
  (println (str "You're lat is " lat))
  (println (str "You're long is: " lng)))
