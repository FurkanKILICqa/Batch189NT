package day12arraylists;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {

        //Interview sorusu!!!




       //Örnek : Tekrarli elemanlari olan bir listten sadece tekrarsiz elemanlari olan bir list elde edinn
        //           [J, a, v, a, v] ==> [J, a, v]


        List<Character> a = new ArrayList<>();//Burada bir harf gireceğimiz için Character girdik

        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');
        System.out.println(a);

        List<Character> b = new ArrayList<>();

        for (Character w : a) {

            if (!b.contains(w)){// B class ı boştur

                b.add(w);//B ye eklemek için kullanırız

            }

        }
        System.out.println(b);




        //Örnek : Bir String ArrayList oluşturun ve "a" içeren elemanlari silin.

        ArrayList<String> r = new ArrayList<>();

        r.add("Manisa");
        r.add("Tokat");
        r.add("Niğde");
        r.add("Van");

        System.out.println(r);

        /*
        for ( String w : r) {//For each kullandığımızda listlerde eleman sayısını değiştiremezsiniz yani indexleri

            if (w.contains("a")){// "a" içeriyorsa demek

                r.remove(w);

            }

        }
        System.out.println(r);

         */

        for (int i = 0; i <r.size() ; i++) {//Arry lerde length kullandık burada size kullanılrı

            if (r.get(i).contains("a")){//Burada i index tir yani sıra sayısı dır

                r.remove(i);//Bu komut index i yani sıra sayısını siler yani kendisini remove methodunu index ilede kullanabiliriz


                i--;// Silme işlemi olduğunda indexler azalacağı için i değerini de azaltmalıyız

            }

        }
        System.out.println(r);


































































    }
}
