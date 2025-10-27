package Collections;

import java.util.*;

// Main class
class TreeSetDemo3 {
    public static void main(String[] args) {
        // Creating a TreeSet with a custom comparator
        TreeSet t = new TreeSet(new MyComparator1());

        // Adding elements to the TreeSet
        // Mixing String and StringBuffer objects
        t.add("A");                            // Length = 1
        t.add(new StringBuffer("ABC"));        // Length = 3
        t.add(new StringBuffer("AA"));         // Length = 2
        t.add("XX");                           // Length = 2
        t.add("ABCD");                         // Length = 4
        t.add("A");                            // Duplicate — will be ignored by TreeSet

        // TreeSet will sort based on MyComparator logic and remove duplicates
        System.out.println(t);
    }
}

// Custom comparator for comparing elements by string length (descending),
// and then by lexicographic order if lengths are equal
class MyComparator1 implements Comparator {
    public int compare(Object obj1, Object obj2) {
        // Convert both objects to String (even if they are StringBuffer)
        String s1 = obj1.toString();
        String s2 = obj2.toString();

        // Get lengths of both strings
        int l1 = s1.length();
        int l2 = s2.length();

        // Sort by descending length
        if (l1 > l2) {
            return -1; // s1 should come before s2
        } else if (l1 < l2) {
            return 1;  // s2 should come before s1
        } else {
            // If lengths are equal, sort by lexicographic order
            return s1.compareTo(s2);
        }
    }
}