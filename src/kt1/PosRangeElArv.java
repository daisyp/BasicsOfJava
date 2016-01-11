package kt1;


// Koostage Java-meetod, mis leiab etteantud massiivi m rangelt positiivsete
// elementide arvu.

public class PosRangeElArv {

    public static void main(String[] args) {
        System.out.println(posElArv(new int[] { 0, -2, -4, -2, -7, -4 }));
    }

    public static int posElArv(int[] m) {

        int arve = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] > 0) {
                arve++;
            }
        }

        return arve;
    }
}
