package day19oopDeneme;

public class AccordDeneme implements AcDeneme, EngineDeneme, SecurityDeneme {




    @Override
    public void cool() {
        System.out.println("Accord cools super");
    }

    @Override
    public void run() {
        System.out.println("Engine runs super");
    }


}
