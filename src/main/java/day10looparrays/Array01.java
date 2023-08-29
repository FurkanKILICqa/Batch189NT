package day10looparrays;

import java.util.Arrays;

public class Array01 {

    public static void main(String[] args) {

        // Arry ler çoklu data tiplerini depolamaya yarayan şeylerdir
        //toString methodunu kullanmadan sadece arrayismi yazdırırsanız java Arryin adresini yazdırır

        //Array aynı data tipinde çoklu data depolamak için oluşturduğu data tipidir yani int ve String aynı kaba yazılmaz
        //ayrı ayrı yazmak zorundayız
        //toString methodunu kullanmadan sadece arrayismi yazdırırsanız java Arryin adresini yazdırır
        //do while ile öğrenci adlarını tek tek girdirip otomatik sırla  array içine atabiliriz
        // o zaman sürekli string oluşturmaya gerek yok


        String stdNames [] = new String[5];// Scanner class oluşrurur gibi çok benzer yöntem

        stdNames [2] ="Ali";
        stdNames [3] ="Veli";
        stdNames [4] ="Ahmet";
        stdNames [1] ="Serkan";
        stdNames [0] ="Mehmet";

        System.out.println(Arrays.toString(stdNames));

        System.out.println(stdNames[4]);// Eğer belirli bir ismi yazdırmak isterseniz o ismin index ini yazmamız gerekir

        // Arrey lerda kullandığımız length variable dir

        //length ler dataları çeker hepsini çeker karakter sayılarını hesaplamak için kullanılır


        System.out.println();

        String cities [] = new String[5];

        cities [0] ="Bayburt";
        cities [1] ="Amasya";
        cities [2] ="Adana";
        cities [3] ="Ankara";
        cities [4] ="Adıyaman";


        int totalChar =0;

        for (int i = 0; i <cities.length ; i++) {//Cities.length değeri bu işlemde 5 dir


            totalChar = totalChar + cities[i].length();

        }

        System.out.println(totalChar);

        int sum =0;

        //karakter sayısını istediğimiz için increment ve decrement
        // in önemi kalmıyo galiba  bayburttan da başlasa ankaran da başlasa aynı sonucu alıcaz


        // 2. YOL

        for (String w : cities ) {

            sum = sum + w.length();


        }

        System.out.println(sum);


















































    }
}
