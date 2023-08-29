package day10loopsarrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {


        //Example 2: Integer array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz



        int ages [] = new int[6];

       ages [0] =20;
       ages [1] =23;
       ages [2] =19;
       ages [3] =44;
       ages [4] =15;
       ages [5] =32;

        System.out.println(Arrays.toString(ages));

        Arrays.sort(ages);// Sayısal data typelarını küçükten büyüğe sıralamak için Arrey.shor kullanılır (ascendingorde)

        System.out.println(Arrays.toString(ages));// Bunu sayıların küçükten büyüğe sırandığını görmek için yaptık

        System.out.println(ages[0] + ages[ages.length-1]);// En sonucu sunu almak için sonuna -1 koyarız

        // 2: yol


        int minimum = ages[0];// Buradaki 0 bir indextir

        int maximum = ages[0];

        for (int w : ages){

            minimum = Math.min(minimum,w);

            maximum = Math.max(minimum,w);

        }

        System.out.println(minimum);

        System.out.println(maximum);

        System.out.println(maximum+minimum);






















































    }
}
