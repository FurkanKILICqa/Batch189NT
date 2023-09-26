package day19oop;

public class HondaRunner19 {
    public static void main(String[] args) {

        Civic myCivic = new Civic();
        myCivic.cool();
        myCivic.run();



        Accord yourAccord = new Accord();
        yourAccord.cool();
        yourAccord.run();

        System.out.println(Ac.price);// İnterface deki variable ler staticdir

        System.out.println(Ac.price);
        System.out.println(Engine.price);
        System.out.println(Security.price);

         //Güvenle durur true veya false


        myCivic.eco();
        Engine.stop();
        System.out.println(myCivic);
        System.out.println(Engine.stop());


    }


}
