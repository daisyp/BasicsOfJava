package praks8;

public class S6naPikkus {

	public static void main(String[] args) {
		String[] sonad = new String[10];
		
		System.out.println("Sisesta 10 s�na");
		for(int i = 0; i < sonad.length; i++) {
			System.out.printf("%d", i+1);
			sonad[i] = lib.TextIO.getlnString();
		}
		
		System.out.println("Sisestatud s�nad koos nende pikkustega");
		for(String sona : sonad) {
			System.out.printf("%2d - %s%n", sona.length(), sona);
		}

	}

}
