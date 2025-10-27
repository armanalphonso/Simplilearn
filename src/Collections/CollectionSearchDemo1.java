// Package declaration: Defines that this class belongs to the 'Collections' package.
package Collections;

// Import statement: Brings in the classes from java.util package,
// including ArrayList, Collections, and Comparator.
import java.util.*;

// Main class containing the main() method.
class CollectionSearchDemo1 {

    // The main method: Program execution starts here.
    public static void main(String[] args) {

        // Create a raw (non-generic) ArrayList.
        // (Using generics is preferred, but this still works.)
        ArrayList I = new ArrayList();

        // Adding integer elements to the list.
        I.add(15);
        I.add(0);
        I.add(20);
        I.add(10);
        I.add(5);

        // Print the list before sorting.
        System.out.println("Before Sorting: " + I);

        // ❌ Syntax error fixed: It should be Collections.sort(), not Collection.sort()
        // Sorts the list using the custom comparator MyComparator.
        // MyComparator defines descending order sorting (highest to lowest).
        Collections.sort(I, new MyComparatore());

        // Print the list after sorting (should appear in descending order).
        System.out.println("After Sorting: " + I);

        // ❌ Syntax error fixed: It should be Collections.binarySearch(), not Collection.binarySearch()
        // Perform binary search for value 10 using the same comparator.
        // The list must be sorted using the same comparator for binarySearch to work correctly.
        System.out.println("Search result for 10: " + Collections.binarySearch(I, 10, new MyComparatore()));

        // Binary search for value 13 using the same comparator.
        // Since 13 is not present, binarySearch() returns (-(insertion point) - 1)
        System.out.println("Search result for 13: " + Collections.binarySearch(I, 13, new MyComparatore()));

        // Binary search for value 17 *without* specifying comparator.
        // ⚠️ IMPORTANT: The list is sorted in descending order, but this call assumes ascending order.
        // Therefore, the result is unpredictable (may be incorrect).
        System.out.println("Search result for 17 (no comparator): " + Collections.binarySearch(I, 17));
    }
}

// Custom comparator class that defines how two Integer objects are compared.
class MyComparatore implements Comparator {

    // The compare() method defines the sorting logic.
    // It returns:
    //   - Negative value if obj1 < obj2
    //   - Zero if obj1 == obj2
    //   - Positive value if obj1 > obj2
    public int compare(Object obj1, Object obj2) {

        // Typecasting because ArrayList stores Objects.
        Integer i1 = (Integer) obj1;
        Integer i2 = (Integer) obj2;

        // Compare in descending order:
        // Normally, i1.compareTo(i2) gives ascending order (small → large).
        // Reversing operands (i2.compareTo(i1)) gives descending order (large → small).
        return i2.compareTo(i1);
    }
}