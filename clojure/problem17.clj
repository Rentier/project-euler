(def digits {
             0 "" 
             1 "one hundred and"
             2 "two hundred and"
             3 "three hundred and"
             4 "four hundred and"
             5 "five hundred and"
             6 "six hundred and"
             7 "seven hundred and"
             8 "eight hundred and"
             9 "nine hundred and"     
             })

(def two-digit {
             0  ""
             1 "ten" 
             2 "twenty"
             3 "thirty"
             4 "fourty"
             5 "fifty"
             6 "sixty"
             7 "seventy"
             8 "eighty"
             9 "ninety"
             })


(defn centum [x]  
  	(str (digits (int (/ x 100 ))) ))

(defn decim [x]   	
  	(str (two-digit (int (/ x 10 ))) 
         "-"
    ))

(defn uno [x] (str (digits (int (mod x 10 ))) 
         
    ))


(defn number-to-word [x]
  (str (centum x) (decim x) (uno x))
  )

