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

(apply + (sieve-of-eratosthenes 2000000))