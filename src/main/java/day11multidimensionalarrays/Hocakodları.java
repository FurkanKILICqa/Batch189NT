package day11multidimensionalarrays;

import java.util.Arrays;

public class Hocakodları {


    public static void main(String[] args) {


        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]

        int a[] = {0, 2, 3, 0, 12, 0};//[0,  2, 3,  0,  12,  0]
        int b[] = new int[a.length];   //[0,  0,  0,  0,  0,  0]
        int idx = 0;

        //[0,  2,  3,  0,  12,  0]
        for (int w : a) {
            if (w != 0) {
                b[idx] = w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(b));//[2, 3, 12, 0, 0, 0]


        //Arraylerin esit olup olmadigi nasil anlasilir?

        int arr[] = new int[3];
        arr[0] = 2;
        arr[1] = 1;
        arr[2] = 3;

        int brr[] = new int[3];
        brr[0] = 2;
        brr[1] = 3;
        brr[2] = 1;

        //iki arrayin ayni olabilmesi icin ayni index te ayni elemanlarin bulunmasi gerekir
        boolean result= Arrays.equals(arr,brr);
        System.out.println("result = " + result);





        //Example : Bir integier multidimensional array'dek en kucuk ve en buyuk elemanin toplamini bulunuz.
        int ages[][] = {{15, 4}, {12, 43, 21}}; // ==> 4 + 43 = 47

        int small = ages[0][0];
        int big = ages[0][0];

        //{ {15, 4}, {12, 43, 21} }
        for (int[] w : ages) {

            for (int k : w) {
                small = Math.min(small, k);
                big = Math.max(big, k);
            }
        }
        System.out.println(small);
        System.out.println(big);
        System.out.println(big + small);



































































































































































































    }
}
