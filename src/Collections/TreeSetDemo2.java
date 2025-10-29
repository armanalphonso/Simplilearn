package Collections;

import java.util.*;

// Main class
class TreeSetDemo2 {
    public static void main(String[] args) {
        // Creating a TreeSet with a custom Comparator (MyComparator)
        // TreeSet sorts elements using this Comparator instead of natural ordering
        TreeSet t = new TreeSet(new MyComparators());

        // Adding string elements to the TreeSet
        t.add("Roja");
        t.add("ShobhaRani");
        t.add("Rajakumari");
        t.add("GangaBhavani");
        t.add("Ramulamma");

        // TreeSet will automatically sort them using MyComparator (i.e., in reverse order)
        System.out.println(t); // Output will be in descending alphabetical order
    }
}

// Custom comparator class implementing Comparator interface
class MyComparators implements Comparator {
    // Overriding compare() method to define custom sorting logic
    public int compare(Object obj1, Object obj2) {
        // Converting the objects to strings
        String s1 = obj1.toString();       // or (String)obj1
        String s2 = (String)obj2;

        // Using compareTo in reverse to get descending order
        // Normally: s1.compareTo(s2) gives ascending order
        // Here:    s2.compareTo(s1) gives descending order
        return s2.compareTo(s1);
    }
}