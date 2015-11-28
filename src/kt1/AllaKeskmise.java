package kt1;

public class AllaKeskmise {

	public static void main(String[] args) {
		System.out.println(allaKeskmise (new double[]{1,5,7,9,3}));

	}
	
	public static int allaKeskmise(double[] d) {
		double keskmine = 0;
		int elementideHulk = 0;
		// get average
		for(int i = 0; i < d.length; i++){
			keskmine += d[i];
		}
		keskmine = keskmine / d.length;
		// get count
		for(int i = 0; i < d.length; i++) {
			if (d[i] < keskmine) {
				elementideHulk++;
			}
		}
		System.out.println(keskmine);
		return elementideHulk;
	}
}
