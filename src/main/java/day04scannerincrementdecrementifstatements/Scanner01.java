package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {


        /*
       Ornek:  Kullanıcıdan i)Adini ve Soyadini ii)Yaşını iii)Boyunu iv)kilosunu v) medeni durumunu girmesini isteyin
               Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın
        */


        String isim = "Furkan";
        String soyIsim = "KILIC";
        byte yas = 27;
        double boy = 1.87;
        double kilo = 100;
        String medeniDurum = "bekar" ;


        Scanner input = new Scanner(System.in);

        System.out.println("Adinizi ve soy adinizi giriniz");


        //nextline() method u kullanıcıdan çok kelimeli string almak için kullanılır


        String fullName = input.nextLine();

        System.out.println("Yasinizi giriniz");

        byte age = input.nextByte();

        System.out.println("Boyunuzu giriniz");

        float height = input.nextFloat();

        System.out.println("kilonuzu giriniz");

        short weight = input.nextShort();

        System.out.println("Medeni durumunuzu giriniz");

        String maritalStatus = input.next(); //Tek kelimelik cevaplar alacağımız durumlar da "next.Short" kullanırız



        System.out.println("fullName = " + fullName);

        System.out.println("age = " + age);

        System.out.println("height = " + height);

        System.out.println("weight = " + weight);

        System.out.println("maritalStatus = " + maritalStatus);







    }

}
