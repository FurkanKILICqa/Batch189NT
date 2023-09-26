package day27lambdaDeneme;

import day26lambda.Course;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaDeneme {


    public static void main(String[] args) {

        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        List<Course> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        //2) Tum course object'lerini average score'a gore kucukten buyuge diziniz ve ilk ikisi haric liste halinde console'a yazdiriniz.


        List<Course> myList = coursesList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
                skip(2).collect(Collectors.toList());

        System.out.println(myList);


        //3)Tum course object'lerini average score'a gore kucukten buyuge diziniz
        // ve ilk ucunu liste halinde console'a yazdiriniz.


       List<Course> limit = coursesList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
               limit(3).
               collect(Collectors.toList());

        System.out.println(limit);


        // 4) Kursta bulunan ogrenci sayilarina gore buyukten kucuge sirali bir sekilde listin icinde  veren  kodu yaziniz.

        System.out.println(coursesList.
                stream().
                sorted(Comparator.comparing(Course::getNumOfStudents).reversed()).
                collect(Collectors.toList()));

        //5) kursta bulunan ingilizce bolumlerinin sayisini veren kodu yaziniz


        long ingilizceBobumSayisi = coursesList.
                stream().
                filter(t->t.getSourseName().
                contains("English")).
                count();//Burada eleman sayısını hesaplar // result == 2 //Long return eder

        System.out.println(ingilizceBobumSayisi);

        //6)Ogrenci sayisi 140 tan az olan kurslari bir liste halinde veren kodu yaziniz

        System.out.println(coursesList.
                stream().
                filter(t -> t.getNumOfStudents() < 140).
                collect(Collectors.toList()));















    }
}
