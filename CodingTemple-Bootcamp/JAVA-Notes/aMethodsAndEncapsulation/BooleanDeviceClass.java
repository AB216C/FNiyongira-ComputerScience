package aMethodsAndEncapsulation;
class Device {
    public String name;
    public String type;
    public boolean isOn;

    public Device(String name) {
        this.name = name;
        this.type = "Unknown";
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(name + " is on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " is off.");
    }

    public void doSomething() {
        if (type.equals("Phone")) {
            System.out.println(name + " is making a call.");
        } else if (type.equals("Laptop")) {
            System.out.println(name + " is opening a document.");
        } else {
            System.out.println(name + " is doing something.");
        }
    }
}
public class BooleanDeviceClass {
    public static void main(String[] args) {

        Device device = new Device("Laptop");
        device.turnOff();
        device.turnOn();
        device.doSomething();

    }
}
