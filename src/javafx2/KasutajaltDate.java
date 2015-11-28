package javafx2;


/**
 * Created by Daisy on 28.11.2015.
 */
public class KasutajaltDate {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int h, int m, int s) {
        hour = ((h>= 0 && h<24) ? h : 0);
        minute = ((m>= 0 && m<60) ? m : 0);
        second = ((s>= 0 && s<60) ? s : 0);

    }

    public String toMilitary() {
        return String.format("%O2d:%O2d:&O2d", hour, minute, second);
    }
}
