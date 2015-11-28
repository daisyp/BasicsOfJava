package praks6;

public class Sum {

	public static int summa(int[] massiiv) {
	    int sum = 0;
	    for (int i = 0; i < massiiv.length; i++) {
			sum += massiiv[i];
		}
	    return sum;
	}

	public static void main(String[] args) {
	    // sedasi saab meetodi välja kutsuda
	    int summa = summa(new int[] {4, 3, 1, 7, -1});
	    System.out.println(summa);
		

	}

}
