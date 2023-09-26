package day25lambda;

import java.util.*;

public class Lambda {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(12, 9, 131, 14, 9, 10, 4, 12, 15));

        printEvenElements1(nums);
        System.out.println();
        printEvenElements2(nums);
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

        getMaximuValue1(nums);
        System.out.println();

        getMaximuValue3(nums);
        System.out.println();

        getMaximuValue14(nums);
        System.out.println();

        getMaximuValue4(nums);
        System.out.println();

        getMinGraterThanSevenEven(nums);
        System.out.println();



    }
    //1a) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(Structured)
    public static void printEvenElements1( List<Integer> nums ){
        for (Integer w : nums ) {
            if(w%2==0){
                System.out.print(w+" ");
            }
        }
    }

    //1b) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(functional)
    public static void printEvenElements2( List<Integer> nums ){

        nums.
                stream().
                filter(t->t%2==0).
                forEach(t-> System.out.print(t+" "));
    }

    //2) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda  aralarina bosluk
    // koyarak yazdiran method'u olusturunuz.(Functional)
    //map methodu stream daki leri değiştirmeye yarra

    public static void printSquareOfddElements(List<Integer> nums){//81 17161 81 225

        nums.stream().
                filter(t->t%2!=0).
                map(t->t*t).
                forEach(t-> System.out.print(t+" "));

        //stream e koyduk filtreleme methoduyla sadece tek olanları aldık map ile içini değiştirdik tek sayıların karesini al dedik
        //sonra foreach ile her birini yazdırdık
    }


    //3) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda
    // aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printCubeOfDistinctOddElements(List<Integer> nums){//729  2248091  3375



        nums.
                stream().
                distinct().//Tekrarsızları seçen method
                filter(t->t%2!=0).
                map(t->t*t*t).
                forEach(t-> System.out.print(t+" "));

    }

    //4)Bir list'teki "tekrarsiz" "CIFT " ELEMANLARIN "karelerinin"
    // "toplamını" hesaplayan method oluşturun
    //Main methoddan çağıracağımız için static deriz yoksa obje oluşturmamız gerekir
    //Reduce methodu tekil bir sonuc için kullanılır stream da bulunan dataları 1 e azaltılması için kullanılır

    public static void printSumOfSquaresOfDistictEvenElements(List<Integer> nums){
        int sum = nums.
                stream().
                distinct().
                filter(t->t%2==0).
                map(t->t*t).
                reduce(0,(t,u)->t+u);// 0 buaraki etkisiz elemandır
        //int sum ı yazdırmak için yazdık // çoku teke indirdik foreach kullanmadık o hepsini yazdırır

        System.out.println(sum);

    }


    ////5) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin"
    // "çarpımını" hesaplayan bir method oluşturun

    public static void printSumOfSquaresOfDistictEvenElements5(List<Integer> nums){

        int product = nums.
                stream().
                distinct().
                filter(t->t%2==0).
                map(t->t*t).
                reduce(1,(t,u)->t*u);
        System.out.println(product);

    }

    //6)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun

    // 1.Yol
    public static void getMaximuValue1(List<Integer> nums){

        int max = nums.
                stream().
                distinct().
                reduce(Integer.MIN_VALUE,(t,u)->t>u ? t :u);

        System.out.println(max);

    }

    //2.Yol
    public static void getMaximuValue14(List<Integer> nums) {

        int max = nums.
                stream().
                distinct().
                reduce(nums.get(0), (t, u) -> t > u ? t : u);

        System.out.println(max);

    }

    //3.Yol
    public static void getMaximuValue3(List<Integer> nums) {

       Integer max = nums.
               stream().
               distinct().
               sorted().
               reduce((t, u) -> u).get();

       //Sorted methodu elemanları natural orde re göre sıraladı

        System.out.println(max);


    }

    //4.Yol

    //7)Verilen List'teki "minimum değeri" bulmak için bir method oluşturun


    public static void getMaxValue4(List<Integer> nums) {
        Integer max =
                nums.
                        stream().
                        distinct().
                        reduce(Math::max).
                        get();
        System.out.println(max);

    }


    public static void getMaximuValue4(List<Integer> nums){
        Integer min = nums.
                stream().
                distinct().
                reduce(Math::min).get();

        System.out.println(min);
    }

    //1.yol
    public static void getMinValue1(List<Integer> nums){
        Integer min = nums.
                stream().
                distinct().
                reduce((t,u)-> t>u ? u : t).
                get();
        System.out.println(min);

    }

    //2.yol
    public static void getMinValue2(List<Integer> nums){
        Integer min = nums.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()).
                reduce((t,u)->u).get();
        System.out.println(min);
    }
    //3.yol
    public static void getMinValue3(List<Integer> nums){
        Integer min = nums.
                stream().
                distinct().
                sorted().
                reduce((t,u)->t).
                get();
        System.out.println(min);
    }
    //4.yol
    public static void getMinValue4(List<Integer> nums){
        Integer min = nums.
                stream().
                distinct().
                reduce((t,u)->Math.min(t,u)).
                get();
        System.out.println(min);
    }
    //8)Verilen List'ten 7 den buyuk en kucuk cift sayi yi bulmak için bir method oluşturun
    // 12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi


    public static void getMinGraterThanSevenEven(List<Integer> nums){
        Integer min = nums.
                stream().
                filter(t-> t>7 && t%2==0).
                sorted().
                findFirst().// İlk elemanı verir
                get();


        System.out.println(min);

    }












}
