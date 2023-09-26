package day19oopDeneme;

public abstract class CoursesDeneme {

    //Abstruction

    //Objeleri kategorilere oluşturmak için kyullanılır
    //Clhild class ları sadece işçi olarak prent leride sadece patron olarak kullanacaksak abstruction
    //Conread class bugüne kadar oluşturulan normal class lardır
    //Abstract class lara final methodu kullanılamaz çünkü final methodlar override edilemezleer yani değiştirlemwzler
    //abstract methotlar zaten override etmek için yani değiştirmek için kullanırız

    public abstract void dersp();

    public void art (){//Bu bir conread methottur yani badisi olan nornal method //Bu bir zorunlu deers değildir
        //Abstract kullanmadığımız için
        System.out.println("Learn art");

    }

    public abstract void ters();//Bir class ta birden fazla abstract method kullanılabilir









}
