package day12arraylist;

import java.util.ArrayList;

public class Arraylist1 {

    public static void main(String[] args) {

        ArrayList<Integer> ages = new ArrayList<>();

        ages.add(5);//Insortion order bu şekilde bizim eklediğimiz sıraya göre ekler
        ages.add(7);
        ages.add(19);
        ages.add(2,313);
        ages.add(4,999);// Burada sadece 999 yazarsak da sona ekler

        System.out.println(ages);


        ArrayList <Integer > newAges = new ArrayList<>();

        newAges.add(5);
        newAges.add(8);
        newAges.add(2);

        ages.addAll(newAges);//Burada sona ekler çünkü insort ederiz
        ages.addAll(0,newAges);// Burada 0 ıncı index dediğimiz için ilk başa ekler

        System.out.println(ages);

        int numOfElement = ages.size();//Age listesindeki eleman sayısını sayar

        System.out.println(numOfElement);

        //burada get methodu kullanarak elde ettigmiz datayi gorunur kilmak icin
        // int sepetine ekledik, böylece methodlarin return typelarina bir vurgu yaptik
        int eleman = ages.get(9);//Elemanı almak için index numarasını gireriz index 0 dan başlar

        System.out.println(eleman);

        ages.set(3,9);// Bu methodu kullanarak güncellemek istediğimiz sayının indexini girip sonra
        // güncellemek istediğimiz numarayı girerek sayıyı değiştiririz(sayıların indexi 0 dan başlar)

        System.out.println(ages);

        //Örnek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak değiştirin

        ArrayList<Integer> list = new ArrayList<>();

        list.add(23);
        list.add(24);
        list.add(12);
        list.add(9);
        list.add(3);





        System.out.println(list);

        for (Integer w:list) {

            if (w%2!=0){

                list.set(list.indexOf(w),11);//Burada indexini girdiğimiz sayıyı 11 e dönüştürür


            }

        }

        System.out.println(list);






















































    }
}
