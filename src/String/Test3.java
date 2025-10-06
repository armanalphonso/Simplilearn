// Declares the class in the user-defined package 'String'
package String;

// Declares the public class 'Test3'
public class Test3 {

    // Main method – Java program execution starts here
    public static void main(String[] args) {

        // Creates a new String object in heap (not from string pool)
        String s1 = new String("You cannot change Me");

        // Creates another new String object in heap (even though the content is same)
        String s2 = new String("You cannot change Me");

        // Comparing object references (heap objects)
        // They are different objects → false
        System.out.println(s1 == s2);  // Output: false

        // String literal, fetched from the String constant pool
        String s3 = "You cannot change Me";

        // Comparing a heap object (s1) with pooled literal (s3)
        // References are different → false
        System.out.println(s1 == s3);  // Output: false

        // Another string literal, same content
        // Compiler reuses the same object from the pool → same reference as s3
        String s4 = "You cannot change Me";

        // Comparing two literals → true (same reference from string pool)
        System.out.println(s3 == s4);  // Output: true

        // Compile-time constant expression: two string literals concatenated
        // Evaluated and interned at compile time → same as "You cannot change Me"
        String s5 = "You cannot " + "change Me";

        // Since s5 is evaluated at compile time, it's the same pooled object as s4 → true
        System.out.println(s4 == s5);  // Output: true

        // s6 is a literal, but s6 + "change Me" is evaluated at runtime
        // This creates a new object in heap → not the same as the pooled "You cannot change Me"
        String s6 = "You cannot";
        String s7 = s6 + "change Me";

        // s4 (pooled) vs s7 (runtime string in heap) → false
        System.out.println(s4 == s7);  // Output: false

        // s8 is a final literal, which means it's a constant known at compile time
        final String s8 = "you cannot";  // Note: lowercase "you"

        // s8 + "change Me" → since s8 is final, compiler **may** optimize this into a pooled string
        // BUT: s8 = "you cannot" and s4 = "You cannot change Me" → different content (note lowercase "y")
        String s9 = s8 + "change Me";

        // s4: "You cannot change Me"
        // s9: "you cannotchange Me" → different string (lowercase 'y' and no space)
        // References are different → false
        System.out.println(s4 == s9);  // Output: false
    }
}