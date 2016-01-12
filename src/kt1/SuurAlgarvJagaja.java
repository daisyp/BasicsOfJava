package kt1;

/*  On antud positiivne täisarv n. Kirjutada Java meetod, mis leiab n suurima algarvulise jagaja.
		Integer n is positive. Write a Java method to find the greatest primal divisor of n.
	*/


public class SuurAlgarvJagaja {

    public static void main (String[] args) {
        System.out.println (greatestPrimeFactor (1234)); // 617
    }

    public static int greatestPrimeFactor (int n) {


        return 1; // TODO!!! Your code here!
    }

    /*
    public static int greatestPrimeFactor (int n) {
	   for (int i = n; i > 0; i--) {
		   if (isPrime(i) && n%i==0) {
			   return i;
		   }
	   }


	   return 1;
   }

   public static boolean isPrime(int n) {
	    for (int i = 2; i < n; i++) {
	        if (n%i == 0)
	            return false;
	    }
	    return true;
	}
     */
}
