package Javalearning13;

// Parent class
class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {
    // Overriding the parent class method
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Child class 2
class Cat extends Animal {
    // Overriding the parent class method
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

// Main class to test polymorphism
public class Runtimepoly {
    public static void main(String[] args) {
        // Parent class reference holding child class object (Runtime Polymorphism)
        Animal myAnimal;  

        myAnimal = new Dog();
        myAnimal.makeSound(); // Calls Dog's makeSound()

        myAnimal = new Cat();
        myAnimal.makeSound(); // Calls Cat's makeSound()
    }
}

