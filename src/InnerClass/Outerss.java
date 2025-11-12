// Package declaration — this code is part of the package named 'InnerClass'
package InnerClass;

/*
 * Interface declaration — 'Outerss'
 * ---------------------------------
 * - An interface in Java defines a contract that classes can implement.
 * - All methods in an interface are implicitly:
 *      → public
 *      → abstract
 * - This means classes that implement this interface must provide the method body.
 */
interface Outerss {

    // Abstract method declaration inside the outer interface
    public void m1();

    /*
     * Nested Interface Declaration
     * -----------------------------
     * - An interface can contain another interface inside it.
     * - Such nested interfaces are automatically:
     *      → public
     *      → static
     * - That means you can access it using: Outerss.Inner
     * - It does not depend on an instance of the outer interface.
     */
    interface Inner {
        public void m2(); // Abstract method (must be implemented by a class)
    }
}

/*
 * Class Test9s implements the outer interface 'Outerss'
 * -----------------------------------------------------
 * - The 'implements' keyword means that this class must define (override)
 *   all abstract methods declared in the interface 'Outerss'.
 */
class Test9s implements Outerss {

    // Implementation of the m1() method declared in Outerss
    public void m1() {
        System.out.println("Outerss interface method implementation");
    }
}

/*
 * Class Test9 implements the nested interface 'Outerss.Inner'
 * -----------------------------------------------------------
 * - The nested interface 'Inner' is accessed using the qualified name Outerss.Inner.
 * - This class must provide a concrete definition of method m2().
 */
class Test9 implements Outerss.Inner {

    // Implementation of the m2() method declared in Outerss.Inner
    public void m2() {
        System.out.println("Inner interface method implementation");
    }
}

/*
 * Driver class containing the main() method — Testss9
 * ---------------------------------------------------
 * - The main() method is the entry point of the Java program.
 * - It creates objects of Test9s and Test9, and calls their implemented methods.
 */
class Testss9 {

    public static void main(String[] args) {
        /*
         * Create an object of Test9s (which implements Outerss)
         * and call the m1() method.
         */
        Test9s t1 = new Test9s();
        t1.m1();  // Executes the outer interface method implementation

        /*
         * Create an object of Test9 (which implements Outerss.Inner)
         * and call the m2() method.
         */
        Test9 t2 = new Test9();
        t2.m2();  // Executes the inner interface method implementation
    }
}