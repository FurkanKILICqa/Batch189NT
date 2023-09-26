package day17oop;

public class Cat  extends Animal{

    public void meow(){
        System.out.println("Cats meow..");
    }

    @Override//Override kurallarını java tarafından kontrol edilmesini sağlıyor
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public void drink() {
        System.out.println("Cats dirnks...");
    }
}
