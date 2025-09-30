package Default_Package;

// This class demonstrates unary operators in Java.
public class UnaryDemo {
    public static void main(String[] args) {
        
        int number = 5;
        System.out.println("Original number: " + number);

        // Unary plus (no effect here)
        int positive = +number;
        System.out.println("Unary plus: +" + number + " = " + positive);

        // Unary minus (negates the number)
        int negative = -number;
        System.out.println("Unary minus: -" + number + " = " + negative);

        // Pre-increment: increments before use
        int preIncrement = ++number;
        System.out.println("Pre-increment: ++number = " + preIncrement);

        // Post-increment: increments after use
        int postIncrement = number++;
        System.out.println("Post-increment: number++ = " + postIncrement + " (number is now " + number + ")");

        // Pre-decrement: decrements before use
        int preDecrement = --number;
        System.out.println("Pre-decrement: --number = " + preDecrement);

        // Post-decrement: decrements after use
        int postDecrement = number--;
        System.out.println("Post-decrement: number-- = " + postDecrement + " (number is now " + number + ")");

        // Bitwise complement (inverts bits) — works on integers
        int bitwiseComplement = ~number;
        System.out.println("Bitwise complement: ~" + number + " = " + bitwiseComplement);

        // Logical NOT (works with booleans)
        boolean flag = true;
        System.out.println("Original boolean: " + flag);
        System.out.println("Logical NOT: !" + flag + " = " + !flag);
    }
}