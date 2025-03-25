package Javalearning13;

// Abstract class
abstract class Vehicle {
    // Abstract method (No implementation)
    abstract void start();

    // Concrete method (Has implementation)
    public void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

// Child class implementing abstract method
class Car extends Vehicle {
    // Providing implementation for abstract method
    @Override
    public void start() {
        System.out.println("Car starts with a key or push button.");
    }
}

// Main class
public class Abstarction {
    public static void main(String[] args) {
        // Vehicle obj = new Vehicle(); // ❌ Not allowed (abstract class cannot be instantiated)

        Car myCar = new Car();
        myCar.start(); // Calls overridden method from Car
        myCar.stop();  // Calls method from Vehicle
    }
}

