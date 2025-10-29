// Package declaration
package Default_Package;

// Class declaration
public class ExplicitDataTypeConversion {

    // Main method: Entry point of the Java application
    public static void main(String[] arg) {

        // ===== Step 1: Declare a double variable =====
        // 'double' is a 64-bit floating-point number (default for decimal values)
        double a = 50.50;
        System.out.println("Double representation: " + a);

        // ===== Step 2: Explicitly convert double to float =====
        // 'float' is a 32-bit floating-point number
        // This conversion can result in loss of precision, so it's done explicitly
        float f = (float) a;  // Type casting required
        System.out.println("Float representation: " + f);

        // ===== Step 3: Explicitly convert double to long =====
        // 'long' is a 64-bit integer — this conversion drops the decimal part
        long b = (long) a;  // Fractional part (.50) will be truncated
        System.out.println("Long representation: " + b);

        // ===== Step 4: Explicitly convert long to int =====
        // 'int' is a 32-bit integer — no data loss here unless the value exceeds int range
        int c = (int) b;
        System.out.println("Int representation: " + c);
    }
}