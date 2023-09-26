package dayStringbuilderaccesmodifier;

public class Sb02 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);



        sb1.reverse();//Strin builderleri ters cevirir
        System.out.println(sb1);

        sb1.deleteCharAt(0);//Verilen indexteki karakteri siler
        System.out.println(sb1);


        //Başlangıç indexinden bitiş indexine kadar bitiş indexi hariç karakterleri siler
        sb1.delete(0,3);
        System.out.println(sb1);


        //replace(0,3,"x"); 0 dahil 3 haric olmak üzere indexleri alir ve yerinne x koyar
        sb1.replace(0,3,"X");//0  ve  3 arasındaki leri siler yerine girdiğimiz datayı yazar,
        // istediğimiz kadar ekleme yapabiliriz


        sb1.insert(2,"999");//Insert eklemek demekdir Arraylist lerdeki add methodu gibi
        // girilen indexten bir sonrasına ekler
        System.out.println(sb1);








        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("avaj");

        int r1 = sb2.compareTo(sb3);
        System.out.println(r1);


        //String builder String class kadar zengin değildir biz zaman zaman ondan faydalanırız

       String str = sb1.toString().toUpperCase();//Burada string e çevirip harflerini büyüttük
        System.out.println(str);



        StringBuilder newSb1 = new StringBuilder(str);//Burada String i StrinBuildere tekrardan çevirdik
        newSb1.append(88);//Ekleme
        newSb1.insert(3,788);//İndexin yanına ekleme
        System.out.println(newSb1);

        //Multi-thread(Çoklu iş) zamandan tasarruf sağlamak miçin kullanırız
        // bu sistemin verimli olması için senronisation yani mantıklı sıralama önemlidir


        /*

        1) StringBuffer java da string ureten bir diger classtir.
        StringBuffer java nin string uretmek icin olusturdugu ilk classtir

        2) StringBuffer, StringBuilder'a cok benzer, yani ikiside "mutable" string uretir
        3) StringBuffer "multi-thread" dir, ama StringBuilder "multi-thread" degildir.
        4) StringBuilder  "multi-thread"  olmadigi icin StringBuffer dan daha hizli calisir
        5) multi-thread yapilirken yapilan islerin siralamasi onem arzeder, yapilan isleri mantikli bir
        siraya koymak "synchronization" olarak adlandirilir
        StringBuffer multi-thread oldugu icin ayni zamana synchronized dir

                3 tane String olusturan class ogrendik;
                1) immutable string lazimsa ==> String class
                2) mutable string lazimsa , StringBuilder veya StringBuffer
                                a) StringBuilder i multi-thread gerekmezse kullaniriz
                                b) StringBuffer i multi-thread gerekirse kullaniriz



         */



        StringBuffer sbf = new StringBuffer("Java");//sbf obje dir// Bunu kapasitesi 20 dir ama girilen veriye göre genişler
        System.out.println(sbf);//Java






















    }


}
