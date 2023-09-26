package day22map_extention;

public class E03 {
    public static void main(String[] args) {
        String s = "java";
        getCharFromString(s,2);
        getCharFromString(s,4);




    }


    public static void getCharFromString(String s, int idx){

        try {
            char ch= s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Olmayan index kullanma hatası yaptınız "  +  e.getMessage() );;
            System.out.println(e.getCause());
            e.printStackTrace();
            System.out.println("printStackTrace sonrssı kod çalışmaya devam eder");
        }

    }










}
