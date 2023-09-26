package day21maps;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {


        HashMap<String,Integer> stdNames =new HashMap<>();

        stdNames.put("Ali" , 18);
        stdNames.put("Can" , 19);
        stdNames.put("Tom" , 33);
        stdNames.put("Veli" , 63);
        stdNames.put("Ahmet" , 41);

        //keyi tekrarli kullandiginizda hata vermez, en son verilen entry nin degerini kabul eder
        stdNames.put("Tom",35);
        System.out.println(stdNames);

        //replace() methodu value lari keyleri kullanarak update etmeye yarar
        stdNames.replace("Tom",39);
        System.out.println(stdNames);

        //replace("Tom",39,41); methodu map icinde key olarak Tom ve Valuesu 39 ise 41 e donusturur
        //aksi halde donusturmez
        stdNames.replace("Tom",39,41);
        System.out.println(stdNames);

        //putIfAbsent("Ayse",77); methodu map te Ayse key olarak yoksa Mape ekler var ise eklemez
        stdNames.putIfAbsent("Ayse",77);
        System.out.println(stdNames);



        //Get ve get or defpoult eğer aranan eleman mapte var ise value lerini verir ikiside aynı işi yapar


        System.out.println(stdNames.get("Tom"));
        System.out.println(stdNames.getOrDefault("Tom", 0));


        System.out.println(stdNames.get("Jerry"));
        System.out.println(stdNames.getOrDefault("Jerry", 0));


        //containsValue() methodu value larin icerisinde aranan deger olup olmadigini kontrol eder
        System.out.println(stdNames.containsValue(19));
        System.out.println(stdNames.containsValue(99));

        //containsKey() methodu key lerin icerisinde aranan deger olup olmadigini kontrol eder
        System.out.println(stdNames.containsKey("TOM"));
        System.out.println(stdNames.containsKey("Tom"));

        //remove("Tom"); methodu key kullanarak entry silmeye yarar
        stdNames.remove("Tom");
        System.out.println(stdNames);

        //remove("Can",19); methodu hem key hemde value u kontrol eder eslesirse siler yoksa silmez
        stdNames.remove("Can",19);
        System.out.println(stdNames);










    }

}
