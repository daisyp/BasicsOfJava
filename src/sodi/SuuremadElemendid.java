package sodi;

//Esimene ülesanne;
//Koostage Java meetod; mis leiab etteantud reaalarvude massiivi d
//põhjal niisuguste elementide arvu,
//mis on rangelt suuremad kõigi elementide aritmeetilisest keskmisest 
//aritmeetiline keskmine = summa / elementide_arv

public class SuuremadElemendid {
	public static void main(String[] args) {
		int[] massiiv = new int[10];
		int[] test = new int[]{1,2,3,4,5,6,7,8,9,10};
		//täidan juhuarvudega 0-9
		for(int i = 0; i < massiiv.length; i++) {
			massiiv[i] = (int) (Math.random() * 10);
			System.out.print(massiiv[i] + " ");
		}
		// leida elementide summa
		// leida keskmine 
		double keskmine = leiaKeskmine(massiiv);
		// võrrelda elemente
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
			//olemasolevale massiivi väärtusele lisan massiiv[i] väärtus
			elementideSumma += massiiv[i];
		}
		keskmine = elementideSumma / massiiv.length;
		return keskmine;
	}

}
