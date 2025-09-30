// Package declaration
package Default_Package;

// Class declaration
public class PrimitiveDataTypes {

    // Main method: Entry point of the Java application
    public static void main(String[] args) {

        // Declaring and initializing a char variable
        // 'char' stores a single 16-bit Unicode character
        char a = 'A';  // Character literal

        // Declaring and initializing a byte variable
        // 'byte' is an 8-bit signed integer (-128 to 127)
        byte b = 2;

        // Declaring and initializing a short variable
        // 'short' is a 16-bit signed integer (-32,768 to 32,767)
        short c = 22;

        // Declaring and initializing an int variable
        // 'int' is a 32-bit signed integer (commonly used for integer values)
        int d = 45;

        // Declaring and initializing a float variable
        // 'float' is a 32-bit single-precision floating point
        // Literal ends with 'f' to indicate it's a float (not double)
        float e = 5.123451f;

        // Declaring and initializing a double variable
        // 'double' is a 64-bit double-precision floating point (default type for decimals)
        // The 'd' at the end is optional; it's used here for clarity
        double f = 4.68295233535d;

        // Declaring and initializing a boolean variable
        // 'boolean' holds only two possible values: true or false
        boolean g = true;

        // Printing values of all primitive data types to the console
        System.out.println("char: " + a);
        System.out.println("byte: " + b);
        System.out.println("short: " + c);
        System.out.println("int: " + d);
        System.out.println("float: " + e);
        System.out.println("double: " + f);
        System.out.println("boolean: " + g);
    }
}