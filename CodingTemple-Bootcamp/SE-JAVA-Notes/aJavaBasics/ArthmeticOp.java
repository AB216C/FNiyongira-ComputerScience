package aJavaBasics;
public class ArthmeticOp {
    public static void main(String[] args) {
        int num = 45 + 345-34*34-43;
        //And keep in mind, for integer division, we will always round down!
        int num2 = 800/455;
        int num3 = 3044%345;

        System.out.println("Final answer will be:" + num);
        System.out.println("Second answer:" + num2);
        System.out.println("Third answer:" + num3);


        int intValue = 10;
        long longValue = 20L;
        long result = intValue + longValue;     // This is lives a long value since it is a large dataType
        System.out.println(result);

        double doubleValue = 4.5;
        int integerValue = 3;
        double resultDouble = doubleValue + integerValue;    //Result will be decimal
        System.out.println(resultDouble);

        byte byteValue = 10;
        short shortValue = 20;

        int Result = byteValue + shortValue;  //This will promote int if added together
        System.out.println(Result);

        //UNARY OPERATOR
        //pre-unary operator ++ --
        //first, count is incremented to 6;
        //then the result is assigned to a new value of count, 6;

        int count = 5;
////
//        int results1 = --count;
        int results2 = ++count;
//
//        System.out.println(results1);
        System.out.println(results2);

        //post-unary Operator
        //first, the value is assigned to the value of count,5
        //Then the count is incremented to 6

        int result11 = count++;
//        int result22 = count--;

        System.out.println(result11);    //This gives the initial value before increment
//        System.out.println(result22);
//

        //Exercises

        int x = 4;
        int y = x+++--x+x;

        System.out.println(x);
        System.out.println(y);

        int a = 5;
       // int b = --a * 2+a+++a-- * 3+++a;
        System.out.println(a);
        //System.out.println(b);

        /*
        Step-by-Step Breakdown:
Initial value of a = 5.
-a:
Pre-decrement: a is decremented before being used.
So, a becomes 4, and the expression becomes:
b = 4 * 2 + a++ + a-- * 3 + ++a;

4 * 2 = 8:
Now, the expression is:
b = 8 + a++ + a-- * 3 + ++a;

a++:
Post-increment: a is used first and then incremented.
So, a is still 4 when used, but after this, a becomes 5.
Now the expression becomes:
b = 8 + 4 + a-- * 3 + ++a;

a--:
Post-decrement: a is used first and then decremented.
So, a is 5 when used in a-- * 3, but after this, a becomes 4.
Now the expression is:
b = 8 + 4 + 5 * 3 + ++a;

5 * 3 = 15:
The multiplication is performed, so the expression becomes:
b = 8 + 4 + 15 + ++a;

++a:
Pre-increment: a is incremented before being used.
So, a becomes 5, and the expression becomes:
b = 8 + 4 + 15 + 5;

Final Calculation:
b = 8 + 4 + 15 + 5 = 32.
Final Values:
a is 5 (after all the increments and decrements).
b is 32.
        */
    }
}


