package day26lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynepx");
        myList.add("Mustafa");


        //deleteIfLengthThatMoreThanFive(myList);


        //removeIfElementsStartsWithZorEndWithT(myList);


       // removeIfElementsStartsWithZorEndWithT2(myList);

        removeIfElementsContainsX(myList);


    }

    //Listler mutiple dir
    //1) Character sayisi 5'ten fazla olan elemanları silen bir method oluşturun.

    //Remove if kullanacak sak stream a çeviremeyiz
    public static void deleteIfLengthThatMoreThanFive(List<String>myList){

        myList.removeIf(t-> t.length()>5);
        System.out.println(myList);


    }

    //2 ) 'Z' ile başlayan yada 'f' ile biten elemanları silen bir method oluşturun.

    public static void removeIfElementsStartsWithZorEndWithT(List<String>myList){

        myList.removeIf(t-> t.charAt(0)=='Z' || t.charAt(t.length()-1)=='f');
        System.out.println(myList);

    }

    public static void removeIfElementsStartsWithZorEndWithT2(List<String>myList) {

        myList.removeIf(t -> t.startsWith("Z") || t.endsWith("f"));
        System.out.println(myList);


    }

    //3 ) "X" karakteri iceren elemanları silen bir method oluşturun.

    public static void removeIfElementsContainsX(List<String>myList){

        myList.removeIf(t-> t.contains("x"));
        System.out.println(myList);

    }














}
