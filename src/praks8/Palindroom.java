package praks8;

public class Palindroom {

	public static void main(String[] args) {
		System.out.print("Kirjuta s�na: ");
		
		String sona = lib.TextIO.getlnString();
		String backwardsSona = new StringBuilder(sona).reverse().toString();
		
		if (sona.equals(backwardsSona)) {
			System.out.println("Tegu on palindroomiga");
		} else {
			System.out.println("No see k�ll palindroom pole");
		}

	}

}
