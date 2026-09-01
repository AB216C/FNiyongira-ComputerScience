package bRelationships;

class Engines {
    public void start() {
        System.out.println("Engine starts.");
    }
}

class Cars {
    private Engines engine;  // Car "has an" Engine

    public Cars() {
        this.engine = new Engines();
    }

    public void startCar() {
        this.engine.start(); // Delegating the behavior to the Engine object
        System.out.println("Car starts moving.");
    }
}
public class ObjectComposition {
    public static void main(String[] args) {
        Cars car = new Cars();
        car.startCar();  // Starts the car using the engine
    }
}
