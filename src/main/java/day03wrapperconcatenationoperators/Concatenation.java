package day03wrapperconcatenationoperators;

public class Concatenation {

    public static void main(String[] args) {

        //Ornek 1: Bir String ve iki int variable olusturun. String degeri ile int larin toplamini console yazdirin

        String s = "elma";
        int a = 10 ;
        int b =11 ;
        System.out.println(s + a + b); //elma1011

        System.out.println(s + a * b); //elma110

        System.out.println(  s + (a+b)); //elma21

        System.out.println( a + b + s ); //21elma

        System.out.println( a + s + b ); //10elma11

        //java da "+" sembolü iki sayı arasında kullanılırsa toplama işlemi olur
        //Java da "+" sembölü iki String arasında veya bir String ve bir sayi arasinda kullanilirsa concatenation işlemi olur
        //Concatenation işlemlerinde java matematikteki işlem onceliği kullanılır

        /* Matematikte islem onceligi
        1)Once uslu sayilar
        2)Parantez ici islemler
        3)Carpma ve Bolmeler yapilir
        4)Toplama ve cikarmalar yapilir
        5)Ayni oncelikli olanlarda soldan saga baslanir

         */







    }
}
