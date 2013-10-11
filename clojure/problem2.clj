(defn fib-up-to
  	"Returns a lazy-seq of fibonacci number up to the value of n"
	([n] (take-while (partial > n ) (fib 1 2)))
	([a b] (cons a (lazy-seq (fib b (+ b a)))))
 )

(apply + (filter even? (fib-up-to 4000000)))