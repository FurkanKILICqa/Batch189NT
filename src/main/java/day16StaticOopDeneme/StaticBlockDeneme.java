package day16StaticOopDeneme;

import java.time.LocalDate;

public class StaticBlockDeneme {


    //Bir variable olusturduğunuzda değer atamazsanız o variableyi initionalite etmeşsiniz demektir

    //!!!!!// double pi;//Bu variableyi oluşturduğumuzda değer atamazsak java kendisi değer atar oda "0" dır.

    //Bazen main method calistirilmadan once variable larin hazir hale getirilmesi gerekebilir
    //bu yuzden static block lar kullanilir
    //static variable lar static blocklar icinde initialize edilirse o classin icinde herseyden once
    //hazir hale getirilmis olur
    //Static block lar herzaman önce çalışır

    static double pi;//Burada variable oluşturduk

    public static int price =1000;

    static {
        System.out.println("Static block 2");
        LocalDate currentDate =LocalDate.now();//Her zaman anlık tarihi verir

        if (currentDate.getMonthValue()==8){//Ma

            price=1000;//Ağustos ayında 1000 TL
        }else {

            price=2000;//Diğer aylarda 2000 TL
        }
        System.out.println(price);

    }


    static {

        pi = 3.14;//Burada atama yaptık yani initialize yaptık
        System.out.println("Static Block 1");
    }


    public static void main(String[] args){

        System.out.println(pi);
        System.out.println("Main method");
    }



}
