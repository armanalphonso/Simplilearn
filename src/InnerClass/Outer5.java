package InnerClass;  
// The package declaration. 
// This means that the class belongs to the "InnerClass" package.
// Packages are used to organize related classes in Java.

class Outer5 {  
    // ===== Outer class definition =====
    int x = 10;  
    // Instance variable of the outer class.
    // This will be shadowed (hidden) by the inner class variable of the same name.

    class Inner {  
        // ===== Non-static inner class definition =====
        int x = 100;  
        // Instance variable of the inner class.
        // This hides the outer class variable 'x' within this scope.

        public void m1() {
            // ===== Instance method inside the inner class =====
            int x = 1000;  
            // Local variable inside the method 'm1'.
            // This local variable hides both the inner class and outer class variables 'x'.

            // ---- Printing different 'x' variables from different scopes ----

            System.out.println(x);  
            // Refers to the LOCAL variable inside 'm1' → prints 1000

            System.out.println(this.x);  
            // 'this' refers to the current INNER class object.
            // So 'this.x' refers to the 'x' of the Inner class → prints 100

            System.out.println(Outer5.this.x);  
            // 'Outer5.this' refers to the OUTER class instance that contains this Inner class instance.
            // So 'Outer5.this.x' accesses the outer class variable → prints 10
        }
    }

    public static void main(String[] args) {
        // ===== Main method (entry point of the program) =====

        // To create an object of a NON-STATIC inner class,
        // you first need an instance of the outer class.

        new Outer5().new Inner().m1();
        // Step 1: new Outer5() → creates an instance of the outer class.
        // Step 2: .new Inner() → creates an instance of the inner class linked to that outer class instance.
        // Step 3: .m1() → calls the method 'm1()' of the inner class.
    }
}