package day20collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
    public static void main(String[] args) {

        /*
        1)Set ' ler tekrarsız eleman (unique) depolamak için kullanılır
        2) 3 tane Set Class i vardir
            a) Has Set Class
                Hash benzersiz id oluşrturma tekniğidir. Bu tekniğe Hashing tecnique denir
                HasSet elemanları rasgele sıralar
                HasSet elemanları siralamadiğindan çok hızlı çalışır
                HasSetler null i eleman kabul eder

            b) LinkedHashset Class

            LinkedHashsetler elemanları sizin veridiğiniz siraya göre dizdiklerinden(insertion order) Hashsetlere gore yavaş



            c) TreeSet Class
            TreeSet eleamnları natural ordere göre giderler yani alfabetik sıra gibi...
            Bu neden le çok yavaştırlar, en yavaş settir


            3) TreeSet çok yavaş olduğundan mumkün olduğu kadar kullanmamalıyız




         */

        HashSet<String> hs = new HashSet<>();//Elemanları tekrarsız olarak tutacağımız metmod

        hs.add("Sinan");
        hs.add("Kerem");
        hs.add("Tuba");
        hs.add("Onur");
        System.out.println(hs);//Kafasına göre karışık sıralar.

        hs.add("Tuba");
        hs.add(null);
        System.out.println(hs);//Tekrarlı elemanları eklerken hata vermez ama sadece1 kere ekler

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        //LinkedHashSetler Hedset lere göre yavaştır çünkü sizin yazdığınız sırayla yazdırır

        //Elemanları sizin verdiğiniz sıraya göre çizer

        lhs.add(313);
        lhs.add(525);
        lhs.add(888);
        lhs.add(333);
        lhs.add(896);
        System.out.println(lhs);

        hs.retainAll(lhs);
        System.out.println(hs);
        System.out.println(lhs);


        TreeSet<Character> ts = new TreeSet<>();

        ts.add('G');
        ts.add('H');
        ts.add('P');
        ts.add('T');
        ts.add('M');
        //ts.add(null);//Null ı eleman olarak kabul etmezler
        System.out.println(ts);


        System.out.println(ts.subSet('G', 'M'));
        System.out.println(ts);










































    }
}
