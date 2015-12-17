package Kodut66;

/**
 * Created by Daisy
 */
public class Input {

    private String aine;
    private int ruum;
    private String date;


    // Annan esialgse väärtuse
    public Input() {
        this.aine = "";
        this.ruum = 0;
        this.date = "";

    }

    public Input(String aine, int ruum, String  date) {
        this.aine = aine;
        this.ruum = ruum;
        this.date = date;

    }



    public String getAine() {
        return aine;
    }

    public void setAine(String aine) {
        this.aine = aine;
    }


    public int getRuum() {
        return ruum;
    }

    public void setRuum(int ruum) {
        this.ruum = ruum;
    }

    public String getDate() {

        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}

