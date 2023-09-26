package Alıştırmasoru;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepoUygulamasi {

    private int idCounter = 1000;
    private List<Urun> urunListesi;
    private Map<Integer, String> rafMap;

    public DepoUygulamasi() {
        urunListesi = new ArrayList<>();
        rafMap = new HashMap<>();
    }

    public void urunTanimlama(String isim, String uretici, String birim) {
        int id = idCounter++;
        Urun urun = new Urun(id, isim, uretici, birim);
        urunListesi.add(urun);
    }

    public void urunListele() {
        System.out.println("id\tismi\tureticisi\tmiktari\tbirimi\traf");
        System.out.println("---------------------------------------------");
        for (Urun urun : urunListesi) {
            String raf = rafMap.getOrDefault(urun.getId(), "null");
            System.out.printf("%d\t%s\t%s\t%d\t%s\t%s%n", urun.getId(), urun.getIsim(), urun.getUretici(),
                    urun.getMiktar(), urun.getBirim(), raf);
        }
    }

    public void urunGirisi(int id, int miktar) {
        for (Urun urun : urunListesi) {
            if (urun.getId() == id) {
                urun.setMiktar(urun.getMiktar() + miktar);
                return;
            }
        }
        System.out.println("Belirtilen ID ile bir ürün bulunamadı.");
    }

    public void urunuRafaKoy(int id, String raf) {
        if (rafMap.containsKey(id)) {
            rafMap.replace(id, raf);
        } else {
            System.out.println("Belirtilen ID ile bir ürün bulunamadı.");
        }
    }

    public void urunCikisi(int id, int miktar) {
        for (Urun urun : urunListesi) {
            if (urun.getId() == id) {
                if (urun.getMiktar() >= miktar) {
                    urun.setMiktar(urun.getMiktar() - miktar);
                } else {
                    System.out.println("Ürün stokta yetersiz.");
                }
                return;
            }
        }
        System.out.println("Belirtilen ID ile bir ürün bulunamadı.");
    }

    public static void main(String[] args) {
        DepoUygulamasi depo = new DepoUygulamasi();
        depo.urunTanimlama("un", "hekimoglu", "cuval");

        depo.urunGirisi(1000, 5);
        depo.urunListele();

        depo.urunuRafaKoy(1000, "raf1");
        depo.urunListele();

        depo.urunCikisi(1000, 3);
        depo.urunListele();
    }
}

class Urun {
    private int id;
    private String isim;
    private String uretici;
    private int miktar;
    private String birim;

    public Urun(int id, String isim, String uretici, String birim) {
        this.id = id;
        this.isim = isim;
        this.uretici = uretici;
        this.miktar = 0;
        this.birim = birim;
    }

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public String getUretici() {
        return uretici;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }
}




























