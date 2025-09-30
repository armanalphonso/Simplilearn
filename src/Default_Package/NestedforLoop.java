package Default_Package;

public class NestedforLoop {
    public static void main(String[] args) {
        // Declare and initialize a 2D array with 3 rows and 3 columns
        int arr[][] = { {2,7,9}, {3,6,1}, {7,4,2} };
        
        // Outer for loop: iterates over each row of the 2D array
        // i starts at 0 and increments by 1, loop continues while i < 3 (number of rows)
        for (int i = 0; i < 3; i++) {
            // Inner for loop: iterates over each column in the current row
            // j starts at 0 and increments by 1, loop continues while j < 3 (number of columns)
            for (int j = 0; j < 3; j++) {
                // Prints the element at row 'i' and column 'j', followed by an empty string (no space or newline)
                System.out.println(arr[i][j] + "");
            }
            // Prints a newline after each row is printed
            System.out.println();
        }
    }
}