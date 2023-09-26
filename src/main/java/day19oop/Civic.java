package day19oop;

public class Civic implements Ac , Engine , Security {
    //Eğer parent interface olursa parenti yapmak için extance yerine
    // implements kullanılır

    //Interface

    //Ortak özellikler parent class a konulur child class lar atomik yapılır



    @Override
    public void cool() {

        System.out.println("Civic cools perfectly");

    }

    @Override
    public void run() {//Bu run ın hangi parent dan geldiğinin bir önemi yoktur zaten hepsi aynı komutu veriyor

        System.out.println("cools good");

    }




}
