package javafx2;

/**
 * Created by Daisy on 28.11.2015.
 */
public class Kuup2ev {

    private int day;
    private int month;
    private int year;

    public Kuup2ev(int d, int m, int y) {
        day = d;
        month = m;
        year = y;

        System.out.printf("The constructor for this is %s\n", this);

    }

    public String toString() {
        return String.format("%d/%d/%d", day, month, year);
    }
}
