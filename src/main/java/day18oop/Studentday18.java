package day18oop;

public class Studentday18 {

    //Encapsulation (Kapsülleme kapsülün içine koymak) Encapsulation bir class tır variable ve methodu içinde gizle

    /*

        Classlar bir kalıptır objeleri biz o class dan üretiriz

     */
    /*

    //Data type boolean ise get method artık is ile gaşlar Encapsulation yaparsak boolean larda öyle mi diye sorar
    //o yüzden başa is gelir öyle mi demek için bir boolean için oluşturulursa is kullanılır

    //Get methodları sadece aynı classlardaki priviteler için yapabilir

     */
    //Encapsulation -  kapsulleme
    /*
    Encapsulation nedir? Data hiding (Veri saklamak)
    Data nasil saklanir?
    Access modifier larini private yaparak datayi diger classlardan gorunmez hale getiririm
    boylece datayi saklamis olurum

    Encapsulation yaptigimiz datayi istersek diger classlardan okuyabiliriz
    Nasil okuruz?
    get method olusturarak Encapsulate edilmis datanin degerini okuyabiliriz

   1) get method lar public olur
   2) get methodun return type i okudugu variable ile ayni olur
   3) get method bir boolean variable icin olusturulduysa ismi is ile baslar


        1) set methodlar public olur
    2) set methodun return typei hep void olur.
    3) set method parametre kullanir, parametrenin data typei set edilmek istenen variable
    ile ayni olur

    set method kullanarak varolan object uzerinde degisiklikler yaparak o objecti sanki yeni bir objectmis gibi kullanabiliriz
    get methodlarin diger adina getter set methodlarin diger adina setter denir

    java beans ==> getter ve setterlarin ikisine birden java beans denir


     */

    public String stdName ="Ali Can";
    public int age = 17;
    private String stdId= "AC1234567";
    private double notOrt=3.87;
    private boolean succesful = false;

    public String getStdId() {
        return stdId;
    }
    public double getNotOrt() {
        return notOrt;
    }
    public boolean isSuccesful() {
        return succesful;
    }

    public void setStdId(String stdId) {//Bu method da değiştirmek için değiştirmek için datayı public yaparız
                                        //sadece set edeceğimi için void dedik void sadece birişlem yapar return etmez
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;//Bu calss daki not ortalamasını bizim bizim oluşturduğumuz not ortalamasına aktarır
    }

    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }
}

