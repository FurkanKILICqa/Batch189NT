package day20collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queuses01 {
    public static void main(String[] args) {

        //First in first out ilk giren ilk çıkar mantık bu


        Queue<String> depo = new LinkedList<>();//LinkList clasından bir tane Q objesi oluşturduk

        depo.add("Sut");
        depo.add("et");
        depo.add("yumurta");
        depo.add("peynir");
        depo.add("peynir");
        System.out.println(depo); // Insertion olarak sıralar Insertion olarak sıralar

        depo.remove(); // Ilk veriyi siler
        System.out.println(depo);

        System.out.println(depo.peek()); //İlk elemanı silmeden verir
        System.out.println(depo);

        depo.clear();
        System.out.println(depo);
        System.out.println(depo.poll());//Depo boştur hata vermez null verir element methodu olsaydı hata verirdi

      //  System.out.println(depo.element());//Exception yani hata verir çünkü depo boşsa poll gibi null vermez

        //System.out.println(depo.peek());//null verir hata vermez (Exception)

        Queue<String> wareHouse = new PriorityQueue<>();//Objeler kalıbının özellikleri ni taşır Priority öncelik demek
        //Verileri ilk başa eklemek çıkartmak için
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Egg");
        wareHouse.add("Orange");
        wareHouse.add("Tomatos");
        System.out.println(wareHouse);

        //Amacımız bir to do list gibidir eğer bir tablo oluşturmak istiyorsay Interface kullanırız List , Queue , Set

        //Double ended queu ==> iki uçlu queue
        //Deque bir interface dir ver interfacelerin consructeri olmaz
        //Fifo ilk giren ilk sisteme alınmalıdır
        //




        //Çift uçlu çalışmak için yani hem baş hem son Queue sadece ilk vardır
        Deque<String> d = new LinkedList<>();//İnsortion order bizim girdiğimiz sıraya göre yerleştirir

        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomatos");

        System.out.println(d);

        //Eğer çokca arama bulma işleme yapmamız gerekiyorsa Arraylist kullanırz

        //Sürekli ekleme yaptığımız işlemlerde LinkedList kullanırız

        //Uniqe dataları depolamak için set methodu kullanırız

        //
















    }


}
