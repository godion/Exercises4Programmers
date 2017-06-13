;(defn get-input [prompt]
;  (read-line))

;(while (not= "Q" (get-input "A")))

(defn get-input [prompt]
  (println prompt)
  (read-line))

(defn should-quit [input validate?]
  (or (= input "Q") (validate? input)))

; (defn get-input-loop [prompt validate?]
;   (loop [input (read-string (get-input prompt))]
;     (if (should-quit input validate?)
;       input
;       (recur (read-string (get-input prompt))))))

(defn get-input-loop [prompt validate?]
  (let [input (read-string (get-input prompt))]
    (if (should-quit input validate?)
    input
    (recur prompt validate?))))

(defn get-total [] (get-input-loop "Total: " number?))

(defn get-other [] (get-input-loop "Other: " number?))

(let [total (get-total)
      other (get-other)]
  (println "total + other: " (+ total other)))

;(when-not (= "Q" (get-input "A"))
;  )

