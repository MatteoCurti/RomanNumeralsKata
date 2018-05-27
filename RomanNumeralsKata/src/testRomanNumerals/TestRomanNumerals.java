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

	@Test
	public void seven() {
		assertEquals("7", "VII", RomanNumerals.arabicToRoman(7));
	}
	
	@Test
	public void eight() {
		assertEquals("8", "VIII", RomanNumerals.arabicToRoman(8));
	}
	
	@Test
	public void nineIsXPrefixedByI() {
		assertEquals("9", "IX", RomanNumerals.arabicToRoman(9));
	}
	
	@Test
	public void ten() {
		assertEquals("10", "X", RomanNumerals.arabicToRoman(10));
	}
	
	@Test
	public void fromElevenAtNineteen() {
		assertEquals("11", "XI", RomanNumerals.arabicToRoman(11));
		assertEquals("12", "XII", RomanNumerals.arabicToRoman(12));
		assertEquals("13", "XIII", RomanNumerals.arabicToRoman(13));
		assertEquals("14", "XIV", RomanNumerals.arabicToRoman(14));
		assertEquals("15", "XV", RomanNumerals.arabicToRoman(15));
		assertEquals("16", "XVI", RomanNumerals.arabicToRoman(16));
		assertEquals("17", "XVII", RomanNumerals.arabicToRoman(17));
		assertEquals("18", "XVIII", RomanNumerals.arabicToRoman(18));
		assertEquals("19", "XIX", RomanNumerals.arabicToRoman(19));
	}
	@Test
	public void twenty() {
		assertEquals("20", "XX", RomanNumerals.arabicToRoman(20));
	}
	
	@Test
	public void fromTwentyoneToThirtynine() {
		assertEquals("21", "XXI", RomanNumerals.arabicToRoman(21));
		assertEquals("22", "XXII", RomanNumerals.arabicToRoman(22));
		assertEquals("23", "XXIII", RomanNumerals.arabicToRoman(23));
		assertEquals("24", "XXIV", RomanNumerals.arabicToRoman(24));
		assertEquals("25", "XXV", RomanNumerals.arabicToRoman(25));
		assertEquals("26", "XXVI", RomanNumerals.arabicToRoman(26));
		assertEquals("27", "XXVII", RomanNumerals.arabicToRoman(27));
		assertEquals("28", "XXVIII", RomanNumerals.arabicToRoman(28));
		assertEquals("29", "XXIX", RomanNumerals.arabicToRoman(29));
		assertEquals("30", "XXX", RomanNumerals.arabicToRoman(30));
		assertEquals("31", "XXXI", RomanNumerals.arabicToRoman(31));
		assertEquals("32", "XXXII", RomanNumerals.arabicToRoman(32));
		assertEquals("33", "XXXIII", RomanNumerals.arabicToRoman(33));
		assertEquals("34", "XXXIV", RomanNumerals.arabicToRoman(34));
		assertEquals("35", "XXXV", RomanNumerals.arabicToRoman(35));
		assertEquals("36", "XXXVI", RomanNumerals.arabicToRoman(36));
		assertEquals("37", "XXXVII", RomanNumerals.arabicToRoman(37));
		assertEquals("38", "XXXVIII", RomanNumerals.arabicToRoman(38));
		assertEquals("39", "XXXIX", RomanNumerals.arabicToRoman(39));
	}
	
	@Test
	public void fourty() {
		assertEquals("40", "XL", RomanNumerals.arabicToRoman(40));
	}
	
	public void fifty() {
		assertEquals("50", "L", RomanNumerals.arabicToRoman(50));
	}
	
	@Test
	public void ninety() {
		assertEquals("90", "XC", RomanNumerals.arabicToRoman(90));
	}
	
	@Test
	public void oneHundred() {
		assertEquals("100", "C", RomanNumerals.arabicToRoman(100));
	}
	
	public void fourHundred() {
		assertEquals("400", "CD", RomanNumerals.arabicToRoman(400));
	}
	
	@Test
	public void fiveHundred() {
		assertEquals("500", "D", RomanNumerals.arabicToRoman(500));
	}
	
	
}
