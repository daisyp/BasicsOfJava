package javafx2;

import java.util.Date;
import java.text.*;
/**
 * Created by Daisy on 28.11.2015.
 */
public class Date_time {

    public static boolean isDateValide(String strDate, String format) {

        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            sdf.setLenient(true);
            sdf.parse(strDate);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString()); // praegune aeg
        System.out.println(1900+date.getYear());

        SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/MM/dd  HH:mm:ss");
        System.out.println(sdf.format(date));

        // convert string to date

        try {
            String strDate = "10/20/1980";
            SimpleDateFormat sdfBirthday = new SimpleDateFormat("MM/dd/yyyy");
            Date birthday = sdfBirthday.parse(strDate);
            SimpleDateFormat sdfBirthday1 = new SimpleDateFormat("MM/dd/yyyy");
            System.out.println(sdfBirthday1.format(birthday));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //check date validation
        if(isDateValide("30/01/1980", "MM/dd/yyyy")) {
            System.out.println("Date is valid");
        } else {
            System.out.println("Date is not valid");
        }


    }
}
