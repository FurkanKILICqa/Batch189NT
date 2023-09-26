package day22map_extention;

public class E02 {
    public static void main(String[] args) {

        String s = "1234a";

        ConvortStringToInt(s);

    }
    public static void ConvortStringToInt(String s){

        //Icinde rakamlar disinda bir character olan stringi sayiyia cevirmek isterseniz java NumberFormatException atar

        try {
            int inss = Integer.valueOf(s);
            System.out.println(inss+1);
        }catch (NumberFormatException e){
            System.out.println("Bir string sayıya harf içerirken dönüştürülemez");

            System.out.println(e.getMessage()); // Oluşan hatayı gösterir == !!! For input string: "1234a"!!!
        }





    }




























}
