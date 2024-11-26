# Scanner Java

## StringPalindroma

Si realizzi la classe `StringPalindroma` in grado di chiedere all’utente, attraverso il terminale, una stringa. Successivamente, la classe deve ribaltarla e verificare che essa sia palindroma, ovvero che ribaltata sia lo stessa stringa.

- `Palindroma: ollo = ollo ✅`
- `Non palindroma: ciao = oaic ❌`

Si realizzi, inoltre, la classe JUnit `StringPalindromaTest` che testi il programma con diversi tipi di stringhe.

### La mia soluzione

Una volta letto la stringa, la giro e poi controllo che sia uguale a quella iniziale.
Per girarla compio queste azioni:

- Calcolo la lunghezza della stringa
- Prendo l'ultima lettera e la metto all'inizio di una nuova stringa

> **Procedimento:** Procederò prendendo l'ultima lettera dalla stringa iniziale e concatenandola ad una stringa nuova (inizialmente vuota).
Ripeterò questa azione per il numero di lettere presenti nella stringa (ecco a cosa mi serve clalcolarne la sua lunghezza).
Alla fine confronterò la stringa risultato con quella iniziale.
Il confronto sarà ==case-insensitive==.

---

#### Esempio

**_Input Iniziale:_** "Ciao"

**_Lunghezza stringa:_** 4

```java
public static String stringTurner(String string) {
    String turnedString = "";
    
    // Mi prendo la lunghezza della stringa fornita
    int stringLength = string.length();
    
    // Creo un counter per ripetere l'azione per ogni lettera
    int count = stringLength;
    
    // Finchè non finiscono le lettere le prendo e le concateno
    while (count >= 1) {
        // Prendo l'ultimo carattere e lo concateno
        turnedString += string.charAt(count - 1);
        count--;
    }
    
    System.out.println("Stringa girata: " + turnedString);
    return turnedString;
}
```

> **Output:** "oaiC"

---

**Input iniziale:** "Ciao"
**Stringa ribaltata:** "oaiC"

**SE** la stringa ribaltata
**E' UGUALE** all'input iniziale,
è **PALINDROMA**.

```java
// Comparazione case-insensitive della stringa
userString.toLowerCase().equals(stringTurner(userString).toLowerCase())

// "ciao" = "oaic" -> FALSE
```

> **Risultato:** In questo caso la stringa **_NON E' PALINDROMA_**.
