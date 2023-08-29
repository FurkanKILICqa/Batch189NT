package day12arraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList01 {
    public static void main(String[] args) {

        ArrayList < Integer > ages = new ArrayList<>();

        //ArrayListlere eleman nasil eklenir?
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1,656);
        ages.add(3,777);
        ages.add(888);

        //ArrayListlere coklu eleman nasil eklenir?
        ArrayList < Integer > newAges = new ArrayList<>();
        newAges.add(1);
        newAges.add(2);
        newAges.add(3);
        System.out.println(newAges);


        ages.addAll(newAges);
        ages.addAll(0,newAges);// Sayıyı ages sepetinin başına eklemek için kullanılır

        System.out.println(ages);//[1, 2, 3, 9, 656, 12, 777, 10, 888, 1, 2, 3]

        int numOfelement = ages.size();
        System.out.println(numOfelement);

        int el = ages.get(1);//Burada Integer de girebilirdik fakat int daha az yer kapladığı için int girdik

        System.out.println(el);

        ages.set(1,313);//Değiştirmek istediğimiz indexteki sayıyı gireceğiz ve hangi sayıya dönüştüreceğimizi gireriz

        System.out.println(ages);

        //Örnek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak değiştirin

        // 1. Yol Bu yol uzun olduğu için kullanışlı olmaz o yüzden foreach loop ile soruyu yaparız
        // bu yol çalışır ama doğru bir yol değil

        ArrayList < Integer > newArray = new ArrayList<>();

        newArray.add(1);
        newArray.add(2);
        newArray.add(3);
        System.out.println(newArray);

        newArray.set(0,11);
        System.out.println(newArray);

        newArray.set(2,11);
        System.out.println(newArray);


        // 2 . Yol

        //Örnek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak değiştirin

        ArrayList<Integer> list = new ArrayList<>();

        list.add(23);
        list.add(24);
        list.add(12);
        list.add(9);
        list.add(3);


        System.out.println(list);


        for (Integer w : list ) {//Tekrarlı işlemlerde loop kullanırız

            if (w%2!=0){//Çiftsayı olup olmadığını anlayabilmemiz için 2 beleriz   w2%

                list.set(list.indexOf(w),11);//Indexof ile bütün dataları teker teker alır
                    //List.set

            }

        }

        System.out.println(list);









































































    }

}
