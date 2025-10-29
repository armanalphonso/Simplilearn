// The package declaration specifies that this class belongs
// to the package named 'InnerClass'. 
// Packages are used for organizing classes logically.
package InnerClass;

// Definition of the outer class named 'Outer1'
class Outer1  {

    // Definition of a non-static inner class named 'Inner'
    // This is called a *member inner class* because it is defined
    // at the member level of the outer class (just like a field or method).
    class Inner {

        // Regular instance method inside the inner class.
        // This method will print a message when called.
        public void m1() {
            System.out.println("Inner class method");
        }
    }

    // The main method — this is the entry point of the program.
    // The JVM will start execution from here.
    public static void main(String[] args) {

        // Step 1: Create an object of the outer class.
        // We must do this first because the inner class is non-static,
        // meaning it is tied (associated) with an instance of the outer class.
        Outer1 o = new Outer1();

        // Step 2: Create an object of the inner class.
        // Syntax rule for creating a non-static inner class object:
        // OuterClass.Inner innerObj = outerObj.new Inner();
        //
        // Explanation:
        // - 'Outer1.Inner' specifies the type (the fully qualified name of the inner class).
        // - 'o.new Inner()' means: create a new Inner object that belongs to the 'o' instance of Outer1.
        Outer1.Inner i = o.new Inner();

        // Step 3: Call the method of the inner class using the reference variable 'i'.
        i.m1(); // This will print "Inner class method" to the console.
    }
}