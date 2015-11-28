package praks3;

import lib.TextIO;

public class CumLaude {

    public static void main(String[] args) {

        System.out.println("Palun sisesta keskmine hinne.");
        double keskmineHinne = TextIO.getlnDouble();
        
        if (keskmineHinne < 0 || keskmineHinne > 5) {
            System.out.println("Vigane hinne!");
            return;
        }

        System.out.println("Palun sisesta lõputöö hinne.");
        int l6put66 = TextIO.getlnInt();
        
        if (l6put66 < 0 || l6put66 > 5) {
            System.out.println("Vigane hinne!");
            return;
        }

        // && -- loogiline JA
        // || -- loogiline VÕI

        if (keskmineHinne > 4.5 && 5 == l6put66) {
            System.out.println("Jah, saad Cum Laude!");
        } else {
            System.out.println("Ei saa.");
        }
    }
}
