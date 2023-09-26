package day15Stringbuilderaccesmodifierrrrrr;

public class Sb2 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);

        sb1.reverse(); //String i ter çevirdi
        System.out.println(sb1);


        sb1.deleteCharAt(0);//Verilen indexteki karakteri siler
        System.out.println(sb1);

        sb1.delete(0,3);
        System.out.println(sb1);

        sb1.replace(0,4,"1996");//Başlangıç indexi dahil bitiş indexi hariç bir alana yazdırır
        System.out.println(sb1);

        sb1.insert(2,"777");//Ofset verilen değer kadar sayıp sonra ekler
        System.out.println(sb1);

        StringBuilder sb2 =new StringBuilder("Java");
        StringBuilder sb3 =new StringBuilder("Kava");

         int sb4= sb2.compareTo(sb3);//Compareto sözlük mantığı ile çalışır aradaki farkı index ile (sayı) yazdırır
        System.out.println(sb4);









        String st3 = sb2.toString().toUpperCase();//Artık bunu string e cevirdik
        System.out.println(st3);

        StringBuilder newstr = new StringBuilder(st3);//Tekrardan stringi strinbuildere çevirdik
        System.out.println(newstr);










    }



}
