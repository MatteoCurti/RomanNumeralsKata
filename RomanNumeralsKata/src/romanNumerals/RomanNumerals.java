package romanNumerals;

public class RomanNumerals {

	public static String arabicToRoman(int arabicNumber) {
		String romanNumber = "";
		
		for(int index = 0 ; index < arabicNumber ; index++) {
			romanNumber += "I";
		}
		
		return romanNumber;
	}

}
