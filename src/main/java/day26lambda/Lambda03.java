package day26lambda;

import java.util.stream.IntStream;

public class Lambda03 {
    public static void main(String[] args) {


        //4)7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz


        System.out.println(SumOfAllIntegersFrom7To70());


        System.out.println(getMultipyFromSevenToSeventy());

        System.out.println(getFactoriel(-99999));//Factoriel 1*2*3*4==24

        System.out.println(getSumOfEvensBetweenTwoInteger(4,7));

    }



    public static int SumOfAllIntegersFrom7To70(){

        //Integer sum dene bilir

       return IntStream.
               range(7,70).
               reduce(Math::addExact).
               getAsInt();




    }

    //5)3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.




    public  static int getMultipyFromSevenToSeventy(){
        return IntStream.
                range(3,9).
                reduce(Math::multiplyExact).getAsInt();


    }

    //6)Size verilen sayinin faktoryelini hesaplayan kodu yaziniz.

    public static int getFactoriel(int x ){
        if (x==0){
            return 1;
        }else if (x<0){
            System.out.println("Fkatoriyel işlemi 0 ile yapılamaz");
            return -1;

        }

        return IntStream.
                rangeClosed(1,x).//2. sayı birinciden küçük olamaz büyük veya eşit de olabilir
                reduce(Math::multiplyExact).
                getAsInt();



    }


    //7) Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
    public static int getSumOfEvensBetweenTwoInteger(int a, int b) {
        if (a>b){
            int temp = a;

            a   =   b;

            b   = temp;

        }

        return IntStream.
                range(a + 1, b).
                filter(Utils::isNumberEven).
                sum();// Hepsinin toplamını verir


    }














}
