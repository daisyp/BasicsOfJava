package kt1;


public class AsendaS2 {

    public static void main (String[] args) {
        String s = "Tere, TUDENG, 1234!";
        String t = asenda (s); // "Tere**TUDENG*******"
        System.out.println (s + " > " + t);
    }

    public static String asenda (String s) {

        String vastus = "";

        for(int i = 0; i < s.length(); i++)
        {
            char taht = s.charAt(i);

            if ( (64 <= taht & taht <= 90) || (97 <= taht & taht <= 122)){

                vastus = vastus + s.charAt(i);
            } else {

                vastus = vastus + "*";
            }

        }
        return vastus;
    }
}
