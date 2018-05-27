package romanNumerals;

import java.util.List;

public class RomanNumerals {
	
	public static final List<AssociationRomanNumerals> association = AssociationRomanNumerals.getAssociation();
	
	public static String arabicToRoman(int arabicNumber) {
		StringBuffer romanNumber = new StringBuffer();
		int rest = arabicNumber;
		for(int index = 0 ; index < association.size() ; index++) {
			rest = calculateRest(rest, association.get(index).getNumber(), association.get(index).getSymbol(), romanNumber);
		}
		
		return romanNumber.toString();
	}
	
	private static int calculateRest(int arabicNumber, int over, String partialRomanNumber, StringBuffer romanNumber) {
		int rest = arabicNumber;
		
		while (rest >= over) {
		    romanNumber.append(partialRomanNumber);
		    rest -= over;
		  }

		return rest;
	}

}
