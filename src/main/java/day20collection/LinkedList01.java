package day20collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {

        ArrayList<String> list1= new ArrayList<>();
        List<String> list2= new ArrayList<>();

        //Arraylist ler eleman silme ve eklemede tekrar iddexleme yapmak zorunda olduklarından çok başarısızdırlar

        //Linklist ile eleman ekleme ve silmeyi çok daha rahat yapıyor bu çok daha az yorulyor

        //LinkedListler index kullanmazlar bu yüzden not ekleme ve silme işlemlerinde tekrar işleme yapılmaz
        //Linkedlistlerde node ekleme ve silme islemlerinde sadece pointer lari değişir

        //LinkedListler de aramak için listenin başından başlar sonuna kadar arar bu yüzden bu kouda başarısızlardır



        /*
        1)Arraylistler eleman silme ve eleman eklemede basarisizdirlar
          O yüzden eleman silme ve ekleme islemleri coklukla yapilacaksa Arraylist kullanmak tavsiye edilmez
        2)Linkedlistler index kullanmadiklarindan eleman ekleme ve silmede re-index yapilmasina gerek yoktur
        Buda linkdelistleri eleman ekleme ve silmede cok basarili hale getirir
        3) Arraylistlerde search islemi kolay yapilir, cunku indexler adres gibidir
        4) Linkedlistlerde search islemi zor yapilir cunku linkedlistler index kullanmazlar
        index kullanmayinca herhangi bir elemani bulmak icin en bastan tum elemanlar kontrol edilir buda cok fazla is demektir
         */


        LinkedList<String> list = new LinkedList<>();

        list.add("Mahmut");
        list.add("Ali");
        list.add("Furkan");
        list.add("Kadir");
        list.add("Mahmut");

        System.out.println(list);//[Mehmet, Ahmet, Onur, Kübra, Tuba, Duygu] //Bu bir insortion order dir

        list.add(1,"Zeki");//LinkedListler de eklemek de index ine göre yazılır
        System.out.println(list);

        list.addFirst("Furkan");
        System.out.println(list);


        list.addLast("Kadir");
        System.out.println(list);



        list.remove("Zeki");
        System.out.println(list);

        list.removeFirstOccurrence("Mahmut");//İlk görünümü siler
        System.out.println(list);

        list.removeLastOccurrence("Mahmut");//Son indexi siler
        System.out.println(list);

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns:
        the head of this list, or null if this list is empty

        Retrives : alır geril demek

         */


        System.out.println(list.peek());//Listeki ilk elemanı (nodu) silmeden size verir bir nevi ilk elemanı kopyaladı
        System.out.println(list);

        /*

        Retrieves and removes the head (first element) of this list.
        Returns:
        the head of this list, or null if this list is empty
         */


        System.out.println(list.poll());//İlk elemanı (node) size verir ama listten de siler.
        System.out.println(list);


        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns:
        the head of this list
        Throws:
        NoSuchElementException – if this list is empty

         */
        /*
        Note: peek() ile elemetn() ikiside ilk elemanı size silmeden verir
        peek list boş olduğunda size null verir element ise hata verir
         */

        System.out.println(list.element());
        System.out.println(list);

        /*
        Throws:
        NoSuchElementException – if this list is empty

        Note: pool() ile pop() ikiside ilk elemanı siler ve size verir
        ama pool() list bos olduğunda size null verir , pop() ise hata verir
         */

        System.out.println(list.pop());
        System.out.println(list);

        //Uygun data kullanabilmek için collection ları kullanırız
        //Set dataları tekrarsız olur
        //Yani linkedList diye tanımlayacağız ve ArrayList gibi kullanacağız.
        // Arkaplanda java işini bilir.Java çalışsın mazot yakmıyor ya!!!
        //treeSet ler alfabetik sıraya göre sıralanırlar
        //

    }

}
