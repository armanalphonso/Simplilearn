// Package declaration - this file belongs to the package named 'InnerClass'
package InnerClass;

/*
 * Class declaration for the outer class 'Test7'.
 * A class is the basic building block of an object-oriented Java program.
 */
class Test7 {

    /*
     * Static nested class declaration.
     * - Declared using the 'static' keyword inside another class.
     * - It behaves like a top-level class but is namespaced inside the outer class.
     * - Because it's static, it does not require an instance of the outer class to be used.
     */
    static class Nested {

        /*
         * main() method inside the static nested class.
         * - This shows that even a nested class can have its own main() method.
         * - The JVM can execute either the outer class’s main() or the nested class’s main(),
         *   depending on which one you specify when running the program.
         *
         * Syntax: 
         *   public static void main(String[] args)
         *   - 'public': accessible by the JVM from anywhere.
         *   - 'static': can run without creating an instance of the class.
         *   - 'void': no return value.
         *   - 'String[] args': array that stores command-line arguments.
         */
        public static void main(String[] args) {
            System.out.println("static nested class main method");
        }
    }

    /*
     * main() method of the outer class 'Test7'.
     * - This is the main entry point when you run 'java InnerClass.Test7'.
     * - Each class can have its own main() method, but only the one you specify gets executed.
     */
    public static void main(String[] args) {
        System.out.println("outer class main method");
    }
}