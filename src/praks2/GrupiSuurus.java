package praks2;

import lib.TextIO;

public class GrupiSuurus {

	public static void main(String[] args) {
		
		// 5 jagada 2-ga on 2 ja j22k on 1
		// %
		// System.out.println(8 % 3);
		
		System.out.println("Sisesta inimeste arv");
		int inimesed = TextIO.getlnInt();
		System.out.println("Sisesta grupi suurus");
		int grupiSuurus = TextIO.getlnInt();
		
		int gruppideArv = inimesed / grupiSuurus;
		System.out.println("Gruppide arv on " + gruppideArv);
		
		int j22k = inimesed % grupiSuurus;
		System.out.println("Inimesi jääb üle " + j22k);
		
	}

}
