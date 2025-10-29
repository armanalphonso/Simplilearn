package Default_Package; 
// Package declaration to organize the class

public class MethodOverloadingDemo {
    // Method to multiply two integers
    public int multiply(int x, int y) {
        return (x * y);
    }

    // Overloaded method: multiply three integers (same method name, different number of parameters)
    public int multiply(int x, int y , int z) {
        return(x * y * z);
    }

    // Overloaded method: multiply two double values (same method name, different parameter types)
    public double multiply(double x, double y) {
        return(x * y);
    }

    // Main method - program starts here
    public static void main(String[] args) {
        MethodOverloadingDemo demo = new MethodOverloadingDemo(); 
        // Create an object of the class to call instance methods

        System.out.println(demo.multiply(10, 20));       // Calls multiply(int, int)
        System.out.println(demo.multiply(10, 20, 30));   // Calls multiply(int, int, int)
        System.out.println(demo.multiply(10.5, 20.5));   // Calls multiply(double, double)
    }
}