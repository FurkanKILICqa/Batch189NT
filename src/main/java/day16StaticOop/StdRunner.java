package day16StaticOop;

public class StdRunner {


    public static void main(String[] args) {
        //stdName static olduğundan ona ulaşmak için obje olusturmadım
        //Static class memberlara ulaşmak sadece class ismini yazmak yeterlidir
        System.out.println(Student.stdName);






        Student ali = new Student();//Burada obje oluşturduk //Bunu bir kere oluştururuz aynı variable için hepsini kapsar
        // Non-Static olduğu için obje olyusturmak zorundayız yoksa burada göremeyiz
        System.out.println(ali.age);
        System.out.println(ali.weight);


        Student.staticMethod();
        ali.nonStaticMethod();







    }

}
