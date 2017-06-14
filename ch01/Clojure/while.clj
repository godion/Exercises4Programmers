(defn get-input [prompt]
  (println prompt)
  (read-line))

(defn should-quit [input validate?]
    (or (= input "Q") (validate? input)))

(defn get-total []
    (while (should-quit (read-string (get-input "Total")))))