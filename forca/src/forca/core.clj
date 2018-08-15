(ns forca.core
    (:gen-class))

(def total-de-vidas 6)

(def palavra-secreta "MELANCIA")

(defn perdeu [] (print "Você perdeu!"))

(defn ganhou [] (print "Você ganhou!"))

(defn letras-faltantes [palavra acertos]
  (remove (fn [letra] (contains? acertos (str letra))) palavra)
)

(defn acertou-a-palavra-toda? [palavra acertos]
  (empty? (letras-faltantes palavra acertos))
)

(defn le-letra! [] (read-line))

(defn acertou? [chute palavra] (.contains palavra chute))

(defn jogo [vidas palavra acertos]
  (cond
   (= vidas 0) (perdeu)
   (acertou-a-palavra-toda? palavra acertos) (ganhou)
   :else
   (let [chute (le-letra!)]
     (if (acertou? chute palavra)
       (do
         (println "Acertou a letra!")
         (recur vidas palavra (conj acertos chute)))
       (do
         (println "Errou a letra! Perdeu vida!")
         (recur (dec vidas) palavra acertos))))))

(defn start [] (jogo total-de-vidas palavra-secreta #{}))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (start))

(defn compareNumeros [n1, n2]
  (if (= n1 n2)
    (println "Números iguais")
    (println "Números diferente")
    )
  )

(defn fib[x]
  (if (= x 0) 0
    (if (= x 1) 1
      (+ (fib (- x 1)) (fib (- x 2))))))

(def numeros [1, 2, 3, 4, 5])

(def carros [50000.0, 60000.0])

(defn impar [x] (not= 0 (rem x 2)))

(defn remove-impar [numeros]
  (remove (fn [x] (not= 0 (rem x 2))) numeros)
)

(defn utilizando-filter [numbers]
  (filter (fn [x] (or (< x 5) (> x 6))) numbers)
)