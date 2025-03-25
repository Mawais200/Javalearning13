package Javalearning13;

// Define a class named Car
class Car {
    // Private attributes (fields) - Encapsulation
    private String brand;
    private String model;
    private int year;

    // Public Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Public method to get car details
    public void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }

    // Public Getter methods to access private attributes
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Public Setter methods to modify private attributes
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

// Main class to execute the program
public class Acessmodifier {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car car1 = new Car("Toyota", "Corolla", 2020);
        
        // Calling methods on object
        car1.displayInfo();
        System.out.println(); // For spacing

        // Modifying private fields using setters
        car1.setBrand("Honda");
        car1.setModel("Civic");
        car1.setYear(2022);

        // Displaying updated information
        System.out.println("Updated Car Details:");
        car1.displayInfo();
    }
}
