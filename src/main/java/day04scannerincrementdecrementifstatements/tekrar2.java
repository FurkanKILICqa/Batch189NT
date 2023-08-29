package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class tekrar2 {

    public static void main(String[] args) {


        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz


        Scanner input = new Scanner(System.in) ;


        System.out.println("lütfen iki tane tam sayı yazın");

        double sayi1 = input.nextDouble();

        double sayi2 = input.nextDouble();


        System.out.println("toplam = " + (sayi1 + sayi2));

        System.out.println("carpma = " + (sayi1 * sayi2));

        System.out.println("cıkartma = " + (sayi1 - sayi2 ) );

        System.out.println("bolme = " + (sayi1 / sayi2 ) );






    }
}
