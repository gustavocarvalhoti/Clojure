(ns forca.core
    (:gen-class))

(def total-de-vidas 6)

(defn perdeu [] (print "Você perdeu!"))

(defn ganhou [] (print "Você ganhou!"))

(defn letras-faltantes [palavra acertos]

)

(defn acertou-a-palavra-toda? [palavra acertos]
  (if ()

  )
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

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
