package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class tekrar {

    public static void main(String[] args) {


       // Kullanıcıdan i)Adini ve Soyadini ii)Yaşını iii)Boyunu iv)kilosunu v) medeni durumunu girmesini isteyin
        //Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın


        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen adınızı ve soy adınızı giriniz");

        String fullName = input.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");

        byte yas = input.nextByte();

        System.out.println("Lütfen boyunuzu giriniz");

        float boy = input.nextFloat();

        System.out.println("Lütfen kilonuzu giriniz");

        double kilo = input.nextDouble();

        System.out.println("Lütfen medeni durumunuzu giriniz");

        String medeniDurum = input.next();

        System.out.println("fullName = " + fullName);

        System.out.println("yas = " + yas);

        System.out.println("boy = " + boy);

        System.out.println("kilo = " + kilo);

        System.out.println("medeniDurum = " + medeniDurum);


















    }
}
