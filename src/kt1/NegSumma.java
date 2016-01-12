package kt1;

//Leida massiivi m negatiivsete elementide summa.

public class NegSumma {

    public static void main (String[] args) {
        System.out.println (negSumma (new int[]{0}));
        // YOUR TESTS HERE
    }

    public static int negSumma (int[] m) {
        int summa = 0;

        for(int d:m)
        {
            if(d<0)
            {
                summa+=d;
            }
        }
        return summa;  // YOUR PROGRAM HERE
    }

    /*
    public static int posSumma (int[] m) {
      int sum = 0;

      for (int i = 0; i < m.length; i++) {
    	  if (m[i] > 0) {
    		  sum += m[i];
    	  }
      }
      return sum;
   }
     */
}
