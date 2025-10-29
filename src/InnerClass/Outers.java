// The package declaration — this tells the compiler that this class
// belongs to the package named 'InnerClass'.
// Packages help organize related classes and prevent name conflicts.
package InnerClass;

// Definition of an outer class named 'Outers'
class Outers {

    // Definition of a non-static inner class named 'Inner'
    // Because this class is defined *inside* another class,
    // it is also called a *member inner class*.
    class Inner {

        // The 'main' method is declared *inside the inner class*.
        // This is valid Java — any class (outer or inner) can have its own main method.
        // The JVM can execute any class that defines a 'public static void main(String[] args)' method.
        public static void main(String[] args) {
            // Prints a message when this inner class is executed.
            System.out.println("Inner class main method");
        }

        /*
         * Important note:
         * Even though 'Inner' is an inner (non-static) class,
         * it still can define a 'static' method ONLY if that method is 'main'.
         * 
         * Normally, a non-static inner class cannot contain static members or methods.
         * But the Java Language Specification makes an exception for the 'main' method,
         * so that the class can be used as an independent entry point for execution.
         *
         * So this is completely valid and will compile and run correctly.
         */
    }
}