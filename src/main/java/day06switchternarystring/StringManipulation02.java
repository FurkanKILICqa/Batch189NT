package day06switchternarystring;

public class StringManipulation02 {


    public static void main(String[] args) {

        String s = "Learn Java earn money 4400";

        //Ornek 1: "s" String'indeki "money" kelimesini "dollar" kelimesine ceviriniz.


        String s1 = s.replace("money" ,"dollar");

        System.out.println(s1);

        String s2 = s.replace("e","");

        System.out.println(s2); // İstediğimiz karakterleri silmek veya karakter eklemek için "s.replace" kullanırız




        //örnek 4: "s" String'indeki rakam sayisini bulunuz

        //Ornek 3: s Stringindeki tum rakamlari(0, 1, 2, 3, 4, 5, 6, 7, 8, 9) "*" a ceviriniz

        String s3 =   s.replaceAll("[0-9]", "*");
        System.out.println(s3);

        //örnek 4: "s" String'indeki rakam sayisini bulunuz
        int num= s.replaceAll("[^0-9]","").length();

        System.out.println(num);































    }
















}
