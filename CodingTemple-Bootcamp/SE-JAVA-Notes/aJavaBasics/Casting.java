package aJavaBasics;
public class Casting {
    public static void main(String[] args) {
        //CASTING:
        //Using paranthesis to specify the types of our value
        //Helps to create java that doesn't break

        int a = (int)5.8;   //Casted a decimal to an int
        System.out.println(a);


        short x = 5;
        short y = 30;

       // short z = x * y; // This will a compiler error because x*y need to be promoted, need to be given a value type

       short z = (short)(x * y);

        System.out.println(z);

        //COMPOUND Arthmetic operator
//        long i = 21;
//        int j = 12;
//        j *= i;  //casting result to int

        int i = 50;
        i +=5;

        short d = 100;
        d -= 200;

        System.out.println(i);
        System.out.println(d);

        //Weird expressions

        int  n = 10;
        int m = (n=200);

        System.out.println(n);
        System.out.println(m);









    }
}
