package day21mapsDeneme;

import java.util.HashMap;

public class Maps02Deneme {
    public static void main(String[] args) {

        HashMap<String,Integer> stdNames =new HashMap<>();

        stdNames.put("Ali" , 18);
        stdNames.put("Can" , 19);
        stdNames.put("Tom" , 33);
        stdNames.put("Can" , 63);
        stdNames.put("Ahmet" , 41);

        //keyi tekrarli kullandiginizda hata vermez, en son verilen entry nin degerini kabul eder
        stdNames.put("Tom",35);
        System.out.println(stdNames);

        //Replace methodu valeuları Key leri kullanarak update etmeye yarar
        stdNames.replace("Can" , 19);
        System.out.println(stdNames);




        //Replace ("Can", 19, 41); methodu map içinde
        stdNames.replace("Can" , 19, 41);
        System.out.println(stdNames);

        //putIfAbsent methodu
        stdNames.putIfAbsent("Ali Can",63);
        System.out.println(stdNames);


        System.out.println(stdNames.get("AliCan"));

        //get methodu aranan key eger mapte var ise value u verir, yok ise null verir
        System.out.println(stdNames.get("AliCan"));//63
        System.out.println(stdNames.get("Alican"));//null

        //getOrDefault() methodu aranan key eger mapte var ise valu u verir yok ise istedigimiz degeri verir
        System.out.println(stdNames.getOrDefault("AliCan", 0));//63
        System.out.println(stdNames.getOrDefault("Alican", 0));//0

        //containsValue() methodu value larin icinde aranan bir degerin olup olmadigni kontrol eder
        System.out.println(stdNames.containsValue(63));
        System.out.println(stdNames.containsValue(163));

        //containsKey() methodu key lerin icinde aranan bir degerin olup olmadigni kontrol eder
        System.out.println(stdNames.containsKey("AliCan"));
        System.out.println(stdNames.containsKey("AliCaN"));

        //remove() methodu key kullanarak entry silmeye yarar
        stdNames.remove("AliCan");
        System.out.println(stdNames);

        //remove("Tom",76); methodu hem key hemde value yu kontrol eder eslesirse siler eslesmez ise silmez
        stdNames.remove("Tom",76);
        System.out.println(stdNames);








































    }
}
