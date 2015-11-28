package kt1;

public class NegPaaritu {

	public static void main(String[] args) {
		System.out.println(negPaaritu(-2));

	}
	public static boolean negPaaritu(int n) {
		if (n < 0 && n % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}
}
