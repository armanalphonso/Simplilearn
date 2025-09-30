package Default_Package;

public class LogicalOperator {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;

        // if statement syntax:
        // if (condition) { // block of code }
        // Executes the block if the condition evaluates to true
        // In this example, checks if value1 equals 1 AND value2 equals 2 using '&&'
        if ((value1 == 1) && (value2 == 2)) {
            // Both conditions must be true for this block to execute
            System.out.println("value1 is 1 And value2 is 2");
        }
        
        // '||' (logical OR) means either the first condition OR the second must be true
        // Here, checks if value1 equals 1 OR value2 equals 1
        if ((value1 == 1) || (value2 == 1)) {
            // If either condition is true, this block executes
            System.out.println("value1 is 1 or value2 is 1");
        }
    }
}