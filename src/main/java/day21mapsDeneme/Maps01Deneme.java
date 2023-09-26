package day21mapsDeneme;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps01Deneme {
    public static void main(String[] args) {

        /*
        1) Maplered sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir
        2) Key kismi tekrarsiz, value kismi tekrarli olabilir
        3) Maplerdeke her bir elemana entry denir, tamamina EntrySet denir
        4) Entryler tekrarsiz oldugu ici EntrySet denilir
        5) Mapler collection degildir, farklı bir yapidir
        6) HashMap ler entry leri rastgele siralar bu yuzden en hizli mapdir.
        HashMasp
        HashTable

        7) HashMapler entrrleri sargele sıralar bu yüzden en hızlı map tir.
        8) // Map in elemanları nı set e koyarız loop lar la kullanmak için
         */


        HashMap<String,Integer> scountryPopulation = new HashMap<>();//Her zaman sol taraf Key sağ taraf Value dir.

        //Map a entry nasıl eklenir
        //HashMap ler !!!!!!  kafasına göre sıralar  !!!!!!!! bu yüzden de daha hızlıdır


        scountryPopulation.put("Germany",80000000);//Map lerde put methodu ile ekleme yapar
        scountryPopulation.put("Italy",30000000);//Map lerde put methodu ile ekleme yapar
        scountryPopulation.put("USE",400000000);//Map lerde put methodu ile ekleme yapar
        scountryPopulation.put("Turkiye",83000000);//Map lerde put methodu ile ekleme yapar
        scountryPopulation.put("Netherland",20000000);//Map lerde put methodu ile ekleme yapar

        System.out.println(scountryPopulation); // !!{Turkiye=83000000, Netherland=20000000, USE=400000000, Italy=30000000, Germany=80000000}

        Integer turkiyePopulation = scountryPopulation.get("Turkiye");// !! 83000000 !!  //Value verir yani üsttekinin nüfusu

        System.out.println(turkiyePopulation);

        // !!! Butün key leri alma yöntemi !!!
        Set<String> keys = scountryPopulation.keySet();// !! [Turkiye, Netherland, USE, Italy, Germany] !!

        System.out.println(keys);

        // !!! Bütün Valueleri alma yöntemi !!!
        Collection<Integer> values = scountryPopulation.values(); // [83000000, 20000000, 400000000, 30000000, 80000000]

        System.out.println(values); // Value leri yani yukarıdaki için nfüsları verir


        //Çoklu dataları kullanılırken foreach kullanılır genelde.
        int sum = 0;

        for ( Integer  w: values) {

            sum = sum + w;

        }

        System.out.println(sum / values.size()); // 122600000 Ülke nüfuslarının ortalaması


        //Looplar mapler ile kullanilamaz, bunun icin entrySet methodunu kullaniriz
        //entrySet() methodu mapteki entry leri kalip halinde  bize Set in icine koyarak verir.
        Set<Map.Entry<String,Integer>> entries1 =  scountryPopulation.entrySet();

        System.out.println(entries1); //[Turkiye=83000000, Netherland=18000000, USA=400000000, Germany=83000000, Albania=3000000]

        //Example 2: countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin
        //toplamini bulunuz.


        int toplam = 0;

        for ( Map.Entry<String,Integer> w:entries1) {

              toplam = toplam + w.getKey().length() + w.getValue();//İlk önce bütün keyleri aldı sonra bütün valueleri aldı ve topladı

        }

        System.out.println(toplam);// 613000032






















    }
}
