package kt1;

/* Koostage Java meetod etteantud täisarvumaatriksi m reamaksimumide massiivi leidmiseks
 * (massiivi i-s element on maatriksi i-nda rea suurima elemendi väärtus). Read võivad olla erineva pikkusega.
 * public static int[] reaMaxid (int[][] m)
 */

public class ReaMaksimumid {

    public static void main (String[] args) {
        int[] res = reaMaxid (new int[][] { {1,2,3}, {4,5,6} }); // {3, 6}
        // YOUR TESTS HERE
    }

    public static int[] reaMaxid (int[][] m) {
        int[] RidadeMaxid = new int[m.length];
        for(int i =0;i<m.length;i++)
        {
            RidadeMaxid[i] = m[i][0];
        }

        for(int i = 0; i< m.length;i++)
        {
            for(int j=0;j<m[i].length;j++)
            {
                if(RidadeMaxid[i] < m[i][j])
                { RidadeMaxid[i] = m[i][j]; }
            }
        }
        return RidadeMaxid;
    }

}
