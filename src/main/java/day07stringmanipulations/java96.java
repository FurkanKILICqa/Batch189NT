package day07stringmanipulations;

import java.util.Scanner;

public class java96 {

    public static void main(String[] args) {



        /*
        Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
        i)En az 8 character olsun
        ii)Space characteri password'de olmasin
        iii)En az bir tane buyuk harf olsun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane rakam olsun

         */


        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen şifrenizi giriniz");

        String pwd = input.nextLine();

        boolean lengthControl = pwd.length()>7;

        System.out.println("lengthControl = " + lengthControl);

        //ii)Space characteri password'de olmasin
        
        boolean spaceControl = !pwd.contains(" ");

        System.out.println("spaceControl = " + spaceControl);


        //iii)En az bir tane buyuk harf olsun
        
        boolean upperCaseControl = pwd.replaceAll("[^A-Z]", "").length()>0;

        System.out.println("upperCaseControl = " + upperCaseControl);
        


        



















    }



}
