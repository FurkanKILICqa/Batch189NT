package day02variables;

import java.util.Scanner;

public class variablesTekrar {
    public static void main(String[] args) {
//Ornek 2: boolean data type'inde emeklimisin sorusu icin bir variable olusturun ve false degerini atayin.

        boolean isFurkanRetired = false ;

        //Ornek 3: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.

        byte furkanYas = 45;

        //Ornek 4: Site nufusu icin bir variable olusturup deger atayiniz.

        short siteNufusu = 2000;

        //Ornek 5: Ulke nufusu icin bir variable olusturup deger atamasi yapiniz

        int nufusUlke = 50000;


        //Ornek 6: iNsan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.


        long insan = 789354793156205L ;


        //Ornek 7: Gomlek fiyati icin bir tane variable olusturun

        float gomlekFiyat = 888.99F;

        //Ornek 8: Hucre agirligi icin bir tane variable olusturun

        double furkanHucreAgirlik = 0.00000000009;


        //Ornek 1: char data type'inda bir ismin ilk harfi olarak bir variable olusturnuz ve bir deger atayiniz.


        char furkaninIlkIsmi = 'f';


        //Ornek 9: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.


        String sinifOgrenci = "ali can";
        /*

        1) primitive ler sadece bizim atadigimiz degeri icerir
        non-primitiveler bizim atadigimiz degeri ve methodlar icerir.

        2) primitiveler kucuk harfle baslar
        non-primitiveler ise buyuk harfle baslar

        3) primitiveleri java uretmistir ve 8 tanedir
        non-primitive leri java ve programcilar uretebilir, sinirsiz sayidadir

        4) primitive ler memory de data typelarina gore sabit boyutta bellek kullanir
        non-primitive ler memory de buyuklugune gore degisen boyutlarda bellek kullanabilir.



                */


        String nufusT = "8000000000000000008888888888888888888888888888880";

        //java primitive data type lara bazı faydalı methodlar ekleyerek yeni bir veri yapisi oluşturmustur
        //Bu yeni yapi "wrapperClass" olarak adlandırılır
        //Primitive:     Char,       boolean, byte, short, int,     long, floot, double
        //Wrapper Class: Character   Boolean, Byte, Short, Integer, Long, Float, Double


        //:primitive int i wrapper Integerre çeviriniz. (Autoboxing)

        int fum = 10;

        Integer ssfum = fum;


        float gomlek = 55.70F;

        Float gomlekFiyatF = gomlek;


        long nufus = 8888888888888L;

        Long insanL = nufus;

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

        String meyve = "armuut";

        long siteNufus = 500000000L;

        long kasabaNufus = 600000004L;


        System.out.println(meyve + siteNufus + kasabaNufus );

        System.out.println(siteNufus + kasabaNufus + meyve);


        System.out.println( (siteNufus + kasabaNufus) +meyve );

        System.out.println(meyve + siteNufus * kasabaNufus );

        /*

        Java da "Logical Operators" AND ve OR islemler "Logical Operator" lardir

        CAY      AND     KAHVE     SONUC
        true     &&      false     false
        false    &&      false     false
        true     &&      true      true
        false    &&      true      true

        Note : AND (&&) isleminden true alabilmek icin her sey true olmalidir
            AND islemi perfectionist tir, bir tane bile false sonucu false yapar

            CAY       OR      KAHVE     SONUC
            true      ||      false     true
            false     ||      true      true
            true      ||      true      true
            false     ||      false     false

            Note :OR (||) isleminde bir tane true sonucu true yapmak icin yeterlidir
            OR isleminde sonucun false olabilmesi icin hersey false olmalidir


           3) NOT operatoru ( ! )  true olani false, false olani true yapar.
        !true  ===> false
        !false ===> true
        !!true ===> true

            ! == olumsuzluk (not, değil )

            4) Comparison (Karsilastirma) Operators
                <,>, <=, >=, == , !=








         */

        boolean first = 5-3 !=5;

        boolean second = 9*5 !=45;

        boolean third = 5+5!=9;

        System.out.println(first && second && third);

        System.out.println(first || second || third);


        //Ornek : byte data type ini int data type ina ceviriniz (Auto Widening)

        byte sayı = 13;
        int rakam = sayı; // (Auto Widening)


        long aslan = 55;
        byte kaplan =(byte)  aslan; //(Explicit Narrowing)


        int okulMevcudu = 100;

        int sinifMevcudu = 23;

        System.out.println(okulMevcudu / sinifMevcudu ); // bu gibi durumlar da eğer küsüratı ile birlikte sonuç almak
        //istersek float, double gibi küsürat lı sayı hesaplayan data type ler kullanmalıyız


        int m = 55;
        double n =6;

        System.out.println(m/n);

        byte c = 15;
        float t = 28.55F;

        System.out.println(c/t);



        //1. adim : Scanner Class'tan object olustur

        Scanner input = new Scanner(System.in);


        //2. adim : Kullaniciya ne istediginize dair mesaj veriniz

        System.out.println("Lütfen yaşınızı giriniz");

        //3. admi : Uygun method'u kullanarak kullanicinin verdigi data yi memory e yerlestiriniz

        byte age = input.nextByte();

        System.out.println(age);
        
        
        
        int kk = 50 ;

        System.out.println("yas = " + kk);



        //yeni practice


        int kfk = 70 ;

        System.out.println("sayi = " + kfk); // soutv





































    }
}
