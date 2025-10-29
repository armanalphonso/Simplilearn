// Package declaration: Places this class inside the 'Collections' package.
// Packages help organize related Java classes and avoid name conflicts.
package Collections;

// Import statements:
// Arrays → for array utility methods (like sorting, searching, etc.)
// Comparator → to define custom comparison logic for object sorting.
import java.util.Arrays;
import java.util.Comparator;

// Class declaration — main class that contains the program's entry point.
class ArraySortDemo {

    // Main method — program execution begins here.
    public static void main(String[] args) {

        // =====================================================
        // 🔹 1. SORTING A PRIMITIVE ARRAY (int[])
        // =====================================================

        // Declare and initialize an array of primitive integers.
        int[] a = {10, 5, 20, 11, 6};

        // Print the elements before sorting.
        System.out.println("Primitive Array before sorting:");
        for (int a1 : a) { // Enhanced for-loop to iterate through each array element
            System.out.println(a1);
        }

        // Arrays.sort() is a static method from java.util.Arrays.
        // It sorts primitive arrays in ascending order using the Dual-Pivot QuickSort algorithm.
        Arrays.sort(a);

        // Print the array after sorting.
        System.out.println("Primitive Array After sorting:");
        for (int a1 : a) {
            System.out.println(a1);
        }

        // =====================================================
        // 🔹 2. SORTING AN OBJECT ARRAY (String[])
        // =====================================================

        // Declare and initialize an array of String objects.
        String[] s = {"A", "Z", "B"};

        // Print array before sorting.
        System.out.println("Object Array Before sorting:");
        for (String a2 : s) {
            System.out.println(a2);
        }

        // Arrays.sort() for object arrays sorts elements according to their
        // "natural ordering" — the order defined by the Comparable interface.
        // For Strings, this means alphabetical (lexicographical) order.
        Arrays.sort(s);

        // Print array after sorting in natural order.
        System.out.println("Object Array After sorting:");
        for (String a1 : s) {
            System.out.println(a1);
        }

        // =====================================================
        // 🔹 3. SORTING USING A CUSTOM COMPARATOR
        // =====================================================

        // Arrays.sort(Object[], Comparator)
        // Allows us to define custom sorting logic through a Comparator implementation.
        // Here, MyComparator9 defines a reverse alphabetical (descending) order.
        Arrays.sort(s, new MyComparator9());

        // Print array after sorting using custom comparator logic.
        System.out.println("Object Array After sorting by Comparator:");
        for (String a1 : s) {
            System.out.println(a1);
        }
    }
}
// =====================================================
// 🔹 CUSTOM COMPARATOR IMPLEMENTATION
// =====================================================

// The MyComparator9 class implements the Comparator interface.
// This interface defines one abstract method: compare(Object o1, Object o2),
// which determines how two objects are compared during sorting.
class MyComparator9 implements Comparator {

    // The compare() method returns:
    //   - a negative integer if o1 < o2
    //   - zero if o1 == o2
    //   - a positive integer if o1 > o2
    //
    // It defines the "ordering" between two elements.
    public int compare(Object o1, Object o2) {

        // Convert both objects to String before comparison.
        String s1 = o1.toString();
        String s2 = o2.toString();

        // The compareTo() method of String performs lexicographical comparison.
        // s1.compareTo(s2) → ascending order (A → Z)
        // s2.compareTo(s1) → descending order (Z → A)
        return s2.compareTo(s1);
    }
}