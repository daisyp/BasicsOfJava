package praks5;

public class Kuup {

	public static void main(String[] args) {
		System.out.print("Sisesta arv: ");
		int arv = lib.TextIO.getlnInt();
		int arvkuubis = kuup(arv);
		System.out.printf("Arvu %d kuup on %d", arv, arvkuubis);
	}
	
	public static int kuup(int arv) {
		return (int) Math.pow((double)arv, 3);

	}

}
