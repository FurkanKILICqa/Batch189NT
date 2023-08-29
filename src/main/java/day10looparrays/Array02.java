package day10looparrays;

import java.util.Arrays;

public class Array02 {

    public static void main(String[] args) {

        //Example 2: Integer array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz



        //Note : sort() methodu sayisal data type larini kucukten buyuge siralar, (ascending order)
        //     :  sort() methodu String data tyep larini alfabetik siralar (alphabetical order)
        //   (ascending order) +   (alphabetical order)  ==> natural order
        // sort () methodu array elemanlarini natural order a gore siralar


        int [] ages = new int[6];


        ages [0] =20;
        ages [1] =23;
        ages [2] =19;
        ages [3] =44;
        ages [4] =15;
        ages [5] =32;

        System.out.println(Arrays.toString(ages));

        Arrays.sort(ages);//Sayısal data typleri küçükten büyüğe doğru sıralamak için kullanılır

        System.out.println(Arrays.toString(ages));

        System.out.println(ages[0] + ages[ages.length-1]);//Kodun daha dinamik olması için
        // yani herzaman kullanabilmemiz için length kullanırız


        //2.YOL

        int minimum = ages[0];// Buraya Arry den bir sayı vermeliyiz yani parantez ile yazınız yoksa yanlış sonuç alabiliriz

        int maximun = ages[0];

        for (int w : ages) {

            minimum = Math.min(minimum,w);

            maximun = Math.max(maximun,w);

        }

        System.out.println(minimum);//En küçük değeri verir
        System.out.println(maximun);//En büyük büyük değeri verir

        System.out.println(minimum+maximun);











    }



}
