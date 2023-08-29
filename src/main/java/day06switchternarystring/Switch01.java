package day06switchternarystring;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        //Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini
        //           yazdiran kodu yaziniz.
        //           8 ==> August - September - October - November - December


        Scanner input = new Scanner(System.in);

        System.out.println("Başlangıç ayının kacinci ay olduğunu giriniz");

        int numOfMonth = input.nextInt();

        switch (numOfMonth){

            case 1 :
                System.out.println("Jenuary");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7 :
                System.out.println("July");
                break;
            case 8 :
                System.out.println("August");
                break;
            case 9 :
                System.out.println("September");
                break;

            case 10 :
                System.out.println("October");
                break;

            case 11 :
                System.out.println("November");
                break;

            case 12 :
                System.out.println("December");
                break;
            default:
                System.out.println("Geçerli ay numarası giriniz");



                 /*
                Note: switch condition parantezine 1) String, 2)int 3)byte 4) short 5) char kullanabiliriz
                switch condition parantezine 1) long 2)boolean 3) float 4) double kullanilmaz.
                */






























        }





















    }


}
