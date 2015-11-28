package Kodut66;

/**
 * Created by Daisy on 28.11.2015.
 */
public class Input {

    private String t66tyyp;
    private String aine;
    private String toimumiskoht;
    private int ruum;
    private String kuup2ev;

    // Esialgne väärtus
    public Input() {
        this.t66tyyp = "";
        this.aine = "";
        this.toimumiskoht = "";
        this.ruum = 0;
        this.kuup2ev = "";
    }

    public Input(String t66tyyp, String aine, String toimumiskoht, int ruum, String kuup2ev) {
        this.t66tyyp = t66tyyp;
        this.aine = aine;
        this.toimumiskoht = toimumiskoht;
        this.ruum = ruum;
        this.kuup2ev = kuup2ev;

    }

    public String getT66tyyp() {
        return t66tyyp;
    }

    public void setT66tyyp(String t66tyyp) {
        this.t66tyyp = t66tyyp;
    }

    public String getAine() {
        return aine;
    }

    public void setAine(String aine) {
        this.aine = aine;
    }

    public String getToimumiskoht() {
        return toimumiskoht;
    }

    public void setToimumiskoht(String toimumiskoht) {
        this.toimumiskoht = toimumiskoht;
    }

    public int getRuum() {
        return ruum;
    }

    public void setRuum(int ruum) {
        this.ruum = ruum;
    }

    public String getKuup2ev() {
        return kuup2ev;
    }

    public void setKuup2ev(String kuup2ev) {
        this.kuup2ev = kuup2ev;
    }
}
