(defn sieve-of-eratosthenes [n]
   ( loop [x 2 lst (range 2 (inc n)) prim ()]
   (if (empty? lst )
    (into (sorted-set) prim)
      ( recur 
        (first lst)
         (doall (filter #(pos? (mod % x)) lst))
          (cons x prim )
         )
    
   )))

(defn log [x] (Math/log x))
(defn llog [x] (Math/log (Math/log x)))

(defn estimate-lower [n]
  "n * log n + n * (log log n − 1 "
  (if (> n 6) ( + ( * n ( log n )) ( * n ( - (llog n) 1 )) ) 11 ))

(defn estimate-upper [n]
  "n log n + n log log n"
  (if (> n 6) (+ ( * n ( log n )) ( * n ( llog n )) ) 17 ) )

(nth (into []  ( sieve-of-eratosthenes (estimate-upper 10000) )) 10000)