package Default_Package;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // Declaration and initialization of a 2D array with 3 rows and 3 columns
        // Each element is assigned a value as specified inside the inner curly braces
        int arr[][] = {
            {2, 7, 9}, 
            {3, 6, 1}, 
            {7, 4, 2}
        };

        // Outer loop iterates over rows (i from 0 to 2)
        for (int i = 0; i < 3; i++) {
            // Inner loop iterates over columns of each row (j from 0 to 2)
            for (int j = 0; j < 3; j++) {
                // Prints the element at row i and column j
                System.out.print(arr[i][j] + " ");
            }
            // Prints a newline after each row for better output formatting
            System.out.println();
        }
    }
}