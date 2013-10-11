(defn divisible-up-to [n lmt]
  (loop [div 2 ]
    (cond 
      (>= div lmt) true
      (not= (mod n div) 0 ) false
      :else (recur (inc div) )
      ))
  )

(defn smallest-multiple [lmt]
  (loop [cand lmt ]
  (if (divisible-up-to cand lmt) cand (recur (inc cand)))
  ))

(smallest-multiple 20)