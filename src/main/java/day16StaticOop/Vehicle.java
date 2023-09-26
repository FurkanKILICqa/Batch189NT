package day16StaticOop;

import day17oop.Car;

public class Vehicle extends Car {

    /*
     1) Child class tan bir objec olusturdugunuzda Constructorlar
     en ustteki parent classtan baslatilarak alta doğru calistirilir


     */
    public Vehicle() {//Bu bir constructer dir

        System.out.println("Vehicle 1");

    }
}
