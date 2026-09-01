package bRelationships;
//The has-a relationship represents composition or aggregation. It is used when one class contains another class as a member (field).
// This relationship shows that one class is composed of one or more objects of other classes.
//a Car has an Engine. The Car class is composed of the Engine class. The engine is a part of the car.

class Engine {
    // Engine properties and methods
}

class Car {
    private Engine engine; // Car "has an" Engine

    public Car() {
        this.engine = new Engine();
    }
}

public class HasArelationship {
}
