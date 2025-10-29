package Default_Package;

// This class demonstrates basic arithmetic operations in Java.
public class ArithmeticDemo {
    public static void main(String[] args) {
        
        // Declare an integer variable 'result' and assign it the result of 1 + 2
        int result = 1 + 2;
        // Output the result of the addition
        System.out.println("1 + 2 = " + result);

        // Store the current result in another variable to preserve its value for display
        int original_result = result;

        // Subtract 1 from the current result
        result = result - 1;
        // Output the subtraction result using the previous value (original_result)
        System.out.println(original_result + " - 1 = " + result);

        // Update original_result with the new result for the next operation
        original_result = result;

        // Multiply the current result by 2
        result = result * 2;
        // Output the multiplication result
        System.out.println(original_result + " * 2 = " + result);

        // Update original_result again
        original_result = result;

        // Perform modulus operation: result modulo 7
        result = result % 7;
        // Output the modulus result
        System.out.println(original_result + " % 7 = " + result);

        // Final assignment (not used further, but included for consistency)
        original_result = result;
    }
}