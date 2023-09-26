package day18oopDeneme;

public class Cat  extends Animal {

    public void meow(){
        System.out.println("Cats meow..");
    }

    @Override//Override kurallarını java tarafından kontrol edilmesini sağlıyor override onotarion
    // Kodlarımızı daha anlaşılabililir hale getirmek için anotation kullanılır
    public void eat() {
        System.out.println("Cats eat");//Burada yaptığımız şey tamamen animal parentindeki methodu özelleştirmek yani değiştirmektir
    }

    @Override
    public void drink() {
        System.out.println("Cats dirnks...");//İnheritence yi kullanmamızın sebebi
        // paretteki clası daha sade olmasını istediğimiz içindir mimariyi bozmadan aynı methodu özelleştirmek
    }

    @Override
    public Animal create() {
        return new Cat();
    }


    @Override
    public Integer multiply(Integer a, Integer b) {
        return super.multiply(a, b);
    }
}
