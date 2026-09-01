package aMethodsAndEncapsulation;

public class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
   //This is a method with an object parameter
    public static void modifyObjectValue(Point point) {
        point.x = 1000;   //Modifies the original object(the references has been copied)
//        point.y = 200;

    }

    public static void reassignObjectValue(Point point){
        point = new Point(10,20);   //Creating new method doesn't affect original object
    }

    public static void main(String[] args) {

        //Object type examples
        Point p = new Point(1,2);
        modifyObjectValue(p);
        System.out.println("After modifyObjectValue: "+ p.x +","+p.y ); //output: 1000,2

        //After reassignment
        reassignObjectValue(p);
        System.out.println("After modifyObjectValue: "+ p.x +","+p.y );  //unchanged  output: 1000,2
    }

}
