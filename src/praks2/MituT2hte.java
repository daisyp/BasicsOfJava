package praks2;

import lib.TextIO;

public class MituT2hte {

	public static void main(String[] args) {
		String nimi;
		
		System.out.println("Sisesta oma nimi: ");
		nimi = TextIO.getlnString();
		
		int nimePikkus = nimi.length();
		System.out.println("Sinu nime pikkus on " + nimePikkus);

	}

}
