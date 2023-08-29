package day14constructorsdatime;

import day14constructiondatetime.Car;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba a1 = new Araba("Toyota" , "M4" , 2023,false);

        System.out.println(a1.make = a1.make);
        System.out.println(a1.model = a1.model);
        System.out.println(a1.year = a1.year);
        System.out.println(a1.hybrid = a1.hybrid);

        a1.hareket();
        a1.dur();

        //Bundan sonra birden fazla yazacağız


        Car a2 = new Car("Audi", "R8",2022,true);
        Car a3 = new Car("Honda","Civic",2015,false);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);







    }


}
