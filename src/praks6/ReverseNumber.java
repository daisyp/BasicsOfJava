package praks6;

import lib.TextIO;

public class ReverseNumber {

	public static void main(String[] args) {
		int[] numbrid = new int[10];
		
		System.out.println("Kirjuta 10 numbrit");
		for (int i = 0; i < numbrid.length; i++) {
			System.out.printf("Kirjuta %d. number: ", i+1);
			numbrid[i] = TextIO.getlnInt();
		}
		
		for (int i = numbrid.length; i > 0; i--) {
			System.out.printf("%d ", numbrid[i-1]);
		}

	}

}
