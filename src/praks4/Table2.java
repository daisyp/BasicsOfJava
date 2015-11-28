package praks4;

public class Table2 {

	public static void main(String[] args) {
		System.out.printf("Tabeli suurus: ");
		int x_size = lib.TextIO.getlnInt(); // table size in x direction
		int y_size = x_size; // table size in y direction
		
		// create the table
		// print the first line of the box
		System.out.printf("--");
		for (int x = 0; x <= x_size; x++) {
				System.out.printf("--");
		}
		// print the table contents
		System.out.printf("-%n");
		for (int x = 0; x <= x_size; x++) {
				System.out.printf("| ");
				for (int y = 0; y <= y_size; y++) {
						if (x == y) {
							System.out.printf("x ");
						} else if (y+x == x_size) {
							System.out.printf("x ");
						} else {
							System.out.printf("0 ");
						}
				}
				// we are at the end of the line, start a new one
				System.out.printf("|%n");
		}
		// print the last line of the box
		System.out.printf("--");
		for (int x = 0; x <= x_size; x++) {
			System.out.printf("--");
		}
		System.out.printf("-%n");
	}

}
