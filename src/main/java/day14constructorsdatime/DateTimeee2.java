package day14constructorsdatime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeee2 {

    public static void main(String[] args) {




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

        LocalTime mytime = LocalTime.now();//Saniyesi saniyesi ne verir
        System.out.println(mytime);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH : mm");//.ofPattern string formatında dır
        // "HH : mm" sadece saati al demek o yüzden sadece saati alır gerisini umursamaz hep Stringdir
        String formatted = format.format(mytime);
        System.out.println(formatted);

        //Tarihi (Date) formatladık

        LocalDate mydate1 = LocalDate.now();


        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("MMMM/ dd/ yyyy");
        String formated = format2.format(mydate1);
        System.out.println("formated = " + formated);




        LocalDate tarih = LocalDate.of(2023, 8,28);
        String newTarih = tarih.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(newTarih);


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
