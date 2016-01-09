package kt1;

/*
 * Koostage Java meetod etteantud täisarvumaatriksi m reamiinimumide massiivi leidmiseks
 * (massiivi i-s element on maatriksi i-nda rea vähima elemendi väärtus). Read võivad olla erineva pikkusega.
   public static int[] reaMinid (int[][] m)
 */

public class ReaMiinimumid {

    public static void main (String[] args) {
        int[] res = reaMinid (new int[][] { {1,2,3}, {4,5,6} }); // {1, 4}
        // YOUR TESTS HERE
    }

    public static int[] reaMinid (int[][] m) {
        int[] min = new int[m.length];
        for (int l = 0; l < m.length; l++) {
            min[l] = m[l][0];
            for (int i = 0; i < m[l].length; i++) {
                if (min[l] > m[l][i]) {
                    min[l] = m[l][i];
                }
            }
        }
        return min;
    }
}
