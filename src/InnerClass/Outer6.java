// Package declaration: this class belongs to the package named 'InnerClass'
package InnerClass;

// Outer6 is the outer class that contains a static nested class
class Outer6 {

    /*
     * Static nested class declaration.
     * - A "static nested class" is a static member of the outer class.
     * - It can be accessed without creating an instance of the outer class.
     * - Syntax: static class ClassName { ... }
     */
    static class Nested {

        /*
         * Instance method inside the static nested class.
         * - 'public' means it can be accessed from outside the class (if the class is visible).
         * - 'void' means it doesn’t return any value.
         */
        public void m1() {
            System.out.println("static nested class method");
        }
    }

    /*
     * main() method: the entry point of any Java program.
     * - 'public' means accessible to the JVM.
     * - 'static' allows it to run without creating an instance of Outer6.
     * - 'void' means it doesn’t return anything.
     * - 'String[] args' is used to accept command-line arguments.
     */
    public static void main(String[] args) {

        /*
         * Creating an object of the static nested class.
         * - Because Nested is static, we can create its object directly using:
         *   Outer6.Nested n = new Outer6.Nested();
         * - However, since we are inside the same outer class (Outer6),
         *   we can simply write: new Nested();
         */
        Nested n = new Nested();

        // Call the m1() method of the static nested class
        n.m1();
    }
}