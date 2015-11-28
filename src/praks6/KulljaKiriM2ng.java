package praks6;

public class KulljaKiriM2ng {

	public static void main(String[] args) {
		int user_money = 100;
		while (user_money > 0) {
			System.out.printf("Sul on hetkel %d raha%n", user_money);
			int vastus = praks5.Metodid.kasutajaSisestus("Sisesta oma panus: ", 0, user_money);
			int kull_kiri = praks5.Metodid.randomRange(0, 1);
			if (kull_kiri == 1) {
				user_money += vastus*2;
				System.out.printf("Tuli kiri, sa võitsid %d raha%n", vastus*2);
			} else {
				user_money -= vastus;
				System.out.printf("Tuli kull, sa kaotasid %d raha%n", vastus);
			}
		}
		System.out.println("Raha sai otsa, mine koju :)");

	}

}
