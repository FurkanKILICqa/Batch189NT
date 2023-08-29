package day14constructiondatetime;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime01 {


    public static void main(String[] args) {

        LocalDate myCurrentDate = LocalDate.now();//Icinde bulunduğumuz zaman dilimini verir//Herclass aynı zamanda bir data tipidir
        //Bu kod dinamik bir koddur her zaman güncel tarihi verir
        System.out.println(myCurrentDate);

        System.out.println(myCurrentDate.getMonthValue());
        System.out.println(myCurrentDate.getYear());
        System.out.println(myCurrentDate.getDayOfMonth());
        System.out.println(myCurrentDate.getMonth());//Bu bir enum dur
        System.out.println(myCurrentDate.getDayOfWeek());//Bu bir enum dur

        //İleriki tarihe nasıl gidilir?
        System.out.println(myCurrentDate.plusDays(3).plusMonths(2).plusYears(2));


        //Gecmis tarihe nasıl gidilir?
        System.out.println(myCurrentDate.minusYears(1).minusDays(5).minusMonths(9));

        //Spesifik bir tarih objesi nasıl oluşturulur?

       LocalDate date1 =  LocalDate.of(1980,8,10);//İstediğimiz bir tarih objesi oluştururuz
       LocalDate date2 =  LocalDate.of(1990,7,10);//İstediğimiz bir tarih objesi oluştururuz

        System.out.println(date1);


        boolean r1= date1.isBefore(date2);//Date1 in date2 den önce mi sonra mı olduğunu kotrol eder
        System.out.println(r1);

        boolean r2 = date1.isAfter(date2);
        System.out.println(r2);

        boolean r3 = date1.isEqual(date2);//Date1 date2 ye eşitmi diye kontrol eder
        System.out.println(r3);

        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yılı, month and mumber in the given years");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(year, month, day);

        if (givenDate.isBefore(LocalDate.now())){
            System.out.println("Invalid date");//Gecersiz tarih demek

        }else {

            System.out.println("Enter time for the ticket");

        }


        //Example 2: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.

        System.out.println("Please enter youy birthday");
        int year1 = input.nextInt();
        int month1 = input.nextInt();
        int day1 = input.nextInt();

        LocalDate date = LocalDate.of(year1,month1,day1);

        System.out.println(date.getDayOfWeek());


    }


}
