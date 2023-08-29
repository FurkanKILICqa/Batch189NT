package Alıştırmasoru;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        /*


        / \n (or \r): starts from a new line : metni bir alt satırdan itibaren yazdırır.
              \t:  horizontal tab : metni yatayda 1 tab miktarı kaydırır.
              \\: prints a back slash :\ (ters slash) yazdırır
              \': prints single quote :' tek tırnak yazdırır.
              \": prints double quote :"" Çift tırnak yazdırır.

         */

        /*


        Scanner input = new Scanner(System.in);

        System.out.println("Bu işte kaç kişi çalışacak");

        int elemanSayisi = input.nextInt();

        System.out.println(10/elemanSayisi);

         */


        /*
        TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
         */

        /*

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        String Ad = input.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");
        double boy = input.nextDouble();

        System.out.println("Lütfen boyunuzu giriniz");
        byte yas = input.nextByte();


         */

        /*

        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınız ve Soyadınız: ");
        String name = scanner.nextLine();

        System.out.print("Yaşınız: ");
        int age = scanner.nextInt();

        System.out.print("Kilonuz (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Boyunuz (cm): ");
        double height = scanner.nextDouble();

        System.out.print("Salona devam edeceğiniz ay sayısı: ");
        int months = scanner.nextInt();

        double monthlyFee = 20.0;
        double totalFee = monthlyFee * months;

        System.out.println("\n---- Üyelik Bilgileri ----");
        System.out.println("Ad Soyad: " + name);
        System.out.println("Yaş: " + age);
        System.out.println("Kilo: " + weight + " kg");
        System.out.println("Boy: " + height + " cm");
        System.out.println("Devam Edilecek Ay Sayısı: " + months);
        System.out.println("Toplam Ücret: $" + totalFee);

         */

        //scanner 03
    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz
        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

        /*

        Scanner scanner = new Scanner(System.in);

        System.out.print("a sayısını giriniz: ");
        double a = scanner.nextDouble();

        System.out.print("b sayısını giriniz: ");
        double b = scanner.nextDouble();

        System.out.print("c sayısını giriniz: ");
        double c = scanner.nextDouble();

        double result = (a * a) - (b * b);
        result /= c * 3;

        System.out.println("Sonuç: " + result);

         */

        /*
         Kullanicidan kilosunu ve boyunu alip
         Vucut kitle indeksini hesaplayan bir program yaziniz.
         Ipucu : Vucut
         Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
         ORNEK:
         INPUT      : Kilo: 71
                           Boy: 1,72
         OUTPUT  : Vucut Kitle Indeksiniz : 23
             */
        /*

        Scanner input = new Scanner(System.in);

        System.out.println("lütfen kilonuzu veriniz");

        double kilo = input.nextDouble();

        System.out.println("Lütfen boyunuzu giriniz");

        double boy = input.nextDouble();

        double result = kilo / (boy*boy);

        System.out.println("Sonuc " + result);

         */

         /*
        bir lunaparka gelen musteriye once
        annesinden izin alıp alamadigini
        sorun aldiysa yasini sorun yasi (15e esit)15'ten buyukse
        kilosunu sorun kilosu (100e esit degil)100'den
         kucuk  binebilmesine izin verin
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Annenden izin aldın mı? (Evet/Hayır): ");

        String Izin = input.nextLine();


























































    }
}
