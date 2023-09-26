package day16StaticOopDeneme;

public class InstanceBlockDeneme {

    //Eger tum constructorlarin icinde calismasi gereken kodlar var ise
    // tekrardan kurtulmak icin bu kodlari
    //instance block icine yazariz

    public int year;


    public InstanceBlockDeneme() {//Bu parametresiz constructer


    }

    public InstanceBlockDeneme(int year) {//Bu parametreli contructer

        this.year = year;

    }



    {//Intanceblock bu dur bunun içine tekrardan kaçınmak için
        // constructorlarin içine yazılmak istenen şeyleri InstanceBlock için yazar contructer ların isimlerinin aynı olması
        //gerekmektedir

        System.out.println("Hello World");


    }









}
