package sodi; // JUHUARVUDEGA KAHEM’’TMELINE MAATRIKS

import java.util.Scanner;
import java.util.InputMismatchException;

public class KaheM66tmelineMassiiv {

	public static Scanner userInput = new Scanner(System.in);
		
	public static void main(String[] args) {
		int xSize = 0; // rida
		int ySize = 0; // veerg
		System.out.print("Mitu rida on maatriksis? : ");
		
		while(xSize == 0) {
			xSize = getInt();
		}
		System.out.println("Mitu veergu on maatriksis? : ");
		
		while(ySize == 0) {
			ySize = getInt();
		}
		// defineerime kahemııtmelise massiivi
		int[][] matrix = new int[xSize][ySize];
		matrix = juhuslikMatrix(xSize, ySize);
		printMatrix(matrix);
		
		userInput.close(); // sulgeb sk‰nneri objekti
	}
	public static void printMatrix(int[][] massiiv){
		// iga massiivi rea veergude kohta
		for (int x = 0; x < massiiv.length; x++) {
			// iga massiivi veeru elemendi kohta
			for (int y = 0; y < massiiv[x].length; y++) {
				System.out.printf("%2d ", massiiv[x][y]);
			}
			System.out.println();
		}
	}
	// tagastab kahemııtmelise massiivi sisse: xSize ja ySize
	public static int[][] juhuslikMatrix(int xs, int ys) {
		int[][] matrixx = new int[xs][ys];
		// ts¸kkel iga rea veeru kohta
		for (int x = 0; x < xs; x++) {
			// ts¸kkel iga rea veeru elemendi kohta
			for (int y = 0; y < ys; y++) {
				//element saab endale random v‰‰rtuse vahemikus 1 - 99
				matrixx[x][y] = (int) (Math.random() * 100);
			}
		}
		return matrixx;
	}
		
		public static int getInt() {
			int num = 0;
			try {
				num = userInput.nextInt(); 
			} catch (InputMismatchException e) {
				System.out.println("Error! Proovi uuesti! " + e);
				userInput.next(); // t¸hjendab puhvri
			}
			
			return num;
	}

}
