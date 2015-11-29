package javafx2;

import java.util.Date;

/**
 * Created by Daisy on 28.11.2015.
 */
public class KasutameKuup2ev {

    private String name;
    private Kuup2ev birthday;

    public KasutameKuup2ev(String theName, Kuup2ev theDate) {
        name = theName;
        birthday = theDate;
    }

    public String toString(){
        return String.format("My name is %s, my birthday is %s", name, birthday);
    }



   public static void main(String[] args) {
        Kuup2ev kuup2evObject = new Kuup2ev(3, 2, 2015);
       KasutameKuup2ev kuup2evObject2 = new KasutameKuup2ev("Daisy", kuup2evObject);

       System.out.println(kuup2evObject2);
   }
}
