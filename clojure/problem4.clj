(defn n-times-n [n] 
  ""
  (for [x (range 1 n) y (range 1 n)] (* x y)))

(defn is-palindromic-number [x]
  (let [s (str x)]
    ( = s (clojure.string/join (reverse s)))))


(apply max (filter is-palindromic-number (n-times-n 1000)))


