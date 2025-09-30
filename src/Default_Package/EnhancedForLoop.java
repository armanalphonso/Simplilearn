package Default_Package;

public class EnhancedForLoop {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] number = {1,2,3,4,5,6,7,8,9,10};

        // Enhanced for loop (for-each loop) in Java
        // Syntax: for (elementType variable : arrayOrCollection) { ... }
        // - elementType: The data type of elements in the array (here, int)
        // - variable: A temporary variable that will hold each array element in each iteration (here, i)
        // - arrayOrCollection: The array or collection to be traversed (here, number)
        for (int i : number) {
            // In each iteration, 'i' takes the value of the next element in the array
            // Prints: count is: <value of i>
            System.out.println("count is: " + i);
        }
    }
}