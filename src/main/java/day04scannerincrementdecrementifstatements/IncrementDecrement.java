package day04scannerincrementdecrementifstatements;

public class IncrementDecrement {

    public static void main(String[] args) {


        // IncrementDecrement arttırma ve azaltma demetir

        //Increment :

        //Increment :
        int a = 5;
        System.out.println(a);

        a = a + 2;//7
        System.out.println(a);

        a += 2;//9
        System.out.println(a);

        //Decrement
        int c = 8;
        System.out.println(c);

        c = c - 3;//5
        System.out.println(c);

        c -= 3;
        System.out.println(c);//2

        //Increment 2

        int d = 6;
        System.out.println(d);//6

        d = d * 2;
        System.out.println(d);//12

        d *= 2;//24
        System.out.println(d);


        //decrement 2
        int e = 24;
        System.out.println(e);//24

        e = e / 2;
        System.out.println(e);//12

        e /= 2;
        System.out.println(e);//6

        //1 ile increment
        int f = 13;

        // f = f + 1;
        // f += 1;
        f++;

        //1 ile decrement
        int h = 9;
        //h = h - 1;
        // h -= 1;
        h--;




        //Ornek

        int p = 17;
        int r = p--;

        System.out.println(p);
        System.out.println(r);

        int s = 20; // 19 yaptıktan sonra t olduğu için ikiside 19 dur
        int t = --s;

        System.out.println(s);
        System.out.println(t);

























    }




}
