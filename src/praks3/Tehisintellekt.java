package praks3;

import lib.TextIO;

public class Tehisintellekt {

	public static void main(String[] args) {

		System.out.println("Palun sisesta kaks vanust");
		int vanus1 = TextIO.getlnInt();
		int vanus2 = TextIO.getlnInt();
		
		int vanusevahe = Math.abs(vanus1 - vanus2);
		
		if (vanusevahe > 10) {
			System.out.println("Vanusevahe on suurem kui 10");
		} else if (vanusevahe > 5) {
			System.out.println("Vanusevahe on suurem kui 5");
		} else {
			System.out.println("Sobib!");
		}
	}

}
