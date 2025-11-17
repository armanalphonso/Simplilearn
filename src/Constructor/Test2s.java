package Constructor;  
// The package declaration specifies the folder/namespace for this class.
// Must match your project's directory structure.



class Test2s {

    // ---------------------- STATIC METHOD m1 ----------------------
    public static void m1() {
        /*
         * 'public'  → method can be accessed from anywhere.
         * 'static'  → belongs to the class, not to objects.
         * 'void'    → returns no value.
         * 'm1()'    → method name with no parameters.
         *
         * This method calls 'm2()'.
         */
        m2();  
        // Calls static method m2().
    }



    // ---------------------- STATIC METHOD m2 ----------------------
    public static void m2() {
        /*
         * Same as m1(): public static void method with no return.
         *
         * This method calls 'm1()'.
         */
        m1();  
        // Calls static method m1().
    }



    // ---------------------- MAIN METHOD ----------------------
    public static void main(String[] args) {
        /*
         * The entry point of execution for a Java program.
         * 'public'  → JVM must be able to access this method.
         * 'static'  → JVM can run it without creating an object.
         * 'void'    → main returns nothing.
         * 'String[] args' → command-line arguments.
         */
    	m1();  
        /*
         * Program flow:
         * main() → m1() → m2() → m1() → m2() → m1() → ...
         *
         * This never stops.
         * Eventually causes:
         *    java.lang.StackOverflowError
         *
         * So the next line (System.out.println("Hello")) NEVER executes.
         */
        System.out.println("Hello");
        // Prints "Hello" to the console.
    }
}