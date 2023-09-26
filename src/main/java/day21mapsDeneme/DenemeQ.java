package day21mapsDeneme;

import java.util.Deque;
import java.util.LinkedList;

public class DenemeQ {

    public static void main(String[] args) {

        //LinkedList classında insortion order yani bizim girdiğimiz sıra ile sıralar
        Deque<String> d = new LinkedList<>();//İnsortion order bizim girdiğimiz sıraya göre yerleştirir

        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomatos");

        System.out.println(d);


    }
}
