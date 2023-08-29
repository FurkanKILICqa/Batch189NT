package day12arraylists;

import java.util.Arrays;
import java.util.List;

public class ArrayLists04 {

    public static void main(String[] args) {

        //Bir list oluşturmak için kısa yol

        //List<Integer> list = Arrays.asList(4,5,13,313,353);// Eğer aslist methodunu kullanırsak remuve methodunu kullanamayız
        //Add methodunu da kullanamyaız clear methodunuda kullanamayız
        //Arrays.asList methodunu kullanarak bir list oluşturursanız listin eleman sayisini degiştiren bir sayi kullanamazsınız
        //Ör: remove() , add() , clear() ama set() , size() kullanabilirsiniz
        //Array methodu şeklinde çalışır yani sayısını değiştiremeyiz silemeyiz veya ekleyemeyiz

        //Bir list olusturmak icin kısa yol
        List <Integer> list = Arrays.asList(4,5,13,313,353);
        System.out.println(list);//[4, 5, 13, 313, 353]

        // list.remove(0);
        // list.add(63);
        // list.clear();

        /*
        Note : Arrays.asList() methodunu kullanarak bir list olusturursaniz
        listin eleman sayisini degistiren methodlari kullanamazsiniz
        //ornegin remove(), add(), clear() kullanilmaz
        ama set() kullanabilirsiniz

         */
        list.set(1,63);
        System.out.println(list.size());//
        System.out.println(list);

        //Biz eğerki sayısı bellei olan elemanlar la çalıcakasam ve List in imkanlarında da faydalanmak istiyorsak bu
        //şekilde kullanırız


































































    }
}
