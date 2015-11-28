package praks7;

import java.util.ArrayList;
import java.util.Collections;

public class Nimed {

	public static void main(String[] args) {
		ArrayList<String> nimed = new ArrayList<String>();
		
		while(true) {
				System.out.print("Kirjuta nimi: ");
				String nimi = lib.TextIO.getlnString();
				if (nimi.isEmpty()) {
					break;
				}
				nimed.add(nimi);
		}
		// sortimine
		Collections.sort(nimed, null);
		
		System.out.println("Sisestatud nimed on: ");
		for(String nimi : nimed) {
			System.out.println(nimi);
		}

	}

}
