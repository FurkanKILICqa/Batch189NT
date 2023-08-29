package day06switchternarystring;

public class tekrar88 {

    public static void main(String[] args) {



        // Ornek : Bir sayinin mutlak değerini hesaplayan kodu yaziniz.
        //             -4   ==>  -1*4         4==>      0==>0


        int c = 4;

        // condition ? true : false ; bir sayının mutlakmı değilmi olduğunu anlamak için sayının negatif mi pozitifmi
        // olduğuna bakarız

        //c<0 ? true : false ;

        int result = c<0 ? -1*c : c;

        System.out.println(result);

        // Iki sayinin işareti aynı ise bu sayıları çarpın

        // işareti farklı ise "Farklı işaretli sayiları carpmiyorum
        // mesaji veren kodu yaziniz


        int a = 3;

        int b = 13;

        // Condition                                       ? ilk cikti    :      ikinci cikti  ;
        Object result2 =  ( a>0 && b>0 )  || (a<0 && b<0)  ? a * b : "Farklı işaretli sayiları carpmiyorum" ;


        // Object bütün non-primitive data type larının parent i dir yani ortak atasıdır.
        // Objeect class ın atası yoktur





        // Condition                                       ? ilk cikti    :      ikinci cikti  ;

        int num = 7;

        int num2 = 18;


        Object result3 = (num>0 && num2>0)  || (num<0 && num2<0) ?  num * num2 : "Farklı işaretli sayıları çarpmıyorum";

        System.out.println(result3);













































    }




}
