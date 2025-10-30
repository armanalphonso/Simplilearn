package InnerClass;
// 'package' groups related classes together.
// This class is part of the 'InnerClass' package.
// Packages help organize code and avoid class name conflicts.


// ------------------------------------------------------------
// MAIN CLASS — contains the entry point (main method)
// ------------------------------------------------------------
class ThreadDemo1 {
    public static void main(String[] args) {

        // ------------------------------------------------------------
        // 1️⃣ Create a Runnable using an Anonymous Inner Class
        // ------------------------------------------------------------
        // Syntax: 
        // Runnable r = new Runnable() {
        //     public void run() {
        //         // task code here
        //     }
        // };
        //
        // This creates an *anonymous class* that implements the Runnable interface.
        // Runnable is a functional interface → it has a single abstract method: run().
        // We must provide an implementation for run(), which defines the code 
        // that the new thread will execute.
        Runnable r = new Runnable() {
            public void run() {
                // The code inside 'run()' will execute in the child thread.
                for (int i = 0; i < 10; i++) {
                    System.out.println("Child Thread");
                }
            }
        };

        // ------------------------------------------------------------
        // 2️⃣ Create a Thread object and pass the Runnable to it
        // ------------------------------------------------------------
        // Syntax:
        // Thread t = new Thread(Runnable target);
        //
        // 'target' is the Runnable whose 'run()' method the thread should execute.
        // Using the fully qualified name (java.lang.Thread) ensures
        // that Java uses the built-in Thread class, not any custom class
        // named 'Thread' that might exist in the same package.
        java.lang.Thread t = new java.lang.Thread(r);

        // ------------------------------------------------------------
        // 3️⃣ Start the new thread
        // ------------------------------------------------------------
        t.start();
        // The 'start()' method creates a *new thread of execution*.
        // JVM internally calls the 'run()' method of the passed Runnable (r)
        // on a separate thread.
        //
        // ⚠️ Important difference:
        //   - t.start() → starts a new thread (runs run() in parallel)
        //   - t.run()   → calls run() like a normal method (no new thread)

        // ------------------------------------------------------------
        // 4️⃣ Code that runs on the main thread
        // ------------------------------------------------------------
        for (int i = 0; i < 10; i++) {
            System.out.println("main Thread");
        }
        // This loop runs in the main thread concurrently with the child thread.
        // As a result, "Child Thread" and "main Thread" outputs will appear
        // interleaved in unpredictable order — depending on the CPU scheduler.
    }
}