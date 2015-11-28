package praks6;

import lib.TextIO;

public class TagurpidiS6na {

	public static void main(String[] args) {
			System.out.print("Sisesta mingi sõna: ");
			String vastus = TextIO.getlnString();
			System.out.println(new StringBuilder(vastus).reverse().toString());

	}

}
