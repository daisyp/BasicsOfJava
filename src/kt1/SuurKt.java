package kt1;

public class SuurKt {

	   public static void main (String[] args) {
		   //Ruutude summa
		   System.out.println ("5 ja -2 ruutude summa on "+ruutudeSumma(5., -2.));
		   System.out.println ("2 ja 1 ruutude summa on "+ruutudeSumma(2., 1.));

		   //Paaris negatiivsed arvud
		   System.out.println ("Kas -2 on negatiivne paaris arv = "+negPaaris(-2));
		   System.out.println ("Kas -1 on negatiivne paaris arv = "+negPaaris(-1));
		   System.out.println ("Kas  4 on negatiivne paaris arv = "+negPaaris(4));
		   
		   //Negatiivsete arvude arv
		   System.out.println ("Massiivis {-1,-2,5,6} on "+negElArv(new int[]{-1,-2,5,6})+" negatiivset arvu");
		   System.out.println ("Massiivis {1,2,5,6} on "+negElArv(new int[]{1,2,5,6})+" negatiivset arvu");
		   
		   //Negatiivsete arvude summa
		   System.out.println ("Massiivis {-1,-2,5,6} on negatiivsete arvude summa "+negSumma(new int[]{-1,-2,5,6}));
		   System.out.println ("Massiivis {1,2,5,6} on negatiivsete arvude summa "+negSumma(new int[]{1,2,5,6}));

		   //Alla keskmiste arvude arv
		   System.out.println ("Massiivis {-1.,-2.,0.,5.,6.} on "+allaKeskmise(new double[]{-1.,-2.,0.,5.,6.})+" alla keskmise arvu");
		   System.out.println ("Massiivis {1.,6.,5.,5.,6.} on "+allaKeskmise(new double[]{1.,6.,5.,5.,6.})+" alla keskmise arvu");

		   //Üle keskmiste arvude arv
		   System.out.println ("Massiivis {-1.,-2.,0.,5.,6.} on üle keskmise "+keskmisestParemaid(new double[]{-1.,-2.,0.,5.,6.})+" arvu");
		   System.out.println ("Massiivis {1.,6.,5.,5.,6.} on üle keskmise "+keskmisestParemaid(new double[]{1.,6.,5.,5.,6.})+" arvu");
		   

	       return;
	   }
	   
	   public static double ruutudeSumma (double a, double b) {
	       return Math.pow(a, 2) + Math.pow(b, 2);
	   }

	   public static boolean negPaaris (int n) {
	       if (n < 0 && n % 2 == 0) return true;
	       return false;      
	   }
	   
	   public static int negElArv (int[] m) {
	       int negatives = 0;
	       
	       for (int number : m) if(number < 0) negatives++;
	       
	       return negatives;   
	   }
	   
	   public static int negSumma (int[] m)
	   {
	       int negSum = 0;
	       
	       for (int number : m) if(number < 0) negSum += number ;
	       
	       return negSum;   
	   }
	   
	   public static int allaKeskmise (double[] d) {
	       int alla = 0;
	       double keskmine = 0;
	       
	       for (double element : d) keskmine += element;
	       keskmine = keskmine / d.length;
	       
	       for (double element : d) if (element < keskmine) alla++;
	       
	       return alla;
	   }	 
	   
	   public static int keskmisestParemaid (double[] d) {
	       int ule = 0;
	       double keskmine = 0;
	       
	       for (double element : d) keskmine += element;
	       keskmine = keskmine / d.length;
	       
	       for (double element : d) if (element > keskmine) ule++;
	       
	       return ule;
	   }

}