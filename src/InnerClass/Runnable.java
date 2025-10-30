package InnerClass;
// 'package' is used to group related classes together.
// Here, the class belongs to the package named 'InnerClass'.
// Packages help organize code and avoid class name conflicts.


// ------------------------------------------------------------
// Class that implements the Runnable interface
// ------------------------------------------------------------
class MyRunnable implements Runnable {
    // The Runnable interface has only one abstract method: run()
    // → public void run()
    // Any class that implements Runnable must provide its own definition of run().
    
    public void run() {
        // This code defines the task that will be executed by a thread.
        // Whatever is written inside 'run()' will execute when the thread starts.
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
}


// ------------------------------------------------------------
// Class containing the main method (program entry point)
// ------------------------------------------------------------
class ThreadDemo {
    public static void main(String[] args) {
        // Step 1️⃣: Create a Runnable object
        MyRunnable r = new MyRunnable();
        // 'r' is an object that implements Runnable.
        // It defines what the thread should do when it runs (in the run() method).

        // Step 2️⃣: Create a Thread object and attach the Runnable
        java.lang.Thread t = new java.lang.Thread(r);
        // Syntax: Thread thread = new Thread(Runnable target);
        // Here, 'target' (our MyRunnable object) tells the Thread
        // which code (run method) to execute when the thread starts.
        //
        // Using the fully qualified name 'java.lang.Thread'
        // ensures we refer to Java's built-in Thread class,
        // not a custom class named 'Thread' in the same package.

        // Step 3️⃣: Start the thread
        t.start();
        // The 'start()' method internally calls the 'run()' method of the
        // Runnable target ('r') on a *new thread of execution*.
        //
        // ⚠️ Important difference:
        //   - t.start() → creates a new thread and runs code concurrently.
        //   - t.run()   → just runs the code like a normal method call (no new thread).

        // Step 4️⃣: Main thread continues its own execution
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
        // This loop executes on the *main thread*.
        // Meanwhile, the new thread (child thread) runs its own loop in parallel.
    }
}