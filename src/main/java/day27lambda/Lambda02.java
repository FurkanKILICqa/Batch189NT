package day27lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {

    public static void main(String[] args) throws IOException {


        //Example 1: Verilen text file icindeki text'i console'a yazdiran code'u yaziniz.
        Files.lines(Paths.get("src/main/java/day27lambda/LambdaTextFile")).forEach(System.out::println);

        //Example 2: Verilen text file icindeki text'i buyuk harflerle console'a yazdiran code'u yaziniz.


        Files.lines(Paths.get("src/main/java/day27lambda/LambdaTextFile")).
                map(String::toUpperCase).
                forEach(System.out::println);




        boolean result1 = Files.lines(Paths.get("src/main/java/day27lambda/LambdaTextFile")).anyMatch(t->t.contains("map"));

        System.out.println(result1);

        //Example 4: Verilen text file icindeki text'lerde kullanilan farkli kelimeleri bir list icinde return ediniz.



        List<String> words = Files.lines(Paths.get("src/main/java/day27lambda/LambdaTextFile")).
                map(t->t.replaceAll("\\p{Punct}","").split(" ")).//Split methodu Array return eder
                flatMap(Arrays::stream).
                distinct().
                collect(Collectors.toList());


        System.out.println(words);


        //Example 5: Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.



        long numOfLetters= Files.
                lines(Paths.get("src/main/java/day27lambda/LambdaTextFile")).
                map(t->t.replaceAll("[^a-zA-Z]","")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                count();
        System.out.println("numOfLetters = " + numOfLetters);

        //Example 6: Verilen text file icindeki text'de kullanilan tum harfleri
        // natural order da bir listin icinde return eden kodu yaziniz.



         List<String> letters = Files.lines(Paths.get("src/main/java/day27lambda/LambdaTextFile")).
                 map(t->t.replaceAll("[^a-zA-Z]","")).
                map(t->t.split("")).
                 flatMap(Arrays::stream).
                 sorted().
                 collect(Collectors.toList());

        System.out.println(letters);


























    }










    }

