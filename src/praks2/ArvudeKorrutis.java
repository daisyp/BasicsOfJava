package praks2;

import lib.TextIO;

public class ArvudeKorrutis {

	public static void main(String[] args) {
		int arv1, arv2, korrutis;
		System.out.println("Palun sisesta kaks numbrit");
		TextIO.getlnInt();
		
		arv1 = TextIO.getlnInt();
		arv2 = TextIO.getlnInt();
		
		korrutis = arv1 * arv2;
		System.out.println("Nende arvude korrutis on " + korrutis);
		

	}

}
