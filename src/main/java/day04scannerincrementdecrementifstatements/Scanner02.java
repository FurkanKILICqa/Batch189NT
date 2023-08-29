package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {



        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz


        Scanner input = new Scanner(System.in);
        // ctrl d ile çoğaltırız

        System.out.println("Lütfen iki sayi giriniz");

        double firstNumber = input.nextDouble();

        double secondNumber = input.nextDouble();

        System.out.println("Toplam =" + (firstNumber + secondNumber));
        System.out.println("cikarma =" + (firstNumber - secondNumber));
        System.out.println("carpim =" + (firstNumber * secondNumber));
        System.out.println("bolme =" + (firstNumber / secondNumber));



        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz













    }







}
