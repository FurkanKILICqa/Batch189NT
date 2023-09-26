package day24enum_iterator_lambda;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {


        Cities hatay = Cities.HATAY;

        System.out.println(hatay);


        String adanaCityName = Cities.ADANA.getCityName();
        System.out.println(adanaCityName);

        String ankaraPotalCode = Cities.ANKARA.getPotalCode();
        System.out.println(ankaraPotalCode);

        System.out.println(Cities.İSTANBUL.getPlateCode());

        ////Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen istediğiniz ilin plakasını giriniz");
        int plaka = input.nextInt();




        Cities cities [] = Cities.values();
        //System.out.println(Arrays.toString(cities));

        if (plaka>81 || plaka<1){

            System.out.println("Girmiş olduğunuz plaka geçersizdir");
        }else {
            for (Cities w:cities) {

                if (plaka == w.getPlateCode()){

                    System.out.println("Girmiş olduğunuz plaka " + w.getCityName()+ " iline aittir ");
                    break;
                }


            }
        }






    }


}
