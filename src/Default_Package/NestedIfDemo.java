package Default_Package;

public class NestedIfDemo {
    public static void main(String args[]) {
        int i = 50; // Variable declaration and initialization

        // Outer if: checks if i equals 50
        if(i == 50) {
            System.out.println("i is 50");

            // First nested if: executes only if outer if condition is true
            if (i < 75) {
                System.out.println("i is smaller than 75");

                // Second nested if: executes only if both outer and first nested conditions are true
                if (i < 55) {
                    System.out.println("i is also smaller than 55");
                }
            }
        }
    }
}