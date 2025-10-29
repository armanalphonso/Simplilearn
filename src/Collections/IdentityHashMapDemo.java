// Package declaration: Groups related classes under the 'Collections' package
package Collections;

// Importing all classes from java.util package
// This gives access to IdentityHashMap and other utility classes
import java.util.*;

// Class declaration: The class name is IdentityHashMapDemo
class IdentityHashMapDemo {

    // main() method: The entry point of the Java program
    public static void main(String[] args) {

        // Creating an IdentityHashMap instance
        // Syntax: IdentityHashMap<KeyType, ValueType> variableName = new IdentityHashMap<>();
        // Note: It uses reference equality (==) instead of .equals() for comparing keys
        IdentityHashMap m = new IdentityHashMap();

        // Creating two distinct Integer objects with the same value (10)
        // Normally, Integer caching makes small integers (-128 to 127) share instances,
        // but using 'new Integer()' forces creation of new, separate objects.
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

        // Putting key-value pairs into the map
        // Syntax: map.put(key, value)
        // Here both keys (i1 and i2) have the same value 10, but are different objects.
        m.put(i1, "pawan");

        // Adding another value for the *same* key reference (i1)
        // Since it's the same object reference, it will replace the previous value.
        m.put(i1, "Kalyan");

        // Printing the map
        // Syntax: System.out.println(object)
        // Output shows the map entries in {key=value} format
        System.out.println(m);
    }
}