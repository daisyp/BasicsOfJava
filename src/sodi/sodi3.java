package sodi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class sodi3 {

	public static void main(String[] args) {
		// �raarvamism�ng praks 6 oma 
		// vaja suvalist arvu + kasutajasisestust 
		// kasutajasisestust peab v�rdlema suvalise arvuga
		// seda k�ike peab loopis tegema
		// kui kasutaja arvab nr �ra siis l�ppeb programm
		// vahemik 1-10
		int suvalineArv = (int) (Math.random() * 10);
		
		int kasutajaSisestus = 0;
		
		while (kasutajaSisestus != suvalineArv) {
				kasutajaSisestus = askUser(1, 10);
		}
	}
	
	public static int askUser(int min, int max) {
		Scanner kasutajaSisestusScanner = new Scanner(System.in);
		int sisestus = min-1;
		
		while((sisestus < min) || (sisestus > max)) {
			try {
				sisestus = kasutajaSisestusScanner.nextInt();
				if (sisestus < min) {
					System.out.println("Sisestasid liiga v�ikese arvu!");
				}
				else if (sisestus > max) {
					System.out.println("Sisestasid liiga suure arvu");
				}
			}
			catch(InputMismatchException e) {
				System.out.print("Sinu sisestus ei ole number! ");
				System.out.println(e);
			}
		}
		kasutajaSisestusScanner.close();
		return sisestus;
	}
}
