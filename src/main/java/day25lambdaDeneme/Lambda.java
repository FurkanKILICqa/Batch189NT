package day25lambdaDeneme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {

        //1) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran
        // method'u olusturunuz.(Structured)

        List<Integer> nums = new ArrayList<>(Arrays.asList(12, 9, 131, 14, 9, 10, 4, 12, 15));


        printEvenElements1(nums);
        System.out.println();



        printSquareOfddElements(nums);
        System.out.println();


        printCubeOfDistinctOddElements(nums);
        System.out.println();

        printSumOfSquaresOfDistictEvenElements(nums);
        System.out.println();

        printSumOfSquaresOfDistictEvenElements5(nums);
        System.out.println();

        getMaximuValue1(nums);
        System.out.println();

        getMaximuValue2(nums);
        System.out.println();

        getMinValue1(nums);
        System.out.println();

        getMinGraterThanSevenEven(nums);
        System.out.println();

    }

    //Burada de yerine başka bir harf veya kelime de kullanılabilir
    public static void printEvenElements1(List<Integer>num){
        num.
                stream().
                filter(t-> t%2==0).
                forEach(t-> System.out.print(t+" "));




    }


    //2) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda  aralarina bosluk
    // koyarak yazdiran method'u olusturunuz.(Functional)
    //map methodu stream daki leri değiştirmeye yarra

    public static void printSquareOfddElements(List<Integer>num){

        num.stream().filter(t-> t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));



    }
    //3) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda
    // aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printCubeOfDistinctOddElements(List<Integer>num){

        num.stream().
                filter(t-> t%2!=0).
                map(t-> t*t*t).distinct().
                forEach(t-> System.out.print(t+" "));


    }

    //4)Bir list'teki "tekrarsiz" "CIFT " ELEMANLARIN "karelerinin"
    // "toplamını" hesaplayan method oluşturun
    //Main methoddan çağıracağımız için static deriz yoksa obje oluşturmamız gerekir
    //Reduce methodu tekil bir sonuc için kullanılır stream da bulunan dataları 1 e azaltılması için kullanılır

    public static void printSumOfSquaresOfDistictEvenElements(List<Integer>num){
        int sum = num.
                stream().
                distinct().
                filter(t-> t%2==0).
                map(t-> t*t).reduce(0,(t,u)->t+u);

        System.out.println(sum);


    }

    ////5) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin"
    // "çarpımını" hesaplayan bir method oluşturun

    public static void printSumOfSquaresOfDistictEvenElements5(List<Integer>num){

       int sum2 =  num.
               stream().
               distinct().
               filter(t-> t%2==0).
               map(t->t*t).
               reduce(1,(t,u)->t*u);

        System.out.println(sum2);
    }


    //6)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun

    public static void getMaximuValue1(List<Integer>num){

       int max =  num.
               stream().
               distinct().
               reduce(Integer.MIN_VALUE,(t,u)->t>u ? t:u);

        System.out.println(max);

    }


    public static void getMaximuValue2(List<Integer>num){

        Integer max = num.stream().distinct().sorted().reduce(Math::max).get();
        System.out.println(max);


    }


    public static void getMinValue1(List<Integer> num){

        Integer min = num.stream().distinct().reduce(Math::min).get();
        System.out.println(min);


    }

    //8)Verilen List'ten 7 den buyuk en kucuk cift sayi yi bulmak için bir method oluşturun
    // 12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi

    public static void getMinGraterThanSevenEven(List<Integer> num){
        Integer min = num.
                stream().filter(t-> t>7 && t%2==0).
                sorted().
                findFirst().
                get(); // reduce( (t,u)->t).get();
        System.out.println(min);
    }








}
