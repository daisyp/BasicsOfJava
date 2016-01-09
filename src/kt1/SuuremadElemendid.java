package kt1;

//Esimene ülesanne;
//Koostage Java meetod, mis leiab etteantud reaalarvude massiivi d
// pőhjal niisuguste elementide arvu,
//mis on rangelt suuremad kőigi elementide aritmeetilisest keskmisest (
// aritmeetiline keskmine = summa / elementide_arv).

public class SuuremadElemendid {
    public static void main(String[] args){
        int[] massiiv = new int[10];
        int[] test = new int[]{1,2,3,4,5,6,7,8,9,10};
        //täidan juhuarvudega 0-9
        for (int i = 0; i < massiiv.length; i++){
            massiiv[i] = (int) (Math.random() * 10);
            System.out.print(massiiv[i] + " ");
        }


        //elementide summa leida
        //leida keskmine
        double keskmine = leiaKeskmine(massiiv);
        System.out.println("keskmine: " + keskmine);
        //vőrrelda elemente
        int suuremateArv = suuremKeskmisest(massiiv, keskmine);

        System.out.println("Keskmisest suuremaid elemente: " + suuremateArv);
    }

    public static int suuremKeskmisest(int[] massiiv, double keskmine){
        int hulk = 0;
        for (int i = 0; i < massiiv.length; i++){
            if (massiiv[i] > keskmine){
                hulk++;
            }
        }
        return hulk;
    }

    public static double leiaKeskmine(int[] massiiv){
        double keskmine = 0;
        int elementideSumma = 0;
        //leiame elementide summa
        for (int i = 0; i < massiiv.length; i++){
            //olemasolevale massiivi väärtusele lisan massiiv[i] väärtuse
            elementideSumma += massiiv[i];
        }
        keskmine = elementideSumma / (double)massiiv.length;
        return keskmine;
    }
}
