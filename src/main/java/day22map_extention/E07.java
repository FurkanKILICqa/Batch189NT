package day22map_extention;

public class E07 {
    public static void main(String[] args) {

        /*
    1) throw keywordu bir methodun bodysi icinde istedigimiz yerde istedigimiz kosullar icin istedigimiz kadar Exception
      atmamizi saglar
    2) throw keywordu yazildiktan sonra bir exception class objecti olusturulur
    3) Exception class constructor'inin parantezi icinde  istediginiz Exception mesajini verebilirsiniz
     */

        printAge(63);


        try {
            printAge(-5);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("main method try sonrasi kod calismaya devam etti");



    }
    public static void printAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");//Biz hata verdirttik//new keyword yeni bir obje oluşturur
            //throw keywordu nu istediğimiz kadar kullanabiliriz

        }else {
            System.out.println(age);
        }


    }





}
