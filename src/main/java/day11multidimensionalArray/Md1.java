package day11multidimensionalArray;

import java.util.Arrays;

public class Md1 {

    public static void main(String[] args) {

        /*


        int [] [] ages = {{5,12 },{81,45}, {123,0}};

        //Example : Bir integier multidimensional array'dek en kucuk ve en buyuk elemanin toplamini bulunuz.

        int  small = ages [0] [0];

        int large = ages [0] [0];

        for ( int [] w:ages ) {

            for (int k:w) {






            }

        }

         */

        int a[][] = new int[3][2]; // [[0,0],[0,0],[0,0]]

        a[0][0]=5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[1][0]=81;
        a[2][1]=0;


        //Multidimansional Arryleri konsola yazdırmak için deeptostrin deriz

        System.out.println(Arrays.deepToString(a));


        System.out.println(a[2][0]);// Burada Array.tostring kullanmamamızın nedeni bunlar zaten zaten Arry olduğu için bu şekilde
        // yazarız

        //Kısa yoldan Array oluşturma

        String students [] [] = {{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan,Burhan"},};

        //Birşey tekrar ediyorsa mutlaka loop kullanmalıyız

        //Example 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.

        int sum =0;


        for ( String [] w : students) {// Burada student classındaki herşeyi w class ına yazar (akterır) W == Students
           sum = sum + w.length;
        }
        System.out.println(sum);

        //Example 2: Yukaridaki students array'inde icinde "m" olan isimleri console'a yazdiriniz


        for (String[] w : students) {

            for (String k : w ) {// Burada köşeli parantez yok çünkü

                if (k.contains("m")){//contains içermek demek içerip içermediğini kontrol etmek için contains kullanılır

                    System.out.println(k);
                }




            }






        }

















































    }


}
