package romanNumerals;

public class RomanNumerals {

	public static String arabicToRoman(int arabicNumber) {
		String romanNumber = "";
		if (arabicNumber == 6) {
			romanNumber += "VI";
		}
		else if (arabicNumber == 5) {
			romanNumber += "V";
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
