package praks5;

public class T2ring {

	public static void main(String[] args) {
		int kasutajaTaringud = Metodid.viskaTaringut() + Metodid.viskaTaringut();
		int arvutiTaringud = Metodid.viskaTaringut() + Metodid.viskaTaringut();
		
		System.out.printf("Arvuti viskas %d punkti%nKasutaja viskas %d punkti%n", 
				kasutajaTaringud, arvutiTaringud);
		
		if (kasutajaTaringud > arvutiTaringud) {
			System.out.println("Kasutaja v�itis");
		} else if (kasutajaTaringud < arvutiTaringud) {
			System.out.println("Arvuti v�itis");
		} else if (kasutajaTaringud == arvutiTaringud) {
			System.out.println("Viik");
		} else {
			System.out.println("Seda ei tohiks juhtuda");
		}

	}

}
