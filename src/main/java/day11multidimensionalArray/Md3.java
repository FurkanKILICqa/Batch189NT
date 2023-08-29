package day11multidimensionalArray;

public class Md3 {

    public static void main(String[] args) {

        //Example : Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        //Burada short methodu ile de yapılabilir fakar


        int ages[][] = { {15, 4}, {12, 43, 21} }; // ==> 4 + 43 = 47

        int small =ages [0][0];
        int large =ages [0][0];

        for ( int []  w : ages) {

            for (int k : w){

                small = Math.min(small,k);

                large = Math.max(large,k);

            }

        }
        System.out.println(small);//4

        System.out.println(large);//43

        System.out.println(small+large);//47




















































    }

}
