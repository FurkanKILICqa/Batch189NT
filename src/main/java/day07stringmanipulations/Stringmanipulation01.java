package day07stringmanipulations;

import java.util.Scanner;

public class Stringmanipulation01 {

    public static void main(String[] args) {

        /*
            Example : Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
                        i)En az 8 character olsun
                        ii)Space characteri password'de olmasin
                        iii)En az bir tane buyuk harf olsun
                        iv)En az bir tane kucuk harf olsun
                        v)En az bir tane rakam olsun
         */
        //String



        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Password unuzu giriniz");

        String pwd = input.nextLine();
        
        boolean lengthControl = pwd.length()>7;//dogrumu yanlismi oldugunu kontrol etmek için boolean kullandık

        System.out.println("lengthControl = " + lengthControl);



        //ii)Space characteri password'de olmasin

        boolean spaceControl = !pwd.contains(" ");

        System.out.println("spaceControl = " + spaceControl);

        boolean upperCaseControl = pwd.replaceAll("[^A-Z]" , "").length()>0;

        System.out.println("upperCaseControl = " + upperCaseControl);
        
        
        boolean leverCaseControl = pwd.replaceAll("[^a-z]" , "").length()>0;

        System.out.println("leverCaseControl = " + leverCaseControl);

        //Üstte yapılan işleme method chain denir
        
        
        boolean Rakam = pwd.replaceAll("[^0-9]" , "").length()>0;

        System.out.println("Rakam = " + Rakam);

        boolean result = lengthControl && spaceControl && upperCaseControl && leverCaseControl && Rakam ;


        if (result){

            System.out.println("Pasaportunuz geçerli");



        }else {

            System.out.println("Pasaportunuz geçersiz");


        }











        
        






















    }




}
