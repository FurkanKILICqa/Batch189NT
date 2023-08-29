package day11multidimensionalArray;

import java.util.Arrays;

public class Arrays01 {


    public static void main(String[] args) {


        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]

        int [] a = {0, 2, 3, 0, 12, 0};

        int [] b = new int[a.length];//Dinamik olmak için a da kaç tane karakte olduğunu değilde karakterlerin hepsini yazmalıyız



        int idex =0;// Buraya 0 yazmamızın sebebi sayıların ancak sıfır üzerine yazılabildiğinden dolayıdır


        for ( int w :  a) {//Burada a daki tüm sayıları w ye at komutu verdik

            if (w!=0){

                b[idex]=w;
                idex++;
            }

        }
        System.out.println(Arrays.toString(b));



        int arr[] = new int[3];
        arr[0] = 2;
        arr[1] = 1;
        arr[2] = 3;

        int brr[] = new int[3];
        brr[0] = 2;
        brr[1] = 3;
        brr[2] = 1;



        boolean result= Arrays.equals(arr,brr);
        System.out.println("result = " + result);

        //İki array in eşit olabilmesi için aynı indexte aynı elemanların bulunması gerekir









































































    }
}
