package Default_Package; // Package declaration - defines the package name

public class FactorialDemo { // Public class declaration

    /**
     * The main method serves as the entry point for the Java application.
     * JVM calls this method to begin program execution.
     * 
     * @param args String array to accept command-line arguments
     */
    public static void main(String[] args) { // Main method declaration
        // public: accessible by JVM from anywhere
        // static: class-level method, so JVM can call without creating an object
        // void: does not return any value
        // main: predefined method name that JVM looks for as the program entry point
        // String[] args: array to hold command-line arguments
        
        // Create an instance of ComplexFunction class to use its methods
        ComplexFunction complexFunction = new ComplexFunction();
        
        // Call calculateFactorial method with input 5 and store the result
        int result = complexFunction.calculateFactorial(5);
        
        // Print the result to the console
        System.out.println("Factorial of 5 is: " + result);
    }
}