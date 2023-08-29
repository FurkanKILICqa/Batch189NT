package day14constructiondatetime;

public class Car {

    /*
    Constructor nedir?
    Classtan object olusturmamizi saglayan code blacklaridir
    Class olusturdugumuzda java bize otomatik olarak bir constructor verir
    Ama bu constructor gozle gorulmez, gözle gorulmeyen otomatik olarak java tarafindan verilen
    bu constructor lara default constructor denir
    default constructor ===> Car () {}

    siz kendi constructor inizi olusturdugunuz zaman java default constructor i siler

    Constructor nasil olusturulur
    Access Modifier + Class ismi + () + {}

    Method ile Constructor arasindaki fark nedir?
    1)Methodlarda return type olur, constructorlarda olmaz
    2)Methodlar yaptiklari ise gore isimlendirilirler, constructorlar ise her zaman Class ismi ile isimlendirilirler
    3)Methodlar bir aksiyon yapmak icin olusturulur, Constructorlar ise object olusturmak icindir
    4)Method isimleri kucuk harfle baslar, constructor isimleri ise class ismi ile ayni oldugu icin buyuk harf le baslar

    Parametreli constructorlar olusturarak ayni classdan farkli özelliklere sahip objecteler olusturabiliriz

     */

    String make = "Honda";
    String model = "Accord";
    int year =2023;
    boolean hybrid=true;

    public Car(String make, String model, int year, boolean hybrid){

        this.make=make;
        this.model= model;
        this.year= year;
        this.hybrid=hybrid;


    }

    public Car() {

    }

    //Method lar olusturalim
    public void hareket(){
        System.out.println("Honda hizli hareket eder");
    }
    public void dur(){
        System.out.println("Honda guvenli bir sekilde durur");
    }

    @Override
    public String toString() {//Burada to string ile yazdırmamızın sebebi arka planda array çalışmasından dolayıdır ancak böyle yazdırılır
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
