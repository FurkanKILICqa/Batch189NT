package day10loopsarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {



        // Arry ler çoklu data tiplerini depolamaya yarayan şeylerdir
        //toString methodunu kullanmadan sadece arrayismi yazdırırsanız java Arryin adresini yazdırır

        String stdNames [] = new String[5];

        System.out.println(Arrays.toString(stdNames));// Bunu mantık yerleşsin diye yazdık "nuul" "hiçlik" demek

        stdNames [2] ="Alperen";

        stdNames [1] = "Ahmet";

        stdNames [0] = "Furkan";

        stdNames [3] = "Veli";

        stdNames [4] = "ali";

        System.out.println(Arrays.toString(stdNames));

        System.out.println(stdNames[0]);

        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.

        //Not: Arrey lerda kullandığımız length variable dir


        String cities [] = new String[5];

        cities [0] = "Miami";
        cities [1] = "Sivas";
        cities [2] = "Frankfurt";
        cities [3] = "Yozgat";
        cities [4] = "Ankara";

        int totalChar = 0;

        for (int i = 0; i < cities.length ; i++) {


            totalChar = totalChar + cities[i].length();


        }

        System.out.println(totalChar);

        // 2. yol For each loop (enhanced loop)

        int sum=0;


        for (String w : cities){


            sum = sum +w.length();

        }

        System.out.println(sum);












































    }

}
