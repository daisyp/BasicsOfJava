package praks4;

public class Table1 {

	public static void main(String[] args) {
		final int x_size = 7; // table size in x direction
		final int y_size = 7; // table size in y direction
		
		// create the table
		for (int x = 0; x <= x_size; x++) {
			for (int y = 0; y <= y_size; y++) {
					if (x == y) {
						System.out.printf("1 ");
					} else {
							System.out.printf("0 ");
					}
			}
		}

	}

}
