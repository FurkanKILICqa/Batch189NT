package day21maps;

import java.security.Key;
import java.util.*;

public class Maps01 {

    public static void main(String[] args) {

        //Map bir sözlük dür

        //add methodu collectionlarda kullanılır

        /*
        1) Maplered sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir
        2) Key kismi tekrarsiz, value kismi tekrarli olabilir
        3) Maplerdeke her bir elemana entry denir, tamamina EntrySet denir
        4) Entryler tekrarsiz oldugu ici EntrySet denilir
        5) Mapler collection degildir
        6) HashMap ler entry leri rastgele siralar bu yuzden en hizli mapdir.
         */



        HashMap<String,Integer> countryPopulation = new HashMap<>();//Kafasına göre sıralar daha hızlı çalışır

        countryPopulation.put("Germany",83000000);
        countryPopulation.put("Albenia",5000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Turkiye",830000000);
        countryPopulation.put("Netherland",180000000);
        System.out.println(countryPopulation);//{Turkiye=5, Netherland=5, USA=5, Albenia=5, Germany=5}


        Integer gPopulation = countryPopulation.get("Germany");//Valuesini verir yani yukarda sayıyla yazılan yeri sayı olmak zorunda değil
        System.out.println(gPopulation);


        Set<String> keys = countryPopulation.keySet();//Sadece key leri yani stringleri verir
        System.out.println(keys);



       Collection<Integer> values= countryPopulation.values();

        System.out.println(values);//[830000000, 180000000, 400000000, 5000000, 83000000]



        //Example 1: countryPopulation map'indeki ulkelerin nufuslarinin ortalamsi nedir?



        int sum = 0;
        for (Integer w : values) {

            sum = sum +  w;


        }

        System.out.println(sum / values.size());//Collectionun eleman sayısını verir ve böler

        //Map ler loop lar ile kullanılamaz kullanabilek için enty set methodu kullanılır

        /*
        System.out.println(countryPopulation.entrySet());

        Set Set<Map.Entry<String,Integer> > entries = countryPopulation.entrySet();



        //Example 2: countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin
        //toplamini bulunuz.






        int toplam = 0;

        for (Integer w: )  {

        }

         */
        //Looplar mapler ile kullanilamaz, bunun icin entrySet methodunu kullaniriz
        //entrySet() methodu mapteki entry leri kalip halinde  bize Set in icine koyarak verir.
        Set< Map.Entry<String,Integer>  >  entries= countryPopulation.entrySet();
        System.out.println(entries);//[Turkiye=83000000, Netherland=18000000, USA=400000000, Germany=83000000, Albania=3000000]

        //Example 2: countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin
        //toplamini bulunuz.

        int toplam=0;

        for ( Map.Entry<String,Integer>  w: entries  ) {
            toplam = toplam +  w.getKey().length() + w.getValue();
        }
        System.out.println(toplam);








    }

}
