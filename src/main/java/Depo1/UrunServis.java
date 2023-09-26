package Depo1;

import java.util.ArrayList;
import java.util.List;

public class UrunServis {

   // List<String> urunIsmi = new ArrayList<>();
   // List<String> Id = new ArrayList<>();
   // List<String> urunIsmi = new ArrayList<>();
   // List<String> urunBirimi = new ArrayList<>();

    private int id;

    private String urunismi;

    private String uretici;

    private String birim;

    private String raf;

    public UrunServis(){

    }


    public UrunServis(int id, String urunismi, String uretici, String birim, String raf) {
        this.id = id;
        this.urunismi = urunismi;
        this.uretici = uretici;
        this.birim = birim;
        this.raf = raf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrunismi() {
        return urunismi;
    }

    public static void setUrunismi(String urunismi) {

    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

    @Override
    public String toString() {
        return "UrunServis{" +
                "id=" + id +
                ", urunismi='" + urunismi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", birim='" + birim + '\'' +
                ", raf='" + raf + '\'' +
                '}';
    }
}
