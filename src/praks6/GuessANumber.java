package praks6;

public class GuessANumber {

	public static void main(String[] args) {
		int arv = praks5.Metodid.randomRange(1, 100);
		while(true) {
			System.out.print("Kirjuta arv vahemikus 1 - 100: ");
			int vastus = lib.TextIO.getlnInt();
			if (vastus == arv) {
				System.out.println("Tubli, arvasid arvu ära!");
				return;
			} else if (vastus < arv) {
				System.out.println("Sinu vastus on *väiksem* kui arvuti poolt valitud arv");
			} else if (vastus > arv) {
				System.out.println("Sinu vastus on *suurem* kui arvuti poolt valitud arv");
			}
			System.out.println("Proovi uuesti!");
			
		}

	}

}
