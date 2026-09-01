package aInheritance;

// first interface

interface Movable {
    void move();
}

//Second Interface

interface Eatable {
    void eat();
}


class Robot implements Movable, Eatable {

    @Override
    public void move() {
        System.out.println("This robot can move as fast as possible");
    }

    @Override
    public void eat() {
        System.out.println("This robot can eat");
    }


}


public class MultiInheritanceInterfaces {
    public static void main(String[] args) {
        Robot robot = new Robot();

        robot.move();
        robot.eat();


    }
}
