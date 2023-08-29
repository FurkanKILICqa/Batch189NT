package day10loopsarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Hocakodları {

    public static void main(String[] args) {

        int a = 13;


        //Array nasil olusturulur?
        String stdNames [] = new String[5];

        //Arrayler console a nasil yazdirilir?
        System.out.println(Arrays.toString(stdNames));

        //toString() methodunu kullanmadan sadece array ismi ile yazdirirsaniz java o Arrayin adresini yazdirir

        //Array e eleman ekleme nasil yapilir?
        stdNames [2] ="Alperen";
        stdNames [4] ="Cemil";
        stdNames [3] ="Tuba";
        stdNames [1] ="Ahmet";
        stdNames [0] ="Ahmet Saim";
        System.out.println(Arrays.toString(stdNames));

        //Array dan specific bir elemani almak?
        System.out.println(stdNames[2]);//Alperen

        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.


        //Note :Stringlerde kullandigimiz length() methodtur
        // arraylerde kullandigimiz length variable dir

        String cities[] = new String[5];
        cities[0] = "Miami";
        cities[1] = "Sivas";
        cities[2] = "Yozgat";
        cities[3] = "Ankara";
        cities[4] = "Bursa";


        //1. yol for loop
        int totalChar=0;

        for (int i = 0;     i <cities.length ;     i++) {
            totalChar=totalChar+ cities[i].length();
        }
        System.out.println(totalChar);


        //2. yol for-each loop  (enhanced loop)

        int sum=0;

        for ( String w : cities ){
            sum= sum+ w.length();
        }
        System.out.println(sum);


        //Example 2: int array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu il en buyugunun toplamini ekrana yazdiriniz

        int ages[] = new int[6];
        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 19;
        ages[3] = 44;
        ages[4] = 15;
        ages[5] = 32;

        System.out.println(Arrays.toString(ages));//[20, 23, 19, 44, 15, 32]

        //1. yol
//        Arrays.sort(ages);
//        System.out.println(Arrays.toString(ages));//[15, 19, 20, 23, 32, 44]

        //Note : sort() methodu sayisal data type larini kucukten buyuge siralar, (ascending order)
        //     :  sort() methodu String data tyep larini alfabetik siralar (alphabetical order)
        //   (ascending order) +   (alphabetical order)  ==> natural order
        // sort () methodu array elemanlarini natural order a gore siralar

        System.out.println(ages[0] + ages[ages.length - 1]);

        //2.yol
        int minimum = ages[0];
        int maximum = ages[0];

        for (int w : ages) {
            minimum = Math.min(minimum, w);
            maximum = Math.max(maximum, w);
        }
        System.out.println(minimum);
        System.out.println(maximum);
        System.out.println(maximum+minimum);

        /*


        //Example : Bir integer array olusturun ve 5 ten kucuk olan elemanlari yazdirin
        //           [12, 3, -3, 5, 23] ==> 3, -3

        //Array leri kisa yoldan nasil olusturabiliriz?

        int numbers [] = {12, 3, -3, 5, 23};

        for (int w  : numbers  ) {

            if(w<5){
                System.out.print(w+ " ");
            }
        }

        System.out.println();

        //Example Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz


        //Example : Bir integer array olusturun ve 5 ten kucuk olan elemanlari yazdirin
        //           [12, 3, -3, 5, 23] ==> 3, -3

        //Array leri kisa yoldan nasil olusturabiliriz?

        int numbers[] = {12, 3, -3, 5, 23};

        for (int w : numbers) {

            if (w < 5) {
                System.out.print(w + " ");
            }
        }

        System.out.println();

        //Example Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz
        String names[] = {"K", "C", "R", "A", "S"};

        //binarySearch() methodunu sort() kullanmadan kullanmayiiniz
        //binarySearch() methodu var olan elemanlar icin size o elemanin indexini verir
        //binarySearch() methodu olmayan elemanlar icin size negatif tamsayi verir
        // "-" ==> isaretinin anlami eleman yok demektir
        // - nin yanindaki sayi ==> olsaydi kacinci eleman olurdu.

        Arrays.sort(names);
        int result = Arrays.binarySearch(names, "U");
        System.out.println(result);

        //ornek :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.

         */

        /*


        System.out.print("Bir cümle girin: ");
        String cumle = scanner.nextLine();
        int kelimeSayisi = countWords(cumle);
        System.out.println("Cümledeki kelime sayısı: " + kelimeSayisi);
        scanner.close();
    }
    public static int countWords(String cumle) {
        String[] kelimeler = cumle.split("\\s+");
        return kelimeler.length;

         */

























    }
}
