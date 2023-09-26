package Depo1;

import java.util.Scanner;

public class UrunTnımlama extends UrunServis{


    static Scanner inp= new Scanner(System.in);

    public UrunTnımlama() {
        super();
    }
    public static Object uruntanımlama(){
        System.out.println("Ürünün ismini giriniz :");
        String name = inp.nextLine().toLowerCase();
        setUrunismi(name);
        System.out.println("Ürün üretici giriniz");
        String uretici = inp.nextLine().toLowerCase();


        return null;
    }
    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getUrunismi() {
        return super.getUrunismi();
    }

    @Override
    public String getUretici() {
        return super.getUretici();
    }

    @Override
    public String getBirim() {
        return super.getBirim();
    }

    @Override
    public String getRaf() {
        return super.getRaf();
    }









}
