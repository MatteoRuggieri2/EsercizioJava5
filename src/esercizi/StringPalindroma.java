package esercizi;
import java.util.Scanner;

public class StringPalindroma {
	/* In questo esercizio prendere una stringa dall'utente
	 * e dire se è PALINDROMA oppure NO. */

	public static void main(String[] args) {
		
		// Prendo la stringa dall'utente e la salvo in "userString".
		Scanner in = new Scanner(System.in);
		String userString = getValidString(in, "Inserisci una stringa:");
		System.out.println("Stringa inserita: " + userString);
		in.close();
		
		// Controllo se la parola fornita è palindroma
		if (isPalindrome(userString)) {
			System.out.println("Questa stringa è PALINDROMA!");
		} else {
			System.out.println("Questa stringa NON è PALINDROMA.");
		}

	}
	
	public static boolean isPalindrome(String userString) {
		if(userString.toLowerCase().equals(stringTurner(userString).toLowerCase())) {
			return true;
		} else {
			return false;
		}
	}
	
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
	
	//TODO: VALIDAZIONE DA FARE
	/* Questo metodo ha il compito di richiedere un input di tipo String di
	 * almeno 1 carattere che non sia uno spazio.
	 * Se ciò che viene fornito dall'utente non è una stringa che rispetta
	 * le caratteristiche, verrà richiesta all'infinito. */
	public static String getValidString(Scanner in, String prompt) {
		
		String errorMessage = "\nERROR:\nInput non valido. Per favore, inserisci una stringa lunga almeno 1 carattere che non sia uno \"spazio\".\n";
		
		// Finchè non ottengo una stringa che sia di almeno 1 carattere e diversa da "spazio"
		while (true) {
		    System.out.println(prompt);

	        String inString = in.nextLine().trim(); // Leggo la riga
	        if (inString.length() > 0) {
	            return inString; // Se la stringa senza spazi è di almeno 1 carattere, la ritorno
	        } else {
	            System.out.println(errorMessage); // Mostro il messaggio di errore
	        }
		}

	}

}
