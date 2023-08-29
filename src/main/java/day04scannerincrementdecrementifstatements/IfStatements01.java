package day04scannerincrementdecrementifstatements;

public class IfStatements01 {


    public static void main(String[] args) {

        // if Statements
        // Bazı kodları belli şartlara göre aktif edebilmek için kullanılır

        //if Statements
        //bazi kodlarin bazi sartlara gore aktive edebilmek icin if statements kullanilir.

        // if you study hard, you will learn java.   ==> English
        /*

        if (you study hard){
            you will learn java      ====> java
        }
         */

        //Ornek 1:  Sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdirin

        int number = 13;

        if (number > -1 && number < 10) {
            System.out.println("Rakam");
        }



        //Sayi uc basamakli ise ekrana "Sayi üç basamaklidir!" yazdirin.


        int n = 123;

        if(n>99 &&n<1000) {
            System.out.println("Sayi üç basamaklidir");
        }























    }
}
