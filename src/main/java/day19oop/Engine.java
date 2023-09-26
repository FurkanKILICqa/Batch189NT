package day19oop;

public interface Engine {

    void run();


    int price =3000;//Bu bir final method dur



    static boolean stop (){//Badisi olan bir methodu bu şekilde koyarız başına ya "static" yazarız yada "defoult" koyarız

        System.out.println("Güvenle durur");
        return false;
    }

}
