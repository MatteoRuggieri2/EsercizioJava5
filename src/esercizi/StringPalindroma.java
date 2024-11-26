package esercizi;
import java.util.Scanner;

public class StringPalindroma {
	/* In questo esercizio prendere una stringa dall'utente
	 * e dire se è PALINDROMA oppure NO. */

	public static void main(String[] args) {
		
		// Prendo la stringa dall'utente e la salvo in "userString".
		Scanner in = new Scanner(System.in);
		String userString = in.nextLine();
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

}
