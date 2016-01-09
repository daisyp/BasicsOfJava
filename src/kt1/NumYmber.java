package kt1;

/* On antud positiivne täisarv n. Kirjutada Java meetod, mis leiab täisarvu, mis saadakse n kümnendesituses numbrite järjekorra ümberpööramise teel.
 * public static int inverse  (int n)
 * Example: inverse (1234) == 4321
 */

public class NumYmber {

    public static void main (String[] args) {
        System.out.println (inverse (1234)); // 4321
    }

    public static int inverse (int n) {
        String sisedStr = Integer.toString(n);
        String tulemStr = "";
        for(int i = 0;i<sisedStr.length();i++)
        {
            tulemStr = tulemStr + sisedStr.charAt((sisedStr.length()-1) - i);
        }
        return Integer.parseInt(tulemStr);
    }

}
