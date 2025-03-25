package Javalearning13;

// Parent class (Superclass)
class Vehicle {
    // Protected attributes (Accessible by subclasses)
    protected String brand;
    protected int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayVehicleInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Child class (Subclass) inheriting from Vehicle
class Car extends Vehicle {
    private String model;

    // Constructor
    public Car(String brand, String model, int year) {
        super(brand, year); // Call superclass constructor
        this.model = model;
    }

    // Method specific to Car class
    public void displayCarInfo() {
        displayVehicleInfo(); // Calling parent class method
        System.out.println("Model: " + model);
    }
}

// Main class to execute the program
public class Inheritence {
    public static void main(String[] args) {
        // Creating an object of Car class
        Car car1 = new Car("Toyota", "Corolla", 2020);

        // Calling methods without overriding
        car1.displayVehicleInfo(); // Calls method from Vehicle class
        System.out.println(); // For spacing
        car1.displayCarInfo(); // Calls method from Car class
    }
}
