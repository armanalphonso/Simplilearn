// The package statement defines the package name.
// It helps organize classes into namespaces and avoid name conflicts.
package InnerClass;

// Definition of an outer class named 'Outer'
class Outer {

    // Definition of a non-static inner class (also called a "member inner class")
    // This class exists inside 'Outer' and is associated with an instance of Outer.
    class Inner {
        // This is the body of the inner class.
        // It can access all members (including private ones) of the Outer class.
        // Currently, it's empty — no fields, methods, or constructors.
    }

    // The main method — the entry point when you run this class directly.
    public static void main(String[] args) {
        // Printing a message to the console.
        System.out.println("Outer class main method");

        /*
         * Note: You cannot directly create an object of Inner here using 'new Inner()'
         * because 'Inner' is a non-static inner class.
         * You must first create an instance of the Outer class.
         *
         * Example of creating an Inner object:
         * Outer outerObj = new Outer();         // Create outer class instance
         * Outer.Inner innerObj = outerObj.new Inner(); // Create inner class instance
         *
         * The syntax 'outerObj.new Inner()' is used because
         * an inner class object is always tied to a specific outer class instance.
         */
    }
}