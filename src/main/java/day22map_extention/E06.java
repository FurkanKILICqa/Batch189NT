package day22map_extention;

public class E06 {

    public static void main(String[] args) {

    String s = "Java";
    getNumberOfChars(s);


    String u = null;
    getNumberOfChars(u);//Bu nu yazarak u variablesini çalıştırdık

    }

    public static void getNumberOfChars(String s){

        //String in degeri null oludugu zaman string class daki methodlari kullanamazsiniz
        //cunku java NullPointerException atar
        try {
            int numOfChars = s.length();
            System.out.println(numOfChars);
        } catch (Exception e) {
            System.err.println("null değeri için string methodlari kullanılamaz " + e.getMessage() );
            e.getCause();

        }
    }















}
