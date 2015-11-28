package praks6;

import lib.TextIO;

public class LiisuHeit {

	public static void main(String[] args) {
		System.out.println("Sisesta 10 nime kellest valitakse lõpus üks");
		String[] nimed = new String[10];
		for (int i = 0; i < 10; i++) {
			System.out.printf("Sisesta %d. nimi: ", i+1);
			nimed[i] = TextIO.getlnString();
		}
		int rand_int = praks5.Metodid.randomRange(0, 9);
		System.out.printf("Liisu on %s%n",nimed[rand_int]);

	}

}
