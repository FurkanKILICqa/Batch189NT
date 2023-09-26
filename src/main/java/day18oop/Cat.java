package day18oop;

public class Cat  extends Animal {

    public void meow(){
        System.out.println("Cats meow..");
    }

    @Override//Override kurallarını java tarafından kontrol edilmesini sağlıyor
    public void eat() {//İsim ve parametre "()" == signiture yani imzasıdır temsilcisidir
        System.out.println("Cats eat");
    }

    @Override//Bu bir override anotationdur //Overriding eden override eden demektetir
    public void drink() {
        System.out.println("Cats dirnks...");
    }

    @Override
    public Animal create() {//Return type Animal dır.//Buradaki return type yi Cat yapabiliriz çünkü parent ile ilişkilidir child
        return new Cat();//Burayı cat clasında olduğumuz için new cat yaptık
    }


    @Override
    public int add(int a, int b) {//Primitive ler class değil dir Ör: int byte double (küçük harfle yazılan)
        return a+b;
    }


    @Override
    public Integer multiply(Integer a, Integer b) {//Return type ya aynı olur//Wrapperlarda yani
        // Integer veya Long veya Double larda paretn child ilişkisi yoktur onlar Number classın kardeşidir
        //O yüzden override edilemez
        return a*b;
    }


   // public final double circleArea(double r){//Final method Override edilemez değiştirilemez yani
   //     return 3.14*r*r;





}
