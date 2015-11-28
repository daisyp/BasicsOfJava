package praks8;

import java.util.ArrayList;

public class Inimesed {

	public static void main(String[] args) {
		ArrayList<Inimene> inimesed = new ArrayList<Inimene>();
		
		while(true) {
			System.out.print("Kirjuta inimese nimi: ");
			String nimi = lib.TextIO.getlnString();
			if (nimi.isEmpty()) {
				break;
			}
			System.out.print("Kirjuta "+nimi+" vanus: ");
			int vanus = lib.TextIO.getlnInt();
			
			inimesed.add(new Inimene(nimi, vanus));
		}

		for (Inimene inimene : inimesed) {
		    // Java kutsub välja Inimene klassi toString() meetodi
		    System.out.println(inimene);
		}

	}

}

class Inimene {
	String nimi;
	int vanus;
	
	public Inimene(String nimi, int vanus) {
		this.nimi = nimi;
		this.vanus = vanus;
	}
	
	public String toString() {
		return "nimi: " + this.nimi + ", vanus: " + this.vanus;
	}
}
