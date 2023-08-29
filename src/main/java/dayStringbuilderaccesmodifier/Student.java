package dayStringbuilderaccesmodifier;

public class Student {

    //Acess Modifier
    /*
    1)public
    2)protected
    3)default
    4)privite

    public > protected > defoult > privite


     */

    //Her classtan kullanılabilir başka classlardan cağırılabilir
    public String stdName = "Ali Can";


    //Protected lar başka package dan sadece child classlardan görülebilir yani aynı olmaları gerekir
    protected String adress = "Istanbul";

    //defoult acces modifier larda kewward yazilmaz yani defoult ise defoult yazilmaz
    //defoult olanlar baska package lardan kullanamayız
     String email ="furkan231@mail.com"; // default String email ="furkan231@mail.com"; bu şekilde yazılmaz

    //Sadece class içinden görülür
    private String ssn1="123456789";






















}
