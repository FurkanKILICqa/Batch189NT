package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner03 {


    public static void main(String[] args) {


        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //i)Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar
        //ii)Cevresini hesaplayiniz ==> 2*Kisa Kenar + 2*Uzun Kenar


        Scanner input = new Scanner(System.in); // Datayı kullanıcıdan almak için kullanırız

        System.out.println("Dikdörtgenin kısa kenar uzunluğunu giriniz");

        float ShortSide = input.nextFloat();

        System.out.println("Dikdörtgenin uzun kenar uzunluğunu giriniz");

        float longSide = input.nextFloat();

        System.out.println("Alan = " + (ShortSide * longSide));

        System.out.println("Cevre = " + (2*ShortSide + 2*longSide));






























    }
}
