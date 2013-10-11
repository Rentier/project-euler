(defn gcd [a b] (if (= b 0) a (recur b (mod a b ))))
(defn abs [x] (if (neg? x ) (- x) x)   )
(defn f [x] (+ ('* x x) 1))

(defn pollard-rho [n]
  "Wikipedia told me how the Pollard's_rho_algorithm is defined.
  it returns one prime factor of n or :failure when there are none"
  ( (assert (> n 1))
  (loop [x 2 y 2 d 1]
  	(cond
     (= d 1) ( let [a (mod (f x) n) 
                    b (f (f y)) ]
              	(recur a
                       b
                       (gcd (abs (- a b)) n ) 
                ) )
     (= d n) :failure
     :else d))))

(defn prime-factors [n]
	(loop [x n primes () ]   
   	( let [cand (pollard-rho x)]
     	(if (= :failure cand) 
        	(cons x primes)
         	( recur (/ x cand ) (cons cand primes)  )
        ))))