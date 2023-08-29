package day10loopsarrays;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        //Example : Bir integer array olusturun ve 5 ten kucuk olan elemanlari yazdirin
        //           [12, 3, -3, 5, 23] ==> 3, -3

        int number [] ={12, 3, -3, 5, 23};// kısa yoldan int oluşturma budur

        for (int w : number){

            if (w<5){

                System.out.print(w + " ");// Eğer if komutu çalışsın istiyorsak komutu mutlaka if parantesinin içine yazmalıyız





            }






        }


        System.out.println();// Bu sout u üstteki kodlarla yanyana yazmasındiye buraya yazdık

        String names [] = {"K","C","R","A","S"};

        //BinarySearch () methodu bunu kullanmal için short methodu nu kullanlamalıyız

        Arrays.sort(names);//Sohrt methodu yazıları alfabetik sıraya göre sıralar

        int result = Arrays.binarySearch(names, "R");// R bizim girdiğimiz harflere göre 3. sırada olduğu için sonuc 3 tür

        System.out.println(result);



        //ornek :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.

        String s = "Java is easy. Learn Java earn money.";

        String words [] = s.split(" ");// Boşluk olan yerlerden bölmek için kullanırız çünkü bizden kelime yayısı istenmiş
        //Bizim birdiğiniz kelime kendi başına  bir bütün dür (Emin değilim!!!)


        System.out.println(Arrays.toString(words));// Sadece konsolda görmek için yazdık

        System.out.println(words.length);// length burada bütün kelimeleri temsil etmektedir



















































    }
}
