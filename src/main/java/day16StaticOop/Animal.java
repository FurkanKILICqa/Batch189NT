package day16StaticOop;

public class Animal {

    /*
    1)Inheritance
    2)Polimorphism
    3)Encapsulation
    4)Abstraction

     */

    //Büyük yapılar hantal oluy yavaş hareket ederler inheritance methodu ile bu sorunu çözeriz
    //Parent class aynı zamanda super de denir "extends"


    //1) Inheritance
    /*
    Ozellikleri bir classtan diger classlara alan bir kavramdir, Mesela ; siz bir class olusturacaksiniz
    ama daha once olusturulmus bir class sizin istediginiz ozelliklerin bir cogunu kapsiyor. o zaman yeni
    olusturdugunuz classi ozelliklerini kullanmak istediginiz class a child yapariz


    1) Inhentiance sayesinde
        a) Code tekrarlarindan kurutuluruz
        b) Code tamiri(maintenance) kolay olur
        c) Child Class'lari daha atomic yapmis oluruz

   2) Bir class'i baska bir classin child class i yapmak icin
   extends keywordunu kullaniriz.
   3) Child class objectleri Parent class tan method ve variable lari kullanabilirler
   4) Parent class objectleri child class dan method ve variable lari kullanamazlar
   5)javada bir class ın sadece 1 tane parent i olabilir, coklu parent a Multiple Inheritance derler
   6)Parentler her classta olabilir


     */

    public void eat(){
        System.out.println("Animals eat..");
    }
    public void drink(){
        System.out.println("Animals drinks..");
    }









}
