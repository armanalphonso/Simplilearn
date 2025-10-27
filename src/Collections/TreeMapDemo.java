// Package declaration — this class belongs to the 'Collections' package
package Collections;

// Import all classes from java.util package
// TreeMap is part of java.util, so we import it here
import java.util.*;

// Class declaration
class TreeMapDemo {

    // main() method — entry point of the Java program
    public static void main(String[] args) {

        // ✅ Create a TreeMap instance
        // Syntax: TreeMap<KeyType, ValueType> variableName = new TreeMap<>();
        // TreeMap stores key–value pairs in **sorted order of keys** (natural ordering by default)
        // Here, keys are Integers, and values can be any Object type.
        TreeMap m = new TreeMap();

        // ✅ Adding entries (key-value pairs) into the TreeMap
        // Syntax: map.put(key, value);
        // Keys must be mutually comparable (i.e., all should be of the same type).
        m.put(100, "ZZZ");   // key=100, value="ZZZ"
        m.put(103, "YYY");   // key=103, value="YYY"
        m.put(101, "XXX");   // key=101, value="XXX"
        m.put(104, 106);     // key=104, value=106 (value can be any Object type)

        // ✅ Print the TreeMap
        // The toString() of TreeMap prints entries in ascending key order.
        System.out.println(m);
        // Output: {100=ZZZ, 101=XXX, 103=YYY, 104=106}
    }
}
