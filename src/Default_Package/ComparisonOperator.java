// Package declaration (optional, usually used to group classes logically)
package Default_Package;

// Class declaration
public class ComparisonOperator {

    // Main method: Entry point of the program
    public static void main(String[] args) {

        // Declare and initialize two integer variables
        int value1 = 1;
        int value2 = 2;

        // Comparison using '=='
        // Checks if value1 is equal to value2
        if (value1 == value2)
            System.out.println("value1 == value2");

        // Comparison using '!='
        // Checks if value1 is NOT equal to value2
        if (value1 != value2)
            System.out.println("value1 != value2");

        // Comparison using '>'
        // Checks if value1 is greater than value2
        if (value1 > value2)
            System.out.println("value1 > value2");

        // Comparison using '<'
        // Checks if value1 is less than value2
        if (value1 < value2)
            System.out.println("value1 < value2");

        // Comparison using '<='
        // Checks if value1 is less than or equal to value2
        if (value1 <= value2)
            System.out.println("value1 <= value2");
    }
}