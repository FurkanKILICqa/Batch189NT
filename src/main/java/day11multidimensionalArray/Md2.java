package day11multidimensionalArray;

import java.util.Arrays;

public class Md2 {

    public static void main(String[] args) {


        //Example : Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz


        int numbers[][] = { {5, 4}, {2, 3, 2} }; // ==> { 5, 4, 2, 3, 2 }

        int toplamElemanSayisi =0;//Eleman sayısını içinde biriktireceğimiz kutu

        for ( int [] w:numbers ) {


            toplamElemanSayisi =toplamElemanSayisi  + w.length;

        }
        System.out.println(toplamElemanSayisi);

        //2. Step : Tek boyutlu arrayi iki boyutlu arrayin eleman sayisini kullanarak olusturmaliyiz

        int newArr [] = new int[toplamElemanSayisi];//Burada tek boyutlu arry ye dönüştürebilmem için

        //3. Step : iki boyutlu array deki elemanlari tek boyutlu array e transfer etmeliyiz

        int idx =0;//Burada 0 yazmamızın sebebi 0 ıncı indexten yazdırmaya başlatmak içindir

        for (int [] w : numbers) {


            for (int k : w) {

                newArr[idx]=k;

                idx++;
            }

        }

        System.out.println(Arrays.toString(newArr));








































    }
}
