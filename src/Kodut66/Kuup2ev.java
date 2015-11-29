package Kodut66;


import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

/**
 * Created by Daisy on 29.11.2015.
 */
public class Kuup2ev {

    public static void main(String[] args) {
        Date date2 = new Date();
        String suvDate = "30.11.2015";

        SimpleDateFormat dateAtm = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat suvDate2 = new SimpleDateFormat("dd.MM.yyyy");


        System.out.println(dateAtm.format(date2));

    }
}
