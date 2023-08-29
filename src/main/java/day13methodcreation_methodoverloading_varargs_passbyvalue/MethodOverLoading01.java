package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class MethodOverLoading01 {

    public static void main(String[] args) {

        //Overloadin javada aynı isimde farklı işler yapabilen tiplerdir

        //bir method, birden fazla iş yapabilir, girilen parametre sayısı bu methodun hangi method olduğunu belirler

        //Aouto widning Ör: İnt bir sayıyı double a çevirir küçük kutu büyük kutuya girmez !!!

        //Method overloading yaparken isme karısılmaz parametrelere karışılır yani değiştirilir

        //Yer değiştirme data tipleri farklı iken oluşturulur aynı iken depiştirmenin bir anlamı yok

        //Java için ismi ve parametreleri aynı olan methot tamamen aynıdır buna Method Signature denir

        //Üstünde değişiklikler yapılabilen ve herkezin görebildiği objelere static diyoruz bunun tam tersine static denir


        //Altaki maddeleri mutlaka oku
        /*
    1)Method Overloading yaparken method ismi degistirilmez
    2)Method Overloading yaparken parametreler degistirilir
        a) Parametre degistirilirken parametrelerin data typelari degistirilebilir
        b) Parametre degistirilirken parametrelerin data typelari farkli ise yer deegistirilebilir
        c)  Parametre degistirilirken parametrelerin sayisi degistirilebilir
    3) java icin ismi ve parametreleri ayni olan iki method tamamiyla aynidir
       Bu yüzden ismi ve parametre Method Signature olarak adlandirilir

    4) Method overloading olustururken return type i degistirmenin hicbir etkisi yoktur
    5) Method overloading olustururken access modifier i degistirmenin hicbir etkisi yoktur
    6) Method overloading olustururken static veya non-static yapmanin hicbir etkisi yoktur
    7) Method overloading olustururken body i  degistirmenin hicbir etkisi yoktur

    8) private methodlar overload edilebilir
    private olmak baska classlara gidildiginde problem olur, biz overloading ayni classta yapariz

    9) static methodlar overload edilebilir
    overloading yapmak icin method isimini degistirmeden method signature i degistiririz, dolayisiyle method signature degistirildiginde
    yeni bir method olusturmus oluruz bu nedenle static olmasi bir seyi degistirmez

     */

        add(3,5);//Java iki seçenek arasında sizin yerinize seçim yapmaz aptaldır tembedir !!!

    }

    public static void add(int a, int b) {
       System.out.println(a + b);

    }


    public static void add(double a, double b) {
        System.out.println(a + b);

    }

    public static void add(double a, int b){
        System.out.println(a+b);

    }

    public static void add(int a, double b){
        System.out.println(a+b);


    }
    public static void add(int a, int b, int c){
        System.out.println(a+b+c);


    }







}