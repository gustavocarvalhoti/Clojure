(ns forca.core
    (:gen-class))

(def total-de-vidas 6)

(defn perdeu [] (print "Você perdeu!"))

(defn ganhou [] (print "Você ganhou!"))

(defn letras-faltantes [palavra acertos]
  (remove (fn [letra] (contains? acertos (str letra))) palavra
  )
)

(defn acertou-a-palavra-toda? [palavra acertos]
  (empty? (letras-faltantes palavra acertos))
)

(defn jogo [vidas palavra acertos]
  (if (= vidas 0)
      (perdeu)
      (
        do
        (println vidas)
        (if (acertou-a-palavra-toda? palavra acertos)
            (ganhou)
            (println "Chute o valor!")
        )
      )
  )
)

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

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))