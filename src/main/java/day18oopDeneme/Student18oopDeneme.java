package day18oopDeneme;

public class Student18oopDeneme {

    /*

    Classlar palıptır
    Encapsulation Nedir? data hiding tir veri saklama dır.
    Data nasıl saklanır
    Acces modifieri privite yaparak datayi claslardan gorunmez hale getirerek saklarız
    Data hiding verileri korumak için yapılır
    Daha sade bir görünüm olması açısından Encapsulation yapılır
    Encapsulate yaptığımız
    "this" genellikle sınıfın üye değişkenleri (instance variables) ile
     sınıfın parametreleri veya yerel değişkenleri ayırt etmek için kullanılır.
     Özellikle isim çakışmalarını çözmek için önemlidir.

     set method parametre kullanır kulanmak zorundadır  "()" bu iki parantez bir parametredir yani set edilmek istenen
     datayı parametrenin içine gireriz

     */

    private String stdId = "AC3626563256956";

    public String stdname = "Ali can";

    public int age =15;

    private double notOrt= 3.13;

    private boolean succesful=false;


    public String getStdId() {//Okumak istediğimiz type in returnunde olmalıdır yukarıda String ise burada da String ile başlar
        //Parametre "()" boş olur
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccesful() {// Burada getSucessful ile yazmadık isSuccesful ile yazarız bu bir isimlendirme geleneğidir
        //mi soru eki anlamında is gelir
        return succesful;
    }

    public void setStdId(String stdId) {//Datayı public yapmadan asla başka bir clastan değiştirilemez
                                    // return type nin void olmasının sebebi sadece bir iş yapsanını istediğimiz için void kullanılır
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }
}
