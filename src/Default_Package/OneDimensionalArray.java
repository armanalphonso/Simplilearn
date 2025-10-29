package Default_Package;

public class OneDimensionalArray {
    public static void main(String[]args) {
        // Declaration and creation of an integer array of size 4
        int[] arr = new int[4];

        // Initializing each element of the array using its index
        arr[0] = 10; // Assigns 10 to the first element (index 0)
        arr[1] = 20; // Assigns 20 to the second element (index 1)
        arr[2] = 30; // Assigns 30 to the third element (index 2)
        arr[3] = 40; // Assigns 40 to the fourth element (index 3)

        // Accessing array elements using their indexes and printing them
        System.out.println("Element at index 0: "+ arr[0]);
        System.out.println("Element at index 1: "+ arr[1]);
        System.out.println("Element at index 2: "+ arr[2]);
        System.out.println("Element at index 3: "+ arr[3]);
    }
}