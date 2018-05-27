package romanNumerals;

public class RomanNumerals {

	public static String arabicToRoman(int arabicNumber) {
		StringBuffer romanNumber = new StringBuffer();
		int rest = arabicNumber;
		
		rest = calculateRest(rest, 40, "XL", romanNumber);
		rest = calculateRest(rest, 20, "XX", romanNumber);
		rest = calculateRest(rest, 10, "X", romanNumber);
		rest = calculateRest(rest, 9, "IX", romanNumber);
		rest = calculateRest(rest, 5, "V", romanNumber);
		rest = calculateRest(rest, 4, "IV", romanNumber);

		for(int index = 0 ; index < rest ; index++) {
			romanNumber.append("I");
		}
		
		return romanNumber.toString();
	}
	
	private static int calculateRest(int arabicNumber, int over, String partialRomanNumber, StringBuffer romanNumber) {
		int rest = arabicNumber;
		if (rest >= over) {
			romanNumber.append(partialRomanNumber);
			rest -= over;
		}
		return rest;
	}

}
