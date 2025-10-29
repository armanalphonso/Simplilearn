// The package declaration — specifies that this class belongs
// to the package named 'InnerClass'.
// Packages help organize classes and avoid name conflicts.
package InnerClass;

// Definition of the outer class named 'Outer3'
class Outer3 {

    // Definition of a non-static inner class named 'Inner'
    // Because it is declared inside 'Outer3' *without* the 'static' keyword,
    // it is known as a *member inner class*.
    class Inner {

        // A normal instance method inside the inner class.
        // When this method is called, it prints a message.
        public void m1() {
            System.out.println("Inner class method");
        }
    }
}

// A separate class named 'Test'
// This class is *outside* of 'Outer3', but it is in the same package.
// Hence, it can access 'Outer3' and its inner class using the proper syntax.
class Test {

    // The main method — the entry point of the Java program.
    public static void main(String[] args) {

        // Step 1: Create an instance (object) of the outer class.
        // Required becrgihfjruidfkdfiidfivfyjvause the inner class is non-static.
        // A non-static inner class *cannot exist* without an outer class object.
        Outer3 o = new Outer3();

        // Step 2: Create an instance of the inner class.
        // Syntax for creating a non-static inner class object *from outside* the outer class:
        // OuterClass.Inner innerObj = outerObj.new Inner();
        //
        // Explanation:
        // - 'Outer3.Inner' → fully qualified type name of the inner class.
        // - 'o.new Inner()' → creates a new Inner object that is tied to the outer object 'o'.
        Outer3.Inner i = o.new Inner();

        // Step 3: Call the method of the inner class through its reference.
        i.m1(); // Output: "Inner class method"
    }
}