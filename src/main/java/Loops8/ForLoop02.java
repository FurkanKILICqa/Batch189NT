package Loops8;

public class ForLoop02 {

    public static void main(String[] args) {


        //Example 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
        //           "I love Java" ==> "I love J"


        String s = "I love Java";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch=='a'){

                break;



            }


            System.out.print((ch));

        }

        //example 2 :Verilen bir String'de kucuk harfleri console'a yazmayiniz
        //"Pwd12?Ab" ==> P12?A

        System.out.println();

        String s1 = "Pwd12?Ab";

        for (int i = 0; i <s1.length() ; i++) {

            char ch = s1.charAt(i);

            if (ch>='a' && ch <='z'){

                continue;


            }else
 {
                System.out.print(ch);

            }

        }

        //break ile continue arasindaki fark nedir?
        //break switch in disina cikmak icin ve loopu kirmak icin kullanilir.
        //continue ise loop calisirken java bu keywordu okudugunda artirma/azaltma kısmından yoluna devam eder
        //continue loop yaparken bazi kodlari isleme sokmamak icin kullanilir


        //ornek 3 Bir String'i ters ceviren kodu yaziniz
        //"Java" ==> "avaJ"

        System.out.println();

        String t = "Java" ;

        String ters = "";

        for (int i = t.length()-1; i>=0;   i--) {

            ters = ters + t.charAt(i);





        }

        System.out.print(ters);






































    }



}
