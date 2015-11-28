package massiivid;

public class Massiiv1 {
	public static void main(String[] args) {
		
		int[] mingiMassiiv = {4, 5, 7, 9};
		System.out.println(reaSumma(mingiMassiiv));
		tryki(mingiMassiiv);
		
		int[][] neo = {
				{1, 1, 1, 1, 1},
				{2, 5, 6, 7, 8},
				{1, 1, 1, 1, 1},
				{2, 5, 6, 7, 8},
				{2, 5, 6, 7, 9},
		};
		tryki(neo);
		}
	public static int[] ridadeSummad(int[][] maatriks) {
		int[] summad = new int[maatriks.length];
		for (int i = 0; i < maatriks.length; i++) {
			
		}
		return summad;
	}
	
	public static int reaSumma(int[] rida){
		int summa = 0;
		for (int i : rida) {
			summa += i;
		}
		return summa;
	}
	
	public static void tryki(int[][] maatriks)	{
		System.out.println("Tere olen KAHEMÕÕTMELINE tryki meetod");
		for (int i = 0; i < maatriks.length; i++) {
			tryki(maatriks[i]);
		}
	}
	
	public static void tryki(int[] massiiv) {
		System.out.println("Tere, olen tryki meetod");
		for (int i = 0; i < massiiv.length; i++) {
			System.out.print(massiiv[i] + " ");
		}
		
	}
}
