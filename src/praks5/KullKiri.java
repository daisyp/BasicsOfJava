package praks5;

public class KullKiri {

	public static void main(String[] args) {
		System.out.println("Kull või kiri");
		int suva = (int)(Math.random() * 2);
		int vastus = Metodid.kasutajaSisestus("Sisesta arv 0(kiri) või 1(kull): ", 0, 1);
		
		if( vastus == 0) {
			System.out.println("Valisid kiri");
		} else {
			System.out.println("Valisid kull");
		}
		
		if( suva == 0 ) {
			System.out.println("Arvuti valis kiri");
		}
		else {
			System.out.println("Arvuti valis kull");
		}
		
		if( suva == vastus ) {
			System.out.println("Sina võitsid");
		}
		else {
			System.out.println("Sa kaotasid");
		}

	}

}
