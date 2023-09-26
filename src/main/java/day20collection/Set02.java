package day20collection;

import java.util.HashSet;
import java.util.TreeSet;

public class Set02 {

    public static void main(String[] args) {

        //Example 1: Ogrenci email adreslerini natural order'da siralanmis olarak depolayiniz.

        long t1 = System.nanoTime();

        //1. Yol
        TreeSet<String> emails = new TreeSet<>();
        emails.add("k@gmail.com");
        emails.add("a@gmail.com");
        emails.add("z@gmail.com");
        emails.add("y@gmail.com");
        emails.add("r@gmail.com");
        emails.add("u@gmail.com");
        System.out.println(emails);

        //Alfabetik sıra ile sıralar



        //2:yol
        long t2 = System.nanoTime();
        HashSet<String> emailsHs = new HashSet<>();//Rasgele sıralar

        emailsHs.add("k@gmail.com");
        emailsHs.add("a@gmail.com");
        emailsHs.add("z@gmail.com");
        emailsHs.add("y@gmail.com");
        emailsHs.add("r@gmail.com");
        emailsHs.add("u@gmail.com");
        System.out.println(emailsHs);


        TreeSet<String> emailHsTs = new TreeSet<>(emailsHs);//Tek seferde sıraya dizer

        System.out.println(emailHsTs);

        long t3 = System.nanoTime();

        System.out.println(t2-t1);//treeset
        System.out.println(t3-t2);//hashset




















    }
}
