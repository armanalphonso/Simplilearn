package Collections;

import java.util.*;

// Employee class implementing Comparable to define natural sorting order
class Employee implements Comparable {
    String name;
    int eid;

    // Constructor to initialize employee name and ID
    Employee(String name, int eid) {
        this.name = name;
        this.eid = eid;
    }

    // Overriding toString() for readable output when printing Employee objects
    public String toString() {
        return name + "--" + eid;
    }

    // Implementing compareTo() method for natural sorting based on eid (employee ID)
    public int compareTo(Object obj) {
        int eid1 = this.eid;                 // Current object's eid
        Employee e = (Employee) obj;         // Casting incoming object to Employee
        int eid2 = e.eid;                    // Other object's eid

        // Ascending order based on eid
        if (eid1 < eid2) {
            return -1;                      // Current comes before
        } else if (eid1 > eid2) {
            return 1;                       // Current comes after
        } else {
            return 0;                       // Same eid, considered duplicate in TreeSet
        }
    }
}

// Main class to demonstrate TreeSet with Comparable and Comparator
class CompComp {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee e1 = new Employee("nag", 100);
        Employee e2 = new Employee("balaiah", 200);
        Employee e3 = new Employee("Chiru", 50);
        Employee e4 = new Employee("venki", 150);
        Employee e5 = new Employee("nag", 100);  // Duplicate eid

        // TreeSet using natural ordering (by eid via Comparable)
        TreeSet t = new TreeSet();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);  // Duplicate based on eid — will be ignored

        // Output sorted by eid (ascending)
        System.out.println("Natural Sorting (by eid):");
        System.out.println(t);

        // TreeSet using custom Comparator (MyComparator)
        TreeSet t1 = new TreeSet(new MyComparator2());
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);  // Duplicate based on name — will be ignored

        // Output sorted by name (ascending, case-insensitive)
        System.out.println("Custom Sorting (by name):");
        System.out.println(t1);
    }
}

// Custom Comparator to sort Employee objects by name (case-insensitive)
class MyComparator2 implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Employee e1 = (Employee) obj1;
        Employee e2 = (Employee) obj2;

        // Comparing names lexicographically (ignoring case)
        return e1.name.compareToIgnoreCase(e2.name);
    }
}