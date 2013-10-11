(defn collatz [x]
  ( loop[n x len 1]
   	( cond
   	(= n 1) len
   	(even? n) (recur ( / n 2) ( inc len))
    (odd? n ) (recur ( inc (* 3 n )) ( inc len))
   ))
  
  )

(apply max-key collatz (range 1 1000000))
