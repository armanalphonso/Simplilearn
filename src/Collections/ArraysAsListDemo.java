// Package declaration — this class is part of the 'Collections' package.
// Packages help organize Java classes and avoid name conflicts.
package Collections;

// Importing all classes from java.util package
// (for List, Arrays, etc.)
import java.util.*;

// Main class definition
class ArraysAsListDemo {

    // Entry point of the Java program
    public static void main(String[] args) {

        // ============================================================
        // 🔹 1. Create an Array
        // ============================================================

        // Declare and initialize a String array
        String[] s = {"A", "Z", "B"};

        // ============================================================
        // 🔹 2. Convert Array to List using Arrays.asList()
        // ============================================================

        // Arrays.asList(s) — converts the given array into a List view.
        // The returned list is *backed by the original array*.
        // That means: changes in the array reflect in the list and vice versa.
        List l = Arrays.asList(s);

        // Print the list
        // Output → [A, Z, B]
        System.out.println(l);

        // ============================================================
        // 🔹 3. Modify the Array and observe List changes
        // ============================================================

        // Change an element in the array directly
        s[0] = "K"; // Update first element "A" → "K"

        // Since the list is backed by the array, the change is reflected in the list
        // Output → [K, Z, B]
        System.out.println(l);

        // ============================================================
        // 🔹 4. Modify the List and observe Array changes
        // ============================================================

        // Change an element in the list (index 1) to "L"
        // This also updates the underlying array.
        l.set(1, "L"); // Update "Z" → "L"

        // Use enhanced for-loop to print all elements of the array.
        // You’ll see the change made through the List reflected here.
        for (String s1 : s) {
            System.out.println(s1);
        }
        // Output:
        // K
        // L
        // B

        // ============================================================
        // 🔹 5. Operations that are NOT ALLOWED
        // ============================================================

        // l.add("durga");
        // ❌ UnsupportedOperationException
        // Reason: The list returned by Arrays.asList() is *fixed-size*.
        // You cannot add or remove elements.

        // l.remove(2);
        // ❌ UnsupportedOperationException
        // You cannot change the size (add/remove) of the list.

        // l.set(1, new Integer(10));
        // ❌ ArrayStoreException
        // The list is backed by a String array.
        // Adding an Integer breaks type compatibility.
    }
}