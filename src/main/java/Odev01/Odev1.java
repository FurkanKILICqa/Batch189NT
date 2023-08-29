package Odev01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String>  gunler = new ArrayList<>();

        gunler.add("Pazartesi");
        gunler.add("Sali");
        gunler.add("Carsamba");
        gunler.add("Persembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");

        List<Double> gunlukKazanc = new ArrayList<>();

        int gunIndex=0;

        while (gunIndex<gunler.size()){

            System.out.println((gunler.get(gunIndex)+ " günün kazancını girin: "));
            double kazanc =  scanner.nextDouble();

            gunlukKazanc.add(kazanc);
            gunIndex++;

        }

        System.out.println(gunlukKazanc);










    }


}


