package day07stringmanipulations;

public class Stringmanipulation04 {

    public static void main(String[] args) {

        /*  Örnek : Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin
           i) Parola Boş olmamalıdır, en az bir karakter icermelidir.
           ii) Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir
           iii) Başında ve sonunda boşluk olmamalıdır.
       */

        //pwd.isEmpty() bir striing eger true verir aksi halde false verir

        String pwd = " ";
        // i) Parola Boş olmamalıdır, en az bir karakter icermelidir.
        // pwd.isEmpty() bir string eger bos ise true verir, aksi halde false verir.
        boolean first = pwd.isEmpty();
        System.out.println(first);

        //isBlank() methodu space karakterleri ve hiclik icin true verir
        //isEmpty() hicbirsey icin true

        // ii) Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı,
        // space harici karakterlerde bulunmalidir
        //isBlank() methodu sadece space iceren stringler icin true verir, space disinda bir character icerirse false verir
        boolean second = pwd.isBlank();
        System.out.println(second);

        // iii) Başında ve sonunda boşluk olmamalıdır.
        boolean third = pwd.trim().equals(pwd);

        System.out.println(third);

        if(first){
            System.out.println("Parola bos birakilamaz !!");
        }

        if(second){
            System.out.println("Parolada bosluk haricinde gorunur karakterlerde bulunmalidir");
        }

        if(!third){
            System.out.println("Parolanin basinda yada sonunda bosluk birakilmamalidir. ");
        }

        /*
        Note:

        String lerin esitliklerini kontrol ederken "==" yerine equals kullaniriz
        cunku == sembolu kullanirsaniz, iki string i karsilastirirken hem adresslerini hemde degerlerini kontrol eder
        eğer her ikiside esit ise esittir der.


        equals() methodu ise iki string i karsilastirirken sadece degerlerine bakar, degerleri ayni ise bu iki string
        esittir der, degerler farkli ise bu iki string farklidir der





         */

























    }

}
