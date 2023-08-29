package day02variables;

public class Variables02 {
    //non-primitive Data Type

    public static void main(String[] args) {

        //Ornek 9: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.
        //String oluştururken yüklenmek istenen değer her zaman " " içine kunlmalıdır.

        String ogrenciadi = "ali can" ;

        int age = 7;

        //String ler için defoult yani varsayılan değer null dır
        //Null: Null demek 0 demek değildir 0 da koding te bir değer dir
        // null demek hiçlik demektir
        //içinde variable veya method bulunmayan bos bir obje demektir

        /*
        interviev sorusu?
        primitive ve non-primitive data typelari arasındaki fark nedir?
        1)primitiveler sadece bizim atadığımız değeri içerir
        non-primitiveler bizim atadığımız değeri ve methodlar içerir.

        2)primitive ler küçük harfle başlar, non-primitive ler ise büyük harfle başlar

        3)primitiveleri java üretmiştir ve sayısı bellidir 8 tanedir
        non-primitive leri java ve programcılar üretebilir

       4)primitive ler memory de data typelarina gore sabit boyutta bellek kullanir
         non-primitive ler memory de buyuklugune gore degisen boyutlarda bellek kullanabilir.

         */

        String ogrencinot = "78";
        byte note1 = 60;
        byte note2 = 70 ;

        System.out.println(note1+note2);







    }



}
