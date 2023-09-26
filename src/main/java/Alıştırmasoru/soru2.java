package Alıştırmasoru;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {

        /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */


        ArrayList<Integer> sayilar= new ArrayList<>();
        sayilar.add(8);
        sayilar.add(99);
        sayilar.add(87);
        sayilar.add(44);
        sayilar.add(6);
        sayilar.add(2);


        int toplam =0;

        for (int w:sayilar) {

            toplam = toplam + w*w;

        }
        System.out.println(toplam);



        /*
        - Bir kütüphane yönetimi uygulaması geliştiriyorsunuz.
        - Kullanıcılar, kütüphaneye yeni kitap ekleyebilmeli, kitapları sıralayabilmeli ve
        - kitapları kütüphaneden silebilmelidir.
        - Ayrıca, kullanıcılara kütüphaneyi tamamen sıfırlama seçeneği de sunmanız isteniyor.
        */


            ArrayList<String> kutuphane =new ArrayList<>();

            kutuphane.add("Sefiller");
            kutuphane.add("Suç ve Ceza");
            kutuphane.add("Fahrenheit 451");
            kutuphane.add("Dönüşüm");
            kutuphane.add("Dava");
            kutuphane.add("Amerika");


        Scanner input = new Scanner(System.in);














    }


}
