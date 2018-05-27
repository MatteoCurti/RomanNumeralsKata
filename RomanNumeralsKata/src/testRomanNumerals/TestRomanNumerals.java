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
	
	@Test
	public void oneTwoThree() {
		assertEquals("1", "I", RomanNumerals.arabicToRoman(1));
		assertEquals("2", "II", RomanNumerals.arabicToRoman(2));
		assertEquals("3", "III", RomanNumerals.arabicToRoman(3));
	}
	
	@Test
	public void four() {
		assertEquals("4", "IV", RomanNumerals.arabicToRoman(4));
	}
	
	@Test
	public void five() {
		assertEquals("5", "V", RomanNumerals.arabicToRoman(5));
	}
	
	@Test
	public void six() {
		assertEquals("6", "VI", RomanNumerals.arabicToRoman(6));
	}

}
