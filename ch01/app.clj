;(defn get-input [prompt]
;  (read-line))

;(while (not= "Q" (get-input "A")))

(defn get-input [prompt validate?]
  (println prompt)
  (loop [input (read-string (read-line))]
    (if (or (= input "Q") (validate? input))
      input
      (do
        (println prompt)
        (recur (read-string (read-line)))))))

(defn get-total [] (get-input "Total: " number?))

(defn get-other [] (get-input "Other: " number?))

(let [total (get-total)
      other (get-other)]
  (println "total + other: " (+ total other)))

;(when-not (= "Q" (get-input "A"))
;  )

