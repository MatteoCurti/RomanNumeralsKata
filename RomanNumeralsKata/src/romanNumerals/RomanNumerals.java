package romanNumerals;

public class RomanNumerals {

	public static String arabicToRoman(int arabicNumber) {
		String romanNumber = "";
		if (arabicNumber == 9) {
			romanNumber += "IX";
		}		
		else if (arabicNumber >= 5) {
			romanNumber += "V";
			for(int index = 0 ; index < arabicNumber - 5 ; index++) {
				romanNumber += "I";
			}
		}
		else if (arabicNumber == 4) {
			romanNumber += "IV";
		}
		else {
			for(int index = 0 ; index < arabicNumber ; index++) {
				romanNumber += "I";
			}
		}
		return romanNumber;
	}
	
	

}
