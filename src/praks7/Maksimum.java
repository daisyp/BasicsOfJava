package praks7;

public class Maksimum {

	public static void main(String[] args) {
		int[] oneD = {1,2,3,4,5,6,7};
		int[][] twoD = {{1,2,3},{5,6,7},{8,9,0}};
		System.out.printf("1D massiivi max on %d%n", maksimum(oneD));
		System.out.printf("2D massiivi max on %d%n", maksimum(twoD));

	}

	public static int maksimum(int[] massiiv) {
		int max = 0;
		for(int a : massiiv) {
			if (a > max) {
					max = a;
			}
		}
		return max;
	}
	
	public static int maksimum(int[][] maatriks) {
		int max = 0;
		for(int[] a : maatriks) {
			for(int b : a) {
				if(b > max) {
						max = b;
				}
			}
		}
		return max;
	}
}
