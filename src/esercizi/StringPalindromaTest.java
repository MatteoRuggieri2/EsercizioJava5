package esercizi;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class StringPalindromaTest {
	
	static StringPalindroma stringPalindroma;

	/*Siccome i metodi all'interno della classe sono statici,
	 * non c'è bisogno di istanziare un oggetto, questo perchè
	 * i metodi stessi appartengono alla classe e non all'istanza
	 */
	
	//@BeforeAll
	//static void setUpBeforeClass() throws Exception {
		//stringPalindroma = new StringPalindroma();
	//}

	@Test
	void testStringTurner() {
		assertEquals("0", StringPalindroma.stringTurner("0"));
		assertEquals("321a", StringPalindroma.stringTurner("a123"));
		assertEquals("oaiC", StringPalindroma.stringTurner("Ciao"));
		assertEquals("ollo ", StringPalindroma.stringTurner(" ollo"));
		assertEquals("olleb oaiC", StringPalindroma.stringTurner("Ciao bello"));
	}
	
	@Test
	void testIsPalindrome() {
		assertEquals(true, StringPalindroma.isPalindrome("0"));
		assertEquals(false, StringPalindroma.isPalindrome("ciao"));
		assertEquals(false, StringPalindroma.isPalindrome("Ciao"));
		assertEquals(true, StringPalindroma.isPalindrome("ollo"));
		assertEquals(true, StringPalindroma.isPalindrome("Ollo"));
		assertEquals(true, StringPalindroma.isPalindrome("ollo Ollo"));
		assertEquals(true, StringPalindroma.isPalindrome(".//."));
		assertEquals(true, StringPalindroma.isPalindrome("Z$*//*$Z"));
	}
	
	@Test
	void testGetValidString() {
	    // Caso valido
	    Scanner validInput = new Scanner("ciao\n");
	    assertEquals("ciao", StringPalindroma.getValidString(validInput, "Inserisci una stringa:"));

	    // Caso di input non valido seguito da input valido
	    Scanner invalidThenValidInput = new Scanner("  \n123abc\n");
	    assertEquals("123abc", StringPalindroma.getValidString(invalidThenValidInput, "Inserisci una stringa:"));

	    // Caso limite di input con uno spazio e poi un carattere valido
	    Scanner edgeCaseInput = new Scanner(" \na\n");
	    assertEquals("a", StringPalindroma.getValidString(edgeCaseInput, "Inserisci una stringa:"));
	}


}