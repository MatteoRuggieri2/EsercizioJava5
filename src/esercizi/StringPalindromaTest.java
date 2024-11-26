package esercizi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class StringPalindromaTest {
	
	static StringPalindroma stringPalindroma;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		stringPalindroma = new StringPalindroma();
	}

	@Test
	void testStringTurner() {
		assertEquals("oaic", stringPalindroma.stringTurner("ciao"));
	}
	
	@Test
	void testIsPalindrome() {
		assertEquals(false, stringPalindroma.isPalindrome("ciao"));
	}

}