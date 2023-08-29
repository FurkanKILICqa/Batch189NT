package Loops8;

public class terzar01 {

    public static void main(String[] args) {

        // Ekrana 5 kere "Hi" yazdırınız

        // Başlangıç degeri   ;     Loop calisma sarti    ;     Arttırma / Azaltma (i++ veya i--


        for (int i = 0; i <5; i++) {

            System.out.println("Hi");


        }



        //Example:  11'den 14'e kadar tum tamsayilari ekrana yazdiran kodu yaziniz


        for (int i = 11; i <15 ; i++) {

            System.out.println(i);

        }



        //Example  40'dan 23'e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz

        System.out.println();


        for (int i = 40; i>22 ; i--) {

              if (i % 2 == 0){

                  System.out.println(i);

              }





        }


        //Example 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
        //           "I love Java" ==> "I love J"


        String t = "I love Java";

        String sayi = "";


        for (int i = 0; i <t.length() ; i++) {

            char ch = t.charAt(i);

            if (ch =='a'){


                break;



            }

            System.out.print(ch);




        }































    }

}
