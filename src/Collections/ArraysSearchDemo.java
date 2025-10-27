// Package declaration: this class belongs to the 'Collections' package.
// Packages help organize related classes and avoid name conflicts.
package Collections;

// Importing all classes from java.util (e.g., Arrays, Comparator, etc.)
import java.util.*;

// Static import for all static methods of java.util.Arrays.
// This allows direct calling of methods like binarySearch() without writing Arrays.binarySearch().
import static java.util.Arrays.*;

// Main class definition
class ArraysSearchDemo {

    // Main method — program execution starts here.
    public static void main(String[] args) {

        // ============================================================
        // 🔹 1. Working with Primitive Array (int[])
        // ============================================================

        int[] a = {10, 5, 20, 11, 6}; // Declare and initialize a primitive array.

        // Arrays.sort() sorts the array in ascending numeric order.
        Arrays.sort(a);

        // Perform binary search on the sorted array for element 6.
        // Arrays.binarySearch() returns the index (0-based) of the element if found.
        System.out.println(Arrays.binarySearch(a, 6)); // Output: 1 (position of 6)

        // If the element is NOT found, binarySearch() returns (-(insertion point) - 1).
        // The insertion point is the index where the element would be inserted to maintain order.
        System.out.println(Arrays.binarySearch(a, 14)); // Not found, returns negative value.

        // ============================================================
        // 🔹 2. Working with Object Array (String[])
        // ============================================================

        String[] s = {"A", "Z", "B"}; // Declare and initialize a String array.

        // Sorts string array using natural ordering (A → Z).
        Arrays.sort(s);

        // binarySearch() for objects also requires the array to be sorted first.
        // Since we used static import, we can directly call binarySearch() without 'Arrays.' prefix.
        System.out.println(binarySearch(s, "Z")); // Found, returns its index.
        System.out.println(binarySearch(s, "S")); // Not found, returns negative index.

        // ============================================================
        // 🔹 3. Using Custom Comparator (Descending Order)
        // ============================================================

        // Sort the array in descending order using custom Comparator.
        Arrays.sort(s, new MyComparator());

        // binarySearch() for custom comparator arrays requires
        // the same comparator to be passed to maintain correct search behavior.
        System.out.println(binarySearch(s, "Z", new MyComparator10())); // Found
        System.out.println(binarySearch(s, "S", new MyComparator10())); // Not found

        // ⚠️ If you call binarySearch() without passing the comparator
        // on an array that was sorted using a comparator, the result is unpredictable.
        System.out.println(binarySearch(s, "N")); // Wrong result due to mismatch
    }
}

// ============================================================
// 🔹 Custom Comparator Class
// ============================================================

// Comparator is a functional interface with a single abstract method compare(Object, Object).
// This implementation defines descending order for Strings.
class MyComparator10 implements Comparator {

    // The compare() method defines custom sorting logic.
    public int compare(Object o1, Object o2) {
        // Convert both objects to String for comparison.
        String s1 = o1.toString();
        String s2 = o2.toString();

        // s1.compareTo(s2) → ascending (A → Z)
        // s2.compareTo(s1) → descending (Z → A)
        return s2.compareTo(s1);
    }
}