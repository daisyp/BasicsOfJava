package praks7;

public class NumbridTagurpidi {

	public static void main(String[] args) {
		int[] numbrid = new int[10];
		
		System.out.printf("Sisesta %d numbrit%n", numbrid.length);
		for (int i = 0; i < numbrid.length; i++) {
			System.out.printf("nr%d: ", i);
			numbrid[i] = lib.TextIO.getlnInt();
		}
		
		System.out.println("Sisestatud numbrid tagurpidi on:");
		for (int i = numbrid.length-1; i >= 0 ; i--) {
			System.out.println(numbrid[i]);
		}
	}

}