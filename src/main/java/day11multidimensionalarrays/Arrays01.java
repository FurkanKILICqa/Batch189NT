package day11multidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {


        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]

        int a [] = {0, 2, 3, 0, 12, 0};

        int b [] = new int[a.length];//[0,0,0,0,0,0]



        int idx =0;

        for (int w : a ) {

            if(w!=0){

                b[idx]=w;

                idx++;

            }

        }
        System.out.println(Arrays.toString(b));


        //Arrayler de esit olup olmadığı nasil anlaşılır?

        int arr [] = new int[3];

        arr[0] =2;
        arr[1] =1;
        arr[2] =3;

        //iki arrayin ayni olabilmesi icin ayni index te ayni elemanlarin bulunmasi gerekir
        int brr[] = new int[3];

        brr[0] = 2;










































    }
}
