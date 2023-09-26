package day18oop;

public class StudentDay18Runner {
    public static void main(String[] args) {

        Studentday18 ali = new Studentday18(); //Ali objesi

        System.out.println(ali.getStdId());
        System.out.println(ali.getNotOrt());
        System.out.println(ali.isSuccesful());

        //Bunları privite leri görebilmek için yazdık

        System.out.println("========================");


        ali.setNotOrt(3.13);//Burada alinin not ortalamasını değiştirdik oluşturulan set methodu ile
        System.out.println(ali.getNotOrt());











    }


}
