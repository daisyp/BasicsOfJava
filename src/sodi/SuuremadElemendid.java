package sodi;

//Esimene �lesanne;
//Koostage Java meetod; mis leiab etteantud reaalarvude massiivi d
//p�hjal niisuguste elementide arvu,
//mis on rangelt suuremad k�igi elementide aritmeetilisest keskmisest 
//aritmeetiline keskmine = summa / elementide_arv

public class SuuremadElemendid {
	public static void main(String[] args) {
		int[] massiiv = new int[10];
		int[] test = new int[]{1,2,3,4,5,6,7,8,9,10};
		//t�idan juhuarvudega 0-9
		for(int i = 0; i < massiiv.length; i++) {
			massiiv[i] = (int) (Math.random() * 10);
			System.out.print(massiiv[i] + " ");
		}
		// leida elementide summa
		// leida keskmine 
		double keskmine = leiaKeskmine(massiiv);
		// v�rrelda elemente
		int suuremateArv = suuremKeskmisest(massiiv, keskmine);
		
		System.out.println("Keskmisest suuremaid elemente: " + suuremateArv);
	}
	
	public static int suuremKeskmisest(int[] massiiv, double keskmine) {
		int hulk = 0;
		for(int i = 0; i < massiiv.length; i++){
			if(massiiv[i] > keskmine) {
				hulk++;
			}
		}
		return hulk;
	}
	
	public static double leiaKeskmine(int[] massiiv) {
		double keskmine = 0;
		double elementideSumma = 0;
		for (int i = 0;i < massiiv.length; i++) {
			//olemasolevale massiivi v��rtusele lisan massiiv[i] v��rtus
			elementideSumma += massiiv[i];
		}
		keskmine = elementideSumma / massiiv.length;
		return keskmine;
	}

}
