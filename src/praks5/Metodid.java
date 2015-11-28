package praks5;

public class Metodid {
	public static int randomRange(int min, int max) {
		return min + (int)(Math.random() * ((max - min) + 1));
	}
	
	public static int kasutajaSisestus(String kysimus, int min, int max) {
		while (true) {
			System.out.print(kysimus);
			int vastus = lib.TextIO.getlnInt();
			if ((vastus >= min) && (vastus <= max)) {
				return vastus;
			} else {
				System.out.printf("[Viga] Siestatud arv %d ei ole vahemikus %d kuni %d %n",
						vastus, min, max);
			}
		}
	}
	
	public static int viskaTaringut() {
		return Metodid.randomRange(1, 6);
		

	}

}
