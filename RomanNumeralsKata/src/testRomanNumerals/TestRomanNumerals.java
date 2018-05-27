package testRomanNumerals;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import romanNumerals.RomanNumerals;

public class TestRomanNumerals {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void one() {
		assertEquals("1", "I", RomanNumerals.arabicToRoman(1));
	}
	
	@Test
	public void oneTwo() {
	    assertEquals("1", "I", RomanNumerals.arabicToRoman(1));
	    assertEquals("2", "II", RomanNumerals.arabicToRoman(2));
    }

}
