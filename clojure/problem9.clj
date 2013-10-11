(defn triples [n]
  ""
  (for [x (range 1 n) 
        y (range 1 n) 
        z (range 1 n)  
        :when #(= (+ x y z) 1000) ]
     (+ x y z)  ))


(filter #(= % 1000  ) (triples 1000))