package Default_Package;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        // Declaration and initialization of a 3D integer array
        // The array contains 2 blocks, each with 2 rows and 3 columns
        int[][][] arr = {
            { {1, 2, 10}, {3, 4, 11} },
            { {5, 6, 12}, {7, 8, 13} }
        };

        // Accessing the element at block 0, row 1, column 2
        // Which is 11 in the initialized array
        System.out.println(arr[0][1][2]);
    }
}