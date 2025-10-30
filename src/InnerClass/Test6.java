package InnerClass;
// Declares that this class belongs to the package named 'InnerClass'.
// Packages help organize related classes and avoid name conflicts.
// In your case, there was previously a class named 'Thread' in this package,
// which conflicted with java.lang.Thread — that’s why we now use the fully qualified name.
 

class Test6 {
    public static void main(String[] args) {
        // ------------------------------------------------------------
        // Create a new Thread using an *anonymous inner class*
        // ------------------------------------------------------------
        // Syntax: new SuperClassOrInterface() { ... }
        //
        // Here:
        //  - 'java.lang.Thread' is the superclass (the actual Thread class from Java)
        //  - We are creating a *new object* that extends Thread
        //  - Inside the braces { }, we override its 'run()' method
        //  - This form is called an *anonymous inner class* because
        //    it has no name — it's defined and instantiated in one statement.
        java.lang.Thread t = new java.lang.Thread() {

            // The 'run()' method defines the code that the new thread will execute.
            // When you call t.start(), the JVM automatically calls this run() method
            // on a separate thread of execution.
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Child Thread");
                }
            }
        };

        // ------------------------------------------------------------
        // Start the new thread
        // ------------------------------------------------------------
        t.start();
        // Calling 'start()' creates a new thread of execution.
        // The JVM allocates a new call stack for the new thread,
        // and automatically calls its 'run()' method.
        //
        // ⚠️ Important:
        // If you called 't.run()' instead of 't.start()', 
        // it would just run like a normal method — not as a separate thread.

        // ------------------------------------------------------------
        // Code running in the main thread
        // ------------------------------------------------------------
        for (int i = 0; i < 10; i++) {
            System.out.println("main method");
        }
        // This loop executes in the *main thread*.
        // Meanwhile, the 'Child Thread' loop runs concurrently in a separate thread.
    }
} 