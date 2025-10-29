// The package declaration — this tells Java that this class
// belongs to the 'InnerClass' package.
// Packages help group related classes and prevent naming conflicts.
package InnerClass;

// Definition of the outer class named 'Outer2'
class Outer2 {

    // Definition of a non-static inner class named 'Inner'
    // This is also called a "member inner class" because it's defined
    // at the member level (inside the outer class, but outside any method).
    class Inner {

        // A regular instance method of the inner class.
        // When called, it prints a message to the console.
        public void m1() {
            System.out.println("Inner class method");
        }
    }

    // A regular instance method of the outer class.
    // This method demonstrates how the outer class can create
    // and use its own inner class object.
    public void m2() {

        // Creating an object of the inner class directly inside
        // an instance method of the outer class.
        //
        // Syntax rule:
        // Since we are already inside an instance context of Outer2
        // (inside a non-static method), we do NOT need to prefix with 'Outer2.this'.
        // We can simply use 'new Inner()'.
        Inner i = new Inner();

        // Calling the inner class method through its object.
        i.m1();  // Output: "Inner class method"
    }

    // The main method — the entry point of the program.
    // This is where execution begins when you run 'Outer2'.
    public static void main(String[] args) {

        // Step 1: Create an instance of the outer class.
        Outer2 o = new Outer2();

        // Step 2: Call the outer class's m2() method,
        // which internally creates an inner class object
        // and calls its m1() method.
        o.m2();  // Output: "Inner class method"
    }
}