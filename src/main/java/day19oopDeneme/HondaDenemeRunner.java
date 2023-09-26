package day19oopDeneme;

import day19oop.Accord;

public class HondaDenemeRunner {
    public static void main(String[] args) {

        CivicDeneme c2 = new CivicDeneme();
        c2.cool();
        c2.run();
        AccordDeneme c3 = new AccordDeneme();
        c3.cool();
        c2.run();

        System.out.println(AcDeneme.price);
        System.out.println(EngineDeneme.price);
        System.out.println(SecurityDeneme.price);



        AccordDeneme def = new AccordDeneme();
        def.eco();
        EngineDeneme.stop();









    }
}
