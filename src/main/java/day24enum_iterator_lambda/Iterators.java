package day24enum_iterator_lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators {//Tekrarlacıyıxı demek

    public static void main(String[] args) {

         /*
        1) Iterator lar loop larin yaptigi ayni isi yapar
        2) Iterator larda sonsuz loop olusma ihtimali yoktur
        3) Iterator lar ile looplar arasinda performans farki yoktur
        4) Iterator lar bir collectiondan eleman silme ve bir collection daki elemani degistirme konusunda daha basarilidir
        5) iki tip iterator vardir

            a) Iterator :
                Bu sadece eleman silmede kullanilir, eleman eklemek veya elemani degistirmek mumkun degildir

            b) ListIterator:
                Bu eleman silebilir, ekleyebilir ve degistirebilir

            Note==>
                Iterator sadece soldan saga (ilk elemandan son elemana ) calisir
                ListIterator iki yonlu calisabilir
         */


        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Fatma");
        myList.add("Mustafa");

        System.out.println(myList);// [Tom, Jim, Clara, Fatma, Mustafa]

       // hasNext() --> pointer'a senden sonra eleman var mı diye sorar (true , false)
       //         .next() --> pointer'ı bir sonraki elemana taşır ve atladığı elemanı alır
       //         .remove() --> silme işlemi yapıyor
//
       Iterator<String> myItr =  myList.iterator(); // [Tom, Jim, Clara, Fatma, Mustafa] // iterator class adöndürdük

       while (myItr.hasNext()){// hasNext() --> pointer'a senden sonra eleman var mı diye sorar (true , false)

           //next() --> pointer'ı bir sonraki elemana taşır ve atladığı elemanı alır
           myItr.next();



            //remove() --> silme işlemi yapıyor
           myItr.remove();
       }

        System.out.println(myList);


       // LisIterator

        //ListIterator
        List<String> yourList = new ArrayList<>();
        yourList.add("Ali");
        yourList.add("Can");
        yourList.add("Aliye");
        System.out.println(yourList);//[Ali, Can, Aliye]

        ListIterator<String> yourListItr = yourList.listIterator();//[  Ali,     Can,    Aliye]

        while (yourListItr.hasNext()){

            String el=  yourListItr.next();
            yourListItr.set(el+"*");
        }
        System.out.println(yourList);


        List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");
        System.out.println(list3);//[Ali, Can, Aliye]

        List<String> list4 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");
        System.out.println(list4);//[Ali, Can, Aliye]

        ListIterator<String> listItr2= list3.listIterator();//[ Ali,  Can,  Aliye]

        //bu loop pointer i en saga almak icin yazildi
        while (listItr2.hasNext()){
            listItr2.next();
        }
        //elemanlari sondan basa dogru yazdirin
        while (listItr2.hasPrevious()){
            String el=  listItr2.previous();
            System.out.println(el+" <-- ");
        }


































    }

}
