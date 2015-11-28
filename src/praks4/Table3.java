package praks4;

public class Table3 {

	public static void main(String[] args) {
		int x_size = 9;
		int y_size = x_size;  // table size in y direction
		
		// Create the table
		System.out.printf("%n");
		for (int x = 0; x <= x_size; x++) {
			for (int y = 0; y <= y_size; y++) {
				if (x+y > 9) {
					System.out.printf("%d ", y+x-10);
				} else {
					System.out.printf("%d ", y+x);
				}
				
			}
			//we are at the end of the line, start a new one
			System.out.printf("%n");
		}

	}

}
