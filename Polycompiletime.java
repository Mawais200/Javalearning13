package Javalearning13;


class MathOperations {
    // Method with two integer parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three integer parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with double parameters
    public double add(double a, double b) {
        return a + b;
    }
}

public class Polycompiletime {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        // Calling overloaded methods
        System.out.println("Addition of two numbers: " + math.add(5, 10));
        System.out.println("Addition of three numbers: " + math.add(5, 10, 15));
        System.out.println("Addition of two double numbers: " + math.add(5.5, 2.5));
    }
}
