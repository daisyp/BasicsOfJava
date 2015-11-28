package sodi;

public class TranspordiYmber {

	public static void main(String[] args) {
		int xSize = 0; // rida
		int ySize = 0; // veerg
		System.out.print("Mitu rida on maatriksis? : ");
		
		while(xSize == 0) {
			xSize = KaheM66tmelineMassiiv.getInt();
		}
		System.out.println("Mitu veergu on maatriksis? : ");
		
		while(ySize == 0) {
			ySize = KaheM66tmelineMassiiv.getInt();
		}
		//defineeri maatriks
		int[][] maatriks = new int[xSize][ySize];
		maatriks = KaheM66tmelineMassiiv.juhuslikMatrix(xSize, ySize);
		
		KaheM66tmelineMassiiv.printMatrix(maatriks);
		
		int[][] maatriks2 = new int[ySize][xSize];
		
		for (int xs = 0; xs < xSize; xs++ ){
			for (int ys = 0; ys < ySize; ys++){
				maatriks2[ys][xs] = maatriks[xs][ys]; 
			}
		}
		System.out.println();
		KaheM66tmelineMassiiv.printMatrix(maatriks2);
		
		twoMin(maatriks);
	}// end of main method
	
   // kuidas leida massiivist kaks kõige väiksemat arvu
	public static void twoMin(int[][] massiiv) {
		int min1 = Integer.MAX_VALUE; // miinimumid saavad maksimaalse täisarvu väärtuse, mida javas muutuja int saab omada
		int min2 = Integer.MAX_VALUE;
		// iga massiivi rea kohta tee seda:
		for (int[] xs : massiiv) {
			// iga massiivi rea veeru elemendi kohta tee seda:
			for (int ys : xs) {
				if(ys < min1) {
					min1 = ys;
				} else if(ys < min2 && ys != min1) {
					min2 = ys;
				}
				
			}
		}
		System.out.print("Minimaalsed väärtused on " + min1 + " ja " + min2);
	}
}
