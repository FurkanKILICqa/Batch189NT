package day16StaticOop;

public class InstanceBlock {

    //Eger tüm consructerlerin içinde calismasi gereken kodlar var ise tekrardan kurtulmak için bu kodlari
    //instance block içine yazariz

    public int year;

    public InstanceBlock() {//Defoult yani parametresiz consructior


    }


    public InstanceBlock(int year) {
        this.year = year;


    }

    {//Bu bir instance block dur


        System.out.println("hi");

    }











}
