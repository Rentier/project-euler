(defn left [p dim] (assert (< p (dec dim) ) (inc p) ) )
(defn down [p dim] (assert (< p (- (* dim dim ) (dec dim) ) ) (+ p dim) ) )

(defn graph [dim] 
  "	0-1-2 
  	| | | 
  	3-4-5
  	| | |
  	6-7-8 "
  
  
  )