package kt1;

/*
 * Koostage Java-meetod, mis leiab etteantud massiivi m elementide ruutude summa.
   public static int ruutudeSumma (int[] m)
 */

public class RuutudeSumma {

    public static void main(String[] args) {
        System.out.println(ruutudeSumma(new int[] { 0 }));
        // YOUR TESTS HERE
    }

    public static int ruutudeSumma(int[] m) {
        int summa = 0;
        int arvuRuut = 0;
        for (int i = 0; i < m.length; i++) {
            arvuRuut = m[i] * m[i];
            summa = summa + arvuRuut;
        }
        return summa;
    }

}
