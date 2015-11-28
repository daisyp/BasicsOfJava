package praks6;

public class T2ringuPokker {

	public static void main(String[] args) {
		int user_money = 100;
		while (user_money > 0) {
			System.out.printf("Sul on hetkel %d raha%n", user_money);
			int panus = praks5.Metodid.kasutajaSisestus("Sisesta oma panus: ", 0, user_money);
			int vastus = praks5.Metodid.kasutajaSisestus("Vali mis number täringule tuleb: ", 1, 6);
			int taring = praks5.Metodid.viskaTaringut();
			if (taring == vastus) {
				user_money += panus*6;
				System.out.printf("Sa *võitsid* endale %d raha%n", panus*6);
			} else {
				user_money -= panus;
				System.out.printf("Täringule tuli %d, sa *kaotasid* %d raha%n", taring, panus);
			}
		}
		System.out.println("Raha sai otsa, mine koju :)");

	}

}
