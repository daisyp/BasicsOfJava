package sodi;

import java.util.InputMismatchException;
import java.util.Scanner;

// �hem��tmelised massiivid

public class Sodi4 {
	
	public static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		int massiiviSuurus = 0;
		System.out.println("Kui suurt massiivi soovid?");
		// saan kasutaja sisestuse;
		while(massiiviSuurus <= 0) {
			massiiviSuurus = getInt();
		}
		
		int[] massiiv = new int[massiiviSuurus]; // SUURUSE ANNAB KASUTAJA ISE
		
		System.out.println();
		//k�sin kasutaja k�est massiivi elemente
		for(int i = 0; i < massiiviSuurus; i++) {
			System.out.print("Sisesta " + (i + 1) + " number: ");
			while (massiiv[i] == 0) {
				massiiv[i] = getInt();
			}
		}
		System.out.println(); // lisan t�hjad read for ts�klile et ilusam v�lja n�eks
		
		// iga massiivi "massiiv" elemendi "massiiviElement" tee seda;
		for(int massiiviElement : massiiv) { 
			System.out.print(massiiviElement + " ");
		}
		
		userInput.close();
		
	}
	
	public static int getInt() {
		int num = 0;
		// et proge kokku ei jookseks siis 
		try {
			num = userInput.nextInt(); // kindlalt vaja numbrit
		} catch (InputMismatchException e) {
			System.out.println("Error! Proovi uuesti! " + e); // kui sisestatakse tekst mitte arv - siis v�ljastab selle
			userInput.next();
		}
		
		return num;
	}//end of getInt
}//end of Class
