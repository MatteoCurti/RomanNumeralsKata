package testRomanNumerals;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import RomanNumerals.RomanNumerals;

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
	
	@Test
	public void nineHundred() {
		assertEquals("900", "CM", RomanNumerals.arabicToRoman(900));
	}
	
	@Test
	public void oneThousand() {
		assertEquals("1000", "M", RomanNumerals.arabicToRoman(1000));
	}
	
	@Test
	public void mixArabicToRoman() {
		assertEquals("1223", "MCCXXIII", RomanNumerals.arabicToRoman(1223));
		assertEquals("1999", "MCMXCIX", RomanNumerals.arabicToRoman(1999));
		assertEquals("2781", "MMDCCLXXXI", RomanNumerals.arabicToRoman(2781));
		assertEquals("4567", "MMMMDLXVII", RomanNumerals.arabicToRoman(4567));
		assertEquals("321", "CCCXXI", RomanNumerals.arabicToRoman(321));
		assertEquals("3266", "MMMCCLXVI", RomanNumerals.arabicToRoman(3266));
		assertEquals("1211", "MCCXI", RomanNumerals.arabicToRoman(1211));
		assertEquals("4321", "MMMMCCCXXI", RomanNumerals.arabicToRoman(4321));
		assertEquals("4789", "MMMMDCCLXXXIX", RomanNumerals.arabicToRoman(4789));
		assertEquals("1207", "MCCVII", RomanNumerals.arabicToRoman(1207));	
	}
	
	@Test
	public void zero() {
		assertEquals("0", "", RomanNumerals.arabicToRoman(0));
	}
	
	@Test
	public void negative() {
		assertEquals("-987654321", "", RomanNumerals.arabicToRoman(-987654321));
	}
	
	@Test
	public void possibleLimitCase() {
		assertEquals("39", "XXXIX", RomanNumerals.arabicToRoman(39));		
		assertEquals("999", "CMXCIX", RomanNumerals.arabicToRoman(999));	
		assertEquals("1066", "MLXVI", RomanNumerals.arabicToRoman(1066));
		assertEquals("1903", "MCMIII", RomanNumerals.arabicToRoman(1903));
		assertEquals("1954", "MCMLIV", RomanNumerals.arabicToRoman(1954));
		assertEquals("1989", "MCMLXXXIX", RomanNumerals.arabicToRoman(1989));
		assertEquals("1990", "MCMXC", RomanNumerals.arabicToRoman(1990));
		assertEquals("1999", "MCMXCIX", RomanNumerals.arabicToRoman(1999));
		assertEquals("2014", "MMXIV", RomanNumerals.arabicToRoman(2014));
		assertEquals("2751", "MMDCCLI", RomanNumerals.arabicToRoman(2751));
		assertEquals("3999", "MMMCMXCIX", RomanNumerals.arabicToRoman(3999));
	}
	
	@Test
	public void overFourThousand() {
		assertEquals("4000", "MMMM", RomanNumerals.arabicToRoman(4000));
		assertEquals("5000", "MMMMM", RomanNumerals.arabicToRoman(5000));
		assertEquals("6000", "MMMMMM", RomanNumerals.arabicToRoman(6000));
	}
	
	
		
}
