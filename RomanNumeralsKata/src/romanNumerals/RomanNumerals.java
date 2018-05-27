package romanNumerals;

public class RomanNumerals {

	public static String arabicToRoman(int arabicNumber) {
		String romanNumber = "";
		int rest = arabicNumber;
		if (rest >= 10) {
			romanNumber += "X";
			rest -= 10;
		}
		if (rest >= 9) {
			romanNumber += "IX";
			rest -= 9;
		}		
		if (rest >= 5) {
			romanNumber += "V";
			rest -= 5;
		}
		if (rest >= 4) {
			romanNumber += "IV";
			rest =-4;
		}
		for(int index = 0 ; index < rest ; index++) {
			romanNumber += "I";
		}
		return romanNumber;
	}
	

}
