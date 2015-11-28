package kt1;

public class AbsvdeSumma {

	public static void main(String[] args) {
		System.out.println(absvdeSumma (0., 0.));
		System.out.println(absvdeSumma(-3, -2));

	}
	public static double absvdeSumma (double a, double b) {
		return Math.abs(a) + Math.abs(b);
	}
}
