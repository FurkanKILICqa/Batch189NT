package Odev01;

import java.util.ArrayList;
import java.util.Scanner;

public class odev2 {


        public static void main(String[] args) {
            ArrayList<String> gunler = new ArrayList<>();
            ArrayList<Double> gunlukKazanclar = new ArrayList<>();

            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < 7; i++) {
                System.out.print((i + 1) + ". gün kazancını giriniz: ");
                double kazanc = scanner.nextDouble();
                gunlukKazanclar.add(kazanc);

                // Günleri gunler ArrayList'ine ekleyin (örneğin "Pazartesi", "Salı" gibi)
                // Burada kullanıcıdan da gün adını alabilirsiniz.
                gunler.add(getGunAdi(i));
            }

            double ortalamaKazanc = getOrtalamaKazanc(gunlukKazanclar);
            System.out.println("Ortalama Kazanç: " + ortalamaKazanc);

            ArrayList<String> ustundeKazancGunleri = getOrtalamaninUstundeKazancGunleri(gunlukKazanclar, ortalamaKazanc);
            System.out.println("Ortalamanın Üstünde Kazanç Günleri: " + ustundeKazancGunleri);

            ArrayList<String> altindaKazancGunleri = getOrtalamaninAltindaKazancGunleri(gunlukKazanclar, ortalamaKazanc);
            System.out.println("Ortalamanın Altında Kazanç Günleri: " + altindaKazancGunleri);
        }

        public static double getOrtalamaKazanc(ArrayList<Double> kazanclar) {
            double toplamKazanc = 0;
            for (double kazanc : kazanclar) {
                toplamKazanc += kazanc;
            }
            return toplamKazanc / kazanclar.size();
        }

        public static ArrayList<String> getOrtalamaninUstundeKazancGunleri(ArrayList<Double> kazanclar, double ortalama) {
            ArrayList<String> ustundeKazancGunleri = new ArrayList<>();
            for (int i = 0; i < kazanclar.size(); i++) {
                if (kazanclar.get(i) > ortalama) {
                    ustundeKazancGunleri.add(getGunAdi(i));
                }
            }
            return ustundeKazancGunleri;
        }

        public static ArrayList<String> getOrtalamaninAltindaKazancGunleri(ArrayList<Double> kazanclar, double ortalama) {
            ArrayList<String> altindaKazancGunleri = new ArrayList<>();
            for (int i = 0; i < kazanclar.size(); i++) {
                if (kazanclar.get(i) < ortalama) {
                    altindaKazancGunleri.add(getGunAdi(i));
                }
            }
            return altindaKazancGunleri;
        }

        public static String getGunAdi(int gunIndex) {
            String[] gunAdlari = {"Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"};
            return gunAdlari[gunIndex];
        }
    }

