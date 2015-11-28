package praks2;

import lib.TextIO;

public class T2htedeAsendus {

	public static void main(String[] args) {
		String lugu = "";
		System.out.println("Kirjuta lause ja ma muudan tähti");
		lugu = TextIO.getln();
		
		System.out.printf("\n%s ", lugu.replace("a", "_"));
		

	}

}
