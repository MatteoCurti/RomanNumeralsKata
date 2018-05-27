package romanNumerals;

import java.util.ArrayList;
import java.util.List;

public class AssociationRomanNumerals {
	int number;
	String symbol;
	
	public AssociationRomanNumerals ( int number, String symbol) {
		this.number = number;
		this.symbol = symbol;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public String getSymbol() {
		return this.symbol;
	}
	
	public static List<AssociationRomanNumerals> getAssociation(){
		List<AssociationRomanNumerals> association = new ArrayList<AssociationRomanNumerals>();
		
		association.add(new AssociationRomanNumerals(90, "XC"));
		association.add(new AssociationRomanNumerals(40, "XL"));
		association.add(new AssociationRomanNumerals(20, "XX"));
		association.add(new AssociationRomanNumerals(10, "X"));
		association.add(new AssociationRomanNumerals(9, "IX"));
		association.add(new AssociationRomanNumerals(5, "V"));
		association.add(new AssociationRomanNumerals(4, "IV"));
		association.add(new AssociationRomanNumerals(1, "I"));
		
		return association;
		
	}
	
}