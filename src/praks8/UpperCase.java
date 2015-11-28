package praks8;

public class UpperCase {

	public static void main(String[] args) {
		System.out.println("Sisesta sõna!");
		
		String sona = lib.TextIO.getlnString();
		
		for(int i = 0; i < sona.length(); i++) {
			System.out.printf("%s", sona.toUpperCase().charAt(i));
			if (i != sona.length() - 1) {
					System.out.print("-");
			}
		}

	}

}
