package day16StaticOopDeneme;

import day16StaticOop.Student;

import java.time.LocalDate;

public class stdRunnerDeneme {

    public static void main(String[] args) {
        //Obje oluşturmadan sadece nokta koyarak ulaşabildiğimiz bütün methodlar staticdir
        //stdName static olduğundan ona ulaşmak için obje olusturmadım
        //Static class memberlara ulaşmak sadece class ismini yazmak yeterlidir
        System.out.println(Student.stdName);


        //Burada age non-static olduğundan burada obje oluşturmak zorundayız
        StudentDeneme ali = new StudentDeneme();//Şuan objemiz dünyaya geldi//Bu yaptığımız bir objedir
        System.out.println(ali.age);//Bu bir instance variable çünkü bu age ancan obje oluşturduğumuzda ulaşabiliriz

        System.out.println(ali.yas);//Tekrar bir obje olusturmak gerekmez


        StudentDeneme.staticMethod();
        ali.nonstaticMethod();



    }

}

