package day16StaticOop;

public class Dog extends Animal {

    public void bark(){
        System.out.println("Dog bark ...");

        Dog d1 = new Dog();

        d1.eat();
        d1.drink();
        d1.bark();

    }


}
