package praks4;

public class PangaParool {

	public static void main(String[] args) {
		for (int i = 0; i <= 9999; i++) {
			// java string format magic
			// % - start of a format token
			// 04 - add 4 leading zeros
			// d  - type is int
			// % - start of a new format token
			// n - inserts a new line
			System.out.printf("%04d%n", i);
		}

	}

}
