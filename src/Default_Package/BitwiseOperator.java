package Default_Package;

public class BitwiseOperator {
    public static void main(String[]args) {
        int a = 5;  // 5 in binary is 0101
        int b = 7;  // 7 in binary is 0111

        // Bitwise AND (&) operator:
        // Compares each bit of a and b. 
        // Result bit is 1 only if both corresponding bits of operands are 1.
        // Example: 0101 & 0111 = 0101 (which is 5)
        System.out.println("a&b =" + (a & b));

        // Bitwise OR (|) operator:
        // Compares each bit of a and b. 
        // Result bit is 1 if at least one of corresponding bits of operands is 1.
        // Example: 0101 | 0111 = 0111 (which is 7)
        System.out.println("a|b =" + (a | b));
    }
}