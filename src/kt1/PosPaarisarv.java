package kt1;

public class PosPaarisarv {

	public static void main(String[] args) {
		System.out.println(posPaarisarv(4));

	}
	public static boolean posPaarisarv(int n) {
		if (n > 0 && n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
