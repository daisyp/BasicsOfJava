package sodi;

public class Sodi1 {
	
	public static void main(String[] args) {
		int arv = 5;
		boolean jagub = t6ev22rtus(arv); 
		System.out.println(jagub);

	}
	public static boolean t6ev22rtus(int a){ // int a ainult siin meetodis
		boolean jagub = false; // muutujal algv��rtus olemas, antud juhul pole v�ga vajalik
		if(a%2 == 0){
			jagub = true;
		}
		else {
			jagub = false;
		}
		return jagub;
	}
}
