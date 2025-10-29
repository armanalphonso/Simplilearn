// Package declaration — this class belongs to the 'Collections' package.
package Collections;

// Importing all utility classes (TreeMap, NavigableMap, etc.)
import java.util.*;

// Class definition — main entry point of the program.
class NavigableMapDemo {
    public static void main(String[] args) {

        // Creating a TreeMap with String keys and String values.
        // TreeMap stores its entries in **ascending order of keys** by default.
        // It implements NavigableMap and SortedMap interfaces.
        TreeMap<String, String> t = new TreeMap<String, String>();

        // Adding key-value pairs into the TreeMap.
        // The entries will automatically be sorted by their keys ('a' to 'z').
        t.put("b", "banana");
        t.put("c", "cat");
        t.put("a", "apple");
        t.put("d", "dog");
        t.put("g", "gun");

        // Printing the entire TreeMap.
        // Output is automatically sorted by key.
        // Example: {a=apple, b=banana, c=cat, d=dog, g=gun}
        System.out.println(t);

        // ceilingKey(K key):
        // Returns the **least key ≥ given key** (equal to or next higher key).
        // Here: ceilingKey("c") → "c" (exact match exists)
        System.out.println(t.ceilingKey("c"));

        // higherKey(K key):
        // Returns the **least key strictly greater than** the given key.
        // Here: higherKey("e") → "g" (next higher key after 'e')
        System.out.println(t.higherKey("e"));

        // floorKey(K key):
        // Returns the **greatest key ≤ given key** (equal to or next lower key).
        // Here: floorKey("e") → "d" (closest lower key to 'e')
        System.out.println(t.floorKey("e"));

        // lowerKey(K key):
        // Returns the **greatest key strictly less than** the given key.
        // Here: lowerKey("e") → "d"
        System.out.println(t.lowerKey("e"));

        // pollFirstEntry():
        // Retrieves and removes the **first (lowest)** entry in the map.
        // Here: removes {a=apple}
        System.out.println(t.pollFirstEntry());

        // pollLastEntry():
        // Retrieves and removes the **last (highest)** entry in the map.
        // Here: removes {g=gun}
        System.out.println(t.pollLastEntry());

        // descendingMap():
        // Returns a **reverse-order view** of the map (sorted from highest to lowest key).
        // Note: It’s just a view, not a new map copy.
        System.out.println(t.descendingMap());

        // Printing the map again after removals.
        // After removing first and last entries, remaining: {b=banana, c=cat, d=dog}
        System.out.println(t);
    }
}