package InnerClass;
// The class belongs to the package named 'InnerClass'.
// Packages help organize code and avoid name conflicts.


// --------------------------- CLASS 1 ----------------------------
class MyThread extends Thread {
    // 'MyThread' is a subclass of 'Thread'.
    // This means it represents a separate thread of execution.

    public void run() {
        // The 'run()' method defines the code that will be executed
        // when the thread starts.
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
}


// --------------------------- CLASS 2 ----------------------------
class Thread {
    // ⚠️ WARNING: This class has the same name as 'java.lang.Thread'!
    // Because of this, the compiler will treat this as your own Thread class,
    // *not* the built-in Java Thread class.
    // This will cause unexpected behavior and confusion.
    // Ideally, you should name this class something else, e.g., 'ThreadDemo' or 'TestThread'.

    public static void main(String[] args) {
        MyThread t = new MyThread();
        // Here we are creating an object of MyThread.
        // MyThread extends java.lang.Thread, so it can be started as a thread.

        t.run();
        // ⚠️ Here’s the key issue:
        // 't.run()' calls the 'run()' method like a normal function call.
        // It does NOT start a new thread.
        // Both loops (child and main) run sequentially in the same thread (main thread).
        // To start a new thread, we should use 't.start();'

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}