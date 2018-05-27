package romanNumerals;

public class RomanNumerals {

	public static String arabicToRoman(int arabicNumber) {
		String romanNumber = "";
		if(arabicNumber == 1) {
			romanNumber += "I";
		}
		else {
			romanNumber += "II";
		}
		return romanNumber;
	}

}
