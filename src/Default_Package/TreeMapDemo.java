package Default_Package;

// Importing TreeMap class from java.util package for using the TreeMap data structure
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        // Creating a TreeMap instance that stores Integer keys and String values.
        // TreeMap keeps keys sorted in ascending order.
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding key-value pairs to the TreeMap using the put() method.
        // The keys here are 3, 2, and 1 and values are "A", "B", and "C".
        treeMap.put(3, "A");
        treeMap.put(2, "B");
        treeMap.put(1, "C");

        // Printing the contents of the TreeMap.
        // Output will be sorted by key: {1=C, 2=B, 3=A}
        System.out.println(treeMap);
    }
}