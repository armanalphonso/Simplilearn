package Default_Package;  // Declares the package name (optional, used for organizing classes)

public class NestedTryCatch {  // Class definition
    public static void main(String[] args) {  // Main method: entry point of the program

        // Outermost try block
        try {
            // Middle try block nested inside the outer try
            try {
                // Innermost try block nested inside the middle try
                try {
                    int arr[] = {1, 2, 3, 4};  // Declare and initialize an array of 4 integers
                    System.out.println(arr[10]);  // ❌ This will throw ArrayIndexOutOfBoundsException
                } 
                // Catch block for the innermost try
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("ArrayIndexOutOfBoundsException in block 3");
                    throw e;  // Rethrows the exception to the outer try block
                }
            } 
            // Catch block for the middle try
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException in block 2");
                throw e;  // Rethrows again to the outermost try block
            }
        } 
        // Catch block for the outermost try
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException in block 1");
        } 
        // Optional general catch block for other types of exceptions
        catch (Exception e5) {
            System.out.println("General Exception");
        }
    }
}