package day10looparrays;

import java.util.Arrays;

public class Array03 {
    public static void main(String[] args) {


        //Example : Bir integer array olusturun ve 5 ten kucuk olan elemanlari yazdirin
        //           [12, 3, -3, 5, 23] ==> 3, -3


        int nubmers [] = {12, 3, -3, 5, 23};

        for (int w  : nubmers ) {

            if (w<5){

                System.out.print(w + " ");// Burada bu şekilde yapmamızın amacı sonucu arasında bir boşluk oluşturarak
                //yan yana istememizden dolayıdır







            }



        }

        //Example Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz

        System.out.println();// Bu sout u üstteki kodlarla yanyana yazmasındiye buraya yazdık

        String names [] = {"K","C","R","A","S"};

        Arrays.sort(names);//Binary search methodunu çalıştırmak için mutlaka öncesinde bu methodu kullanmak zorundayız

        System.out.println(Arrays.toString(names));// Eğer Array şeklinde yazdırmak istersek bu şekilde yazdırmalıyız

        int result =Arrays.binarySearch(names,"A");//Eğer Array da varsa indexini (0,1,2,3,4)
        // yoksa sıra sayısını verir (1,2,3,4)

        System.out.println(result);



        //ornek :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.

        String s = "Java is easy. Learn Java earn money.";

        String words [] =s.split(" ");// Boşluk kullanılan yerlerden kelimeleri böldük çünkü kelime sayısını itiyor bizden

        System.out.println(Arrays.toString(words));//Bunu kelimeleri bir arada görmek için yazdık önemli değil!!!

        System.out.println((words.length));//length methodunu String methodu ile kullanamazsınız bütün kelime sayılarını verir








































    }
}
