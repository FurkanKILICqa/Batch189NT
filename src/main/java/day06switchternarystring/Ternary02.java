package day06switchternarystring;

public class Ternary02 {

    public static void main(String[] args) {

        //Example : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz


        int a = -313;

        Math .abs(a);// Sonucu her zaman pozitife çevirir

       String result = a>99 && a<1000 ? "Üç basamaklıdır" : "Üç basamaklı değil";

        System.out.println(result);

        int year = 1600;

        //c ? t : f

        //interview question
        /*    Example : Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
                       1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
                       2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
         */

























    }

}
