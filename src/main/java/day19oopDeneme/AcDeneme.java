package day19oopDeneme;

public interface AcDeneme {//Interface ler teyzelerdir anne yarılarıdır


    //Buraya abstruct yazmayız çünkü bu bir ınterface dir zaten java bunun abstruct olduğunu biliyor
    //Interfacelerde methodlar kesinlikle abstract tır
    //Interfaceler conread method içermezler dolayısıyla interface içindeki hiç bir şey isteğe bağlı değildir
    //herşey child class lar için mecburidir bu yüzden interface lere "to do list" yani yapılacaklar listesi denir



    void cool();//Bu bir abstract dır yani süslü parantezi olamaz//Burada public yazmamıza gerek yok
                        //Buraya abstruct yazmayız çünkü bu bir ınterface dir zaten java bunun abstruct olduğunu biliyor


    void run();

    //Bu variable public static ve defoulttur

    default void eco (){//Interface lerde conread met oluşturmaya yarar
        System.out.println("Uses gas less");
    }

    int price = 8756;


}
