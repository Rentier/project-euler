(defn irange [start end] (range start (inc end)))

( - 
	( let [s ( reduce + (irange 1 100))] (* s s ))
 	( reduce + (map #( * % %) (irange 1 100) )) 
)