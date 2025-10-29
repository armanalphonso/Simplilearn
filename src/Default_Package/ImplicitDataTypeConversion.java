// Package declaration
package Default_Package;

// Class declaration
public class ImplicitDataTypeConversion {

    // Main method: Entry point of the program
    public static void main(String[] args) {

        // ===== Step 1: Declare an int variable =====
        // 'int' is a 32-bit signed integer
        int a = 100;
        System.out.println("Int representation: " + a);

        // ===== Step 2: Implicitly convert int to long =====
        // 'long' is a 64-bit signed integer
        // Since long has a larger range than int, the conversion is done automatically (implicit)
        long b = a;
        System.out.println("Long representation: " + b);

        // ===== Step 3: Implicitly convert long to float =====
        // 'float' is a 32-bit floating-point type (can represent larger numbers but with less precision than long)
        // Java allows implicit conversion from long to float
        float c = b;
        System.out.println("Float representation: " + c);
    }
}