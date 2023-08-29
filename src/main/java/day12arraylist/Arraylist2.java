package day12arraylist;

import java.util.ArrayList;
import java.util.List;

public class Arraylist2 {

    public static void main(String[] args) {

        //Interview sorusu!!!

        //Örnek : Tekrarli elemanlari olan bir listten sadece tekrarsiz elemanlari olan bir list elde edinn
        //           [J, a, v, a, v] ==> [J, a, v]


        List <Character> a = new ArrayList<>();

        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');


        List <Character> b = new ArrayList<>();


        for (Character w : a) {

            if (!b.contains(w)){

                b.add(w);//Burada w sepetine ekleyeceğimiz için w koyduk

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

        for (int i = 0; i <r.size() ; i++) {//Burada size bütün elemanları alır arrayler için


            if (r.get(i).contains("a")) {//Burada i index tir yani sıra sayısı dır

                r.remove(i);
                i--;
            }
        }

        System.out.println(r);






























































    }
}
