package Default_Package; // Package declaration - defines the package name for this class

/**
 * ComplexFunction class contains methods to perform complex calculations.
 */
public class ComplexFunction { // Class declaration - public means accessible from other classes

    /**
     * Method to calculate factorial of a number using recursion.
     * @param n integer input whose factorial is to be calculated
     * @return factorial of the input number as an integer
     */
    public int calculateFactorial(int n) { // Method declaration
        // The method is public (accessible outside this class)
        // returns an int value (factorial)
        // and takes one int parameter n
        
        if (n == 0) { // Base case for recursion: factorial of 0 is 1
            return 1; // Return statement to return the value
        } else {
            // Recursive call: method calls itself with (n-1)
            // factorial(n) = n * factorial(n-1)
            return n * calculateFactorial(n - 1);
        }
    }
}