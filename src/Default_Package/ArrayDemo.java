// Declares the package name. Optional, but helps organize code in larger projects.
package Default_Package;

// This is the class declaration. Every Java application must have at least one class.
public class ArrayDemo {

    // The main method is the entry point for any standalone Java application.
    public static void main(String[] args) {

        // Declare an integer array named 'anArray'.
        int[] anArray;

        // Allocate memory for 10 integers in the array.
        anArray = new int[10];

        // Assign values to each element of the array (index starts from 0).
        anArray[0] = 100;   // First element
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;  // Last element (index 9 because array is of size 10)

        // Print the values stored at each index
        System.out.println("Element at index0: " + anArray[0]);
        System.out.println("Element at index1: " + anArray[1]);
        System.out.println("Element at index2: " + anArray[2]);
        System.out.println("Element at index3: " + anArray[3]);
        System.out.println("Element at index4: " + anArray[4]);
        System.out.println("Element at index5: " + anArray[5]);
        System.out.println("Element at index6: " + anArray[6]);
        System.out.println("Element at index7: " + anArray[7]);
        System.out.println("Element at index8: " + anArray[8]);
        System.out.println("Element at index9: " + anArray[9]);
    }
}