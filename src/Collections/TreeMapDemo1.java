// Package declaration — this class belongs to the 'Collections' package
package Collections;

// Importing all classes from java.util package
// TreeMap and Comparator are part of java.util
import java.util.*;

// Class definition
class TreeMapDemo1 {
    public static void main(String[] args) {

        // ✅ Create a TreeMap object with a custom comparator
        // Syntax: TreeMap<KeyType, ValueType> mapName = new TreeMap<>(Comparator);
        //
        // Here, 'new MyComparator()' is passed to the TreeMap constructor.
        // This means the TreeMap will use 'MyComparator' to decide the ordering of keys.
        TreeMap t = new TreeMap(new MyComparator4());

        // ✅ Adding key–value pairs into the TreeMap
        // Syntax: map.put(key, value);
        // All keys here are Strings, and values are Integers.
        t.put("XXX", 10);
        t.put("AAA", 20);
        t.put("ZZZ", 30);
        t.put("LLL", 40);

        // ✅ Printing the TreeMap
        // TreeMap will use the custom comparator (MyComparator)
        // to sort the keys before displaying.
        System.out.println(t);
    }
}

// ✅ Custom comparator class that defines how to compare keys
// The Comparator interface is part of java.util and must implement the compare() method.
class MyComparator4 implements Comparator {

    // compare() method — defines custom ordering logic
    // Parameters: obj1 and obj2 — the two objects (keys) to compare
    public int compare(Object obj1, Object obj2) {

        // Convert both objects to String (since keys are Strings)
        String s1 = obj1.toString();
        String s2 = obj2.toString();

        // Compare strings in **reverse alphabetical order**
        // Normally, s1.compareTo(s2) gives ascending order.
        // Here, we use s2.compareTo(s1) to reverse it (descending order).
        return s2.compareTo(s1);
    }
}