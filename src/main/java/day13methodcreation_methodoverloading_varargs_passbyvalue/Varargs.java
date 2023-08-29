package day13methodcreation_methodoverloading_varargs_passbyvalue;

import java.util.ArrayList;

public class Varargs {

    public static void main(String[] args) {

        //Vararks arka planda array çalıştırır

        //Javada kullanılamayan kod hata verir buna unused denir


        //1) Bir method parantezinde birden fazla varargs kullanilmaz
        //2) Bir method parantezinde birden fazla parametre kullanilacaksa Varargs en sonda olmalidir


        //Java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
        //Bu yapiya Varargs diyoruz
        //Varargs arka planda Array yapisini kullanir

        int result = toplamaYap(1,2,8,88,9);

        System.out.println(result);

    }

    public static int toplamaYap(int... a){//Bu bir vararks dır//Birden fazla variable kullanamayız eğer başına normal sonuna vararks
        //koyarsak olur ÖR: int b, int...a) Bu şeikde olur eğer birden fazla kullanacaksak

        int sum = 0;

        for ( int w : a) {//Burada birden çok işlem yapacağımız için forloop kullandık
            sum = sum + w;

        }
        return sum;

    }







}

