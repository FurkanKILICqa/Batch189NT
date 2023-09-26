package day21mapsDeneme;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class Maps03Demene {
    public static void main(String[] args) {



        //Example 1: Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        //"I like you, like like!"  => I=1, like=3, you=1


        String s = "I like you, like like!";

        s = s.replaceAll("\\p{Punct}" ,"");//Punct tüm noktalama işaretleri ni siler

        System.out.println(s); // I like you like like



       String words [] =  s.split(" ");//Çoklu data olduğu için array kullanırız

        System.out.println(Arrays.toString(words)); // [I, like, you, like, like]

        HashMap<String,Integer> occ = new HashMap<>();

        // word arrayindeki kelimeler varmı yokmu diye kontrol eder
        //word arrayindeki kelimeler Map de yoksa value olarak
        for ( String w :words) {

            Integer numOfOccurance = occ.get(w);
            if (numOfOccurance==null){

                occ.putIfAbsent(w,1);

            }else {

                occ.replace(w,numOfOccurance+1);
            }

        }

        System.out.println(occ);


        //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        //"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1


        //-----------------------------------------------------------------------------------------------

        /*
        HashMap ile HashTable arasindaki fark nedir?
        1) HashMap thread-safe ve synchronized degildir, HashTable thread-safe ve synchronized dir
        2) HashMap bir tane null key e ve istediginiz kadar null value a musaade eder
           HashTable keylerde ve value larda null kullanilmasina musaade etmez
        3) HashMap hizlidir, HashTable HashMap e gore yavastir

        Note: HashMap ler ve HashTable lar entry leri rastgele siralar
         */




        /*
        HashTable ne zaman kullanmaliyiz?
        1) multithread ve synchronization kullanmamiz gerekirse
        2) key lerde ve value larda null kullanmak yasak ise kullanabiliriz
         */

        Hashtable<String,Integer> ogrenciNot = new Hashtable<>();

        ogrenciNot.put("Ali",18);
        ogrenciNot.put("Can",19);
        ogrenciNot.put("Tom",33);
        ogrenciNot.put("Veli",63);
        //ogrenciNot.put(null,41);

        System.out.println(ogrenciNot);


         /*
        1) Treemap ler entry leri naturalorder a gore siraya koyar, Bu yuzden coook yavastir
        2) Treemap ler  thread-safe ve synchronized degildir,
        3) Treemaplerin key lerinde null kullanilamaz, ama value kisimlarinda istediginiz kadar kullanabilirsiniz
        4) Treemapler key e bakarak siralama yapar
         */

        TreeMap<String,Integer> countryPopulation = new TreeMap<>();

        countryPopulation.put("Germany",83000000);
        countryPopulation.put("Albenia",5000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Turkiye",830000000);
        countryPopulation.put("Netherland",180000000);

        System.out.println(countryPopulation);//Natural ordere göre sıralar




































    }
}
