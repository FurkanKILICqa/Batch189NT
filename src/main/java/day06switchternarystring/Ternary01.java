package day06switchternarystring;

import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {

        //Example 1: Bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //           -4 ==> -1*-4        4 ==> 4        0 ==> 0

        int c = -4;

        //condtion  ?  true ise : false ise ;
        int result =   c<0      ?  -1*c     : c ;
        System.out.println(result);


        //Example 2: Iki sayinin isareti ayni ise bu sayilari carpan,
        //isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum"
        // mesaji veren kodu yaziniz.

        //condirion ? true : false


        int a = 13;

        int b = 7;

        Object result2 = (a > 0 && b> 0)  || (a< 0 && b < 0) ? a*b : "Farkli isaretli sayilari carpamiyorum" ;

        System.out.println(result2);

        // Object java da bütün NON- PRİMİTİVE classların ortak babasıdır (Hz.Adem gibidir)

        // Object in babası (parentı) olmayan tek class dır

        // Farklı işaretli sayılar çarpılmaz yani sonuç eksi oluyorsa işlem yapılmaz bu senaryoya göre

        // Farklı data tipleri için ortak bir variable oluşturmak istediğimizde data type olarak object kullanırız





























    }
}
