package day02variables;

public class variables01 {
    public static void main(String[] args) {
        //Variable nasil oluşturulur?
        //Data type + variable name + Assignment Operator(Atama operatörü) Variable Değeri + noktalı virgül
        int age = 13;
        System.out.println(age);
        /*
        Java da temelde iki tip data vardır.
        1)Primitive data type :
        Char, boolean, byte, short, int, long, floot, double

        2)non-primitive data type:
        String
         */
        //1) Data Type + Variable name + Assigment Operator(Atama operatoru) + Variable Değeri + noktali virgül//
        //char data type :  2 byte
        //Tek karakterler icin kullanilir. Sayi, sembol yada harf farketmez
        //örneğin ==> A, x, ?, 5
        //Ornek 1: char data type'inda bir ismin ilk harfi olarak bir variable olusturnuz ve bir deger atayiniz.
        // Data Type + Variable name + Assignment Operator(Atama operatoru) + Variable Degeri + noktali virgul
        //Note : char data type inda degerler her zaman tek tirnak icine konulmalidir

        char isminIlkHarfi = 'A' ;

        //boolean data type: 1 bit
        //boolean'lar sadece iki farkli deger alabilir; true(dogru) veya false(yanlis)
        //Ornek 2: boolean data type'inde emeklimisin sorusu icin bir variable olusturun ve false degerini atayin.

        boolean isRetired = false;

        //byte data type :
        //tam sayilar icindir hafizada 1 byte yer kaplar
        //byte: -128 den +127 e (dahil)kadar tamsayi degerleri icin kullanilir
        //Ornek 3: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.

        byte ogrenciyasi = 15 ;

        //short data type:
        //tam sayilar icindir hafizada 2 byte yer kaplar
        //short: -32768 ile 32767 arasindaki tamsayilar icin kullanilir
        //Ornek 4: Site nufusu icin bir variable olusturup deger atayiniz.

        short sitenufus = 2000 ;

        //int data type:
        //tam sayilar icindir hafizada 4 byte yer kaplar
        //int: -2147483648 ile 2147483647 arasindaki sayilar icindir
        //Ornek 5: Ulke nufusu icin bir variable olusturup deger atamasi yapiniz

        int nufus = 1500;

        System.out.println(nufus);
        //long data type:
        //tam sayilar icindir hafizada 8 byte yer kaplar
        //long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir.
        //Ornek 6: iNsan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.

        long cellNumberInHumanBody = 8888888886547L ;

        //Note: Eğer long a atadığınız değer int lerin aralığında ise sonuna L koymanıza gerek yok
        //ama int lerin aralığı disinda ise long olduğunda sonuna L koyarak javaya söylemeliyiz

        //float data type:
        //float: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Fiyatlandirmalar - 12.99)
        //float memory'de 4 byte yer kaplar.
        //Ornek 7: Gomlek fiyati icin bir tane variable olusturun

        float gomlekFiysti = 299.99F;

        //note: float oluşturduğumuzda sonuna f yada F koumalısınız, çünkü java ondalikli sayıları otomatik olarak
        //olarak kabul eder


        // double data type:
        //double memory de 8 byte yer kaplar, virgülden sonra ki rakam daha fazla alir
        //double: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Hucre Agirligi: 0.000000000000112)
        //Ornek 8: Hucre agirligi icin bir tane variable olusturun

        double weightcell = 0.000000000000015;













    }

}

