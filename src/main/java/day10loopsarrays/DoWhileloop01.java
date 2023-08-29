package day10loopsarrays;

import java.util.Scanner;

public class DoWhileloop01 {

    public static void main(String[] args) {


         /*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
 */

        Scanner input = new Scanner(System.in);


        int counter=0;//0 etkisiz elemandır o yüzden 0 dedik /Counter bir variable name dir bir araç değlidir bir isimdir



        do {

            if (counter==4){

                System.out.println("Hesabınız bloke olmuştur");
                break;
            }

            System.out.println("Username giriniz");

            String userName = input.next();

            System.out.println("Password u giriniz");

            String password = input.next();


            if (userName.equals("admin") && password.equals("pwd123")){// Stringlerde eşitmi değilmi diye kontrol etmek için
                //equals methodunu kullanırız

                System.out.println("Hesabınıza hoş geldiniz");

                break;
            }

            counter++;


        }while (counter<5);






























    }
}
