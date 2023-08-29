package day14constructorsdatime;

public class Araba {

    String make = "Honda";
    String model = "Accord";
    int year =2023;
    boolean hybrid=true;


    Araba(String make, String model, int year, boolean hybrid) {//Bu defoulttur
        this.make = make;
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }

    public void hareket(){
        System.out.println("Honda hizli hareket eder");
    }
    public void dur(){
        System.out.println("Honda guvenli bir sekilde durur");
    }

    @Override
    public String toString() {
        return "Araba{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
