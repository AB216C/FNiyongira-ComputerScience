package aMethodsAndEncapsulation;
//Static specifier Examples
public class Counter {
    //Public static variable shared among all instances

    public static int count = 0;
    public int personalCount = 0;

    public static void main(String[] args) {
        //Modify the static variable directly

        Counter.count++;
        System.out.println("Count after first modification: First count: " + Counter.count);

        //Create an instance of counter

        Counter c1 = new Counter();
        System.out.println("Count after creating First instance: " + Counter.count);   //Same result as previous method: 1

        //Modify static variable through the instance
        c1.count++;

        System.out.println("Result:"+Counter.count);

        //Create another instance of counter

        Counter c2 = new Counter();

        System.out.println("Count after creating 2nd instance: "+Counter.count);

        //Modify static variable throgh second instance

        c2.count++;

        System.out.println("Result: "+Counter.count);

        //Adding a personal counter

        c2.personalCount++;
        System.out.println("Static counter:" + Counter.count);      // only public static counter is shared among all counters.
        System.out.println("1st Personal count:"+c1.personalCount);
        System.out.println("2nd Personal count:"+c2.personalCount);
        

    }
}
