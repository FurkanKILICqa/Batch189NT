package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class MethodCreation01 {

    public static void main(String[] args) {

        int carpmaSonucu =  multiply(3,5);
        System.out.println(carpmaSonucu);

        int sonuc = firstmultiply(4,5,9);

        System.out.println(sonuc);

        print("Ali Can");






    }


    protected static int multiply(int a, int b){//Burada local veriable tanımlıyoruz//Buraya static yazmalıyız

        return a*b;//Method call methodu retorn ile çağırmak






        }//Ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.++

    protected static int firstmultiply(int d, int e, int c ){//Parantez içindeki lere parametre denir

        return d*e+c;




    }

    //Ornek 3: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
    public static void print(String str ){
        System.out.println(str);
    }

    //Eger bir method yeni bir data üretmiyor ise return type i void olur
    //methodun return type i void ise method body icinde return keyword yazilmaz
    //Note : Method olusturmada kullanilan variable lar parametreler "parameters" olarak adlandirilir
    //      Method call da kullanilan degerlere Argumanlar "Arguments" denir.






















































}
