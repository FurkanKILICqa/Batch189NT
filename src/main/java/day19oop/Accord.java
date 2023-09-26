package day19oop;

public class Accord implements Ac, Engine, Security {


    @Override
    public void cool() {

        System.out.println("Accord cools very well");


    }

    @Override
    public void run() {

        System.out.println("cools bad");
    }


}
