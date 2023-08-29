package day14constructorsdatime;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTimeee {

    public static void main(String[] args) {


        LocalDate myDate = LocalDate.now();
        System.out.println(myDate);

        System.out.println(myDate.getMonthValue());
        System.out.println(myDate.getYear());
        System.out.println(myDate.getDayOfMonth());
        System.out.println(myDate.getMonth());//Bu bir enum dur bular degişmeyen sabit datalardır
        // Or: ağustos eylül gibi genel değişmeyen datalar java da değişmeyen değerler büyük harf ile yaızlır

        System.out.println(myDate.getDayOfWeek());//Haftanın günleri de enum dur cünkü değişken değildir

        //İleriki bir tarihe gitmek
        System.out.println(myDate.plusYears(1).plusMonths(5).plusDays(2));
        //Gecmişteki bir tarihe gitmek
        System.out.println(myDate.minusMonths(4).minusDays(88).minusYears(44));
        LocalDate date1 = LocalDate.of(1980,5,5);
        LocalDate date2 = LocalDate.of(2000,7,5);


         boolean u1 = date1.isAfter(date2);//Date1 objesinin adte2 den fazla olup olmadığını söyler
        System.out.println(u1);


        boolean r2 = date1.isBefore(date2);
        System.out.println(r2);


        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bize yılı, ayı, ve günü giriniz");

        int yil = input.nextInt();
        int ay = input.nextInt();
        int gun = input.nextInt();

        LocalDate girilenyil = LocalDate.of(yil, ay,gun);

        if (girilenyil.isBefore(LocalDate.now())){// isbefore öncemi sonra mı diye karşılastırır

            System.out.println("Geçersiz tarih");


        }else {

            System.out.println("Bilet için zamanı giriniz");

        }

        //Example 2: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.


        Scanner sacan = new Scanner(System.in);

        System.out.println("Lütfen doğum yınınızı, ayınızı ve gününüzü giriniz");

        int year1 = input.nextInt();
        int month1 = input.nextInt();
        int day1 = input.nextInt();

        LocalDate date = LocalDate.of(year1, month1,day1 );//Istediğimiz bir tarih olusturmak istersek Localdate.of kullanırız

        System.out.println(date.getDayOfWeek());//Bu bir enum dur



    }

}
