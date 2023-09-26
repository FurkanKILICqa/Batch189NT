package day18oopDeneme;

public class Student1800pDenemeRunner {
    public static void main(String[] args) {

        // Bu methodu bazı uygulamalarda bazı classlara kişilere özel yetki vermemiz gerekebilir o yüzden
        //Encapsulation methodunu kullanırız "getter,setter"
        //Tekrara tekrar obje oluşturmaya gerek kalmadan bir obje ile tekrar tekrar güncelleyerek memory kullanımının önüne geçtik
        //Get methodunu veriyi okumak için kullanılır mesela mobil bankacılıkta hesabınızdaki bakiyeyi görmek gibi size özeldir
        //bakabilirsiniz ama değiştiremezsiniz
        Student18oopDeneme s1 = new Student18oopDeneme();

        System.out.println(s1.getStdId());//Diğer class da getter oluşturmasaydık bu private classı göremedik
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccesful());

        System.out.println("==============================================");


        s1.setNotOrt(5.88);
        System.out.println(s1.getNotOrt());
        s1.setStdId("CA5122445411254155");
        System.out.println(s1.getStdId());//Set methodu ile değiştirdik get methodu ile değiştirilenleri yazdırdık
        s1.setSuccesful(true);
        System.out.println(s1.isSuccesful());//Set methodlar kalıbı değiştiremez yani orjinalini değiştiremez
        //ancak bizim istediğimiz şekilde yazdırır orjinali aynuı kalır ama yazdırmazsak değiştirdiğimiz konsolda görünür



    }

}
