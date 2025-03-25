import java.util.*;

// Define a class named Car
class Car {
    // Attributes (fields)
    private String brand;
    private String model;
    private int year;

    // Getter methods
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Constructor
    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}

// Main class to execute the program
public class Classesobj {
    public static void main(String[] args) {
        // Creating objects of the Car class
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Honda", "Civic", 2022);

        // Calling methods on objects
        car1.displayInfo();
        System.out.println(); // For spacing
        car2.displayInfo();
    }
}
