package InnerClass;  
// The package declaration. This means the class belongs to the package "InnerClass".
// Packages help organize related classes in Java.

class Outer4 {  
    // Outer class named Outer4

    int x = 10;             // Instance variable (non-static) of the outer class
    static int y = 20;      // Static variable (shared across all instances) of the outer class

    // ===== Inner Class Definition =====
    class Inner {
        // Non-static inner class (also called member inner class)
        // Inner classes can access both static and non-static members of the outer class.

        public void m1() {
            // Method inside the inner class
            System.out.println(x);  // Accessing outer class's instance variable 'x'
            System.out.println(y);  // Accessing outer class's static variable 'y'
        }
    }

    // ===== Main Method =====
    public static void main(String[] args) {
        // The entry point of the program (must be static)

        // To create an object of the non-static inner class, we first need an object of the outer class.
        // Syntax: new OuterClass().new InnerClass();
        new Outer4().new Inner().m1();

        // Breakdown of the above syntax:
        // 1. new Outer4() → creates an instance of the outer class.
        // 2. .new Inner() → creates an instance of the inner class tied to that specific Outer4 instance.
        // 3. .m1() → calls the inner class method m1().
    }
}