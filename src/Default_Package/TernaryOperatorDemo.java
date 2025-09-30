package Default_Package;

public class TernaryOperatorDemo {
    public static void main (String[]args) {
        int a = 1; // Declare and initialize variable a
        int b = 2; // Declare and initialize variable b
        int result; // Declare variable result

        // Ternary operator syntax: condition ? value_if_true : value_if_false;
        // If a < b is true, result is assigned the value of a.
        // If a < b is false, result is assigned the value of b.
        result = a < b ? a : b;

        System.out.println(result); // Prints the result value
    }
}