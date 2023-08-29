package day14constructiondatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {

    public static void main(String[] args) {

        LocalTime myCurrnetTime = LocalTime.now();//Şuan ki dakika saat tarih saniyesine kadar verir

        System.out.println(myCurrnetTime);//DateTime classın da olan

        /*
    DateTime Class ta kullanilan tarih saat formatlari
    HH : mm ==> 24'lu saat sistemi
    hh : mm ==> 12'li saat sistemi AM, PM gösterilmez
    hh : mm a ==> 12'li saat sistemi AM, PM
    HH : mm : ss==> saniyeyi gosterir
    HH : MM ==> yanlis format cunku MM aylar icin kullanilir
    "mm" "minute" demektir. "MM" "month" demektir.

    dd-MM-yyyy ==> gun - ay - yil
    MMM ==> Aug
    MMMM ==> August  */




        //Time objesini formatladık
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH : mm");
        String formatetTime =  dtf1.format(myCurrnetTime);
        System.out.println("formatetTime = " + formatetTime);


        //Date objesini formatlayalım

       LocalDate date1 = LocalDate.of(2022,8,28);
       DateTimeFormatter date2 = DateTimeFormatter.ofPattern("MMM/dd/yy");
       String formattedDate = date2.format(date1);
        System.out.println("formattedDate = " + formattedDate);


        LocalDate date8 = LocalDate.of(1996,9,26);
        DateTimeFormatter date9 = DateTimeFormatter.ofPattern("dd/MMM/yyy");
        System.out.println(date9.format(date8));

        //Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?

        LocalDate dateintokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("dateintokyo = " + dateintokyo);

        LocalTime timeintokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("timeintokyo = " + timeintokyo);

        LocalDateTime dttokyo = LocalDateTime.now();//Hem tarihi hem saati gözterir
        System.out.println("dttokyo = " + dttokyo);


        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd * MMM * yyyy - hh : mm a");
        String formattedLdt= dtf4.format(dttokyo);
        System.out.println(formattedLdt);                    //28 * 08 * 2023 - 11 : 19








    }



}
