package praks2;

import lib.TextIO;

public class Nimi {

	public static void main(String[] args) {
		String name;
		String vanus;
		
		System.out.print("Sisesta oma nimi pliis ");
		name = TextIO.getlnString();
		
		System.out.println("Tsau, " + name + ", sa selline cutie.");
		
		System.out.println("Akle viitsid vanuse ka öelda v");
		vanus = TextIO.getlnString();
		
		System.out.println("Ooo kui noor, kõigest " + vanus);
		
	}

}
