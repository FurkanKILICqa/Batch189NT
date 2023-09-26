package day15Stringbuilderaccesmodifierrrrrr;

public class Sb01 {
    public static void main(String[] args) {


 /*
        1) "StringBuilder" classi da String ureten bir classtir.
        2) String class kullanarak String üretiriz, java nicin StringBuilder classi da olusturdu?
            String class "immutable" (degistirilemez) string uretir, StringBuilder Class "mutable"(degistirilebilir) string üretir.
        3) "immutable" olmak demek orjinal degerin korunmasi, değistirilemez olmasi demektir
            "mutable" olmak demek orjinal degerin değistirilebilir olmasi demektir
         */

        //Immutable
        String s = "Java";
        String t = s + "!";
        String w = t + "?";

        /*
        String i degistirdikten sonra ayni stringe assign ederseniz java yine yeni bir container olusturur
        degismis degeri bu yeni containerin icine koyar ve eski container i gosteren pointer yeni container a yonlendirilir
        dolayisiyla eski container adressiz kalir ve "Garbage Collector" adressiz olan containerlari siler
         */
        String a = "Money";
        a = a + "  More";



        StringBuilder sb1 = new StringBuilder("Phyton");
        sb1.append(555);
        System.out.println(sb1);

        String c = "money";
        c = c + "more";
        System.out.println(c);//Burada java money kelimesini siler altında assine ettiğimiz ile değiştirir "money more" olur


        StringBuilder sb2 = new StringBuilder();


        System.out.println(sb2.capacity());// 16
        System.out.println(sb2.length());// 0


        sb2.append("Java");
        sb2.append("xxxxxxxxxxxxxxxxxxxxxxxx");

        System.out.println(sb2.length());// 4 //28
        System.out.println(sb2.capacity());// 16 //34

        // Eğer 16 indexten fazla sayı rirersek ek olarak 16 + 2 hak daha verir her zaman.

        StringBuilder sb3 = new StringBuilder(3);//Üç kişilik koltuk
        sb3.append("ali");
        System.out.println(sb3);

















    }
}
