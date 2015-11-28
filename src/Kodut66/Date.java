package Kodut66;


/**
 * Created by Daisy on 28.11.2015.
 */
public class Date {

    private int p2ev;
    private int kuu;
    private int aasta;

    public Date(int y, int m, int d) {
        p2ev = d;
        kuu = m;
        aasta = y;

    }

    public String toString(){
        return (String.format("%d/%d/%d", p2ev, kuu, aasta));
    }
}
