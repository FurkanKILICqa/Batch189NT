package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class IfStatements02 {

    public static void main(String[] args) {

        //Example 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");

        int num = input.nextInt();


        if (num % 2 == 0) {

            System.out.println("Çift sayi");

        }

        if (num % 2 != 0) {

            System.out.println("Tek sayi");

        }


        //2. yol
        //if else statements

        if (num%2==0){


            System.out.println("çift sayı");

        }else{
            System.out.println("tek sayı");

        }


















    }
}
