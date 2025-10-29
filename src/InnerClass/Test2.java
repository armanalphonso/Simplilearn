package InnerClass;  
// The package declaration — this file belongs to the package "InnerClass".
// Packages help organize related classes and avoid naming conflicts.

class Test2 {
    // ===== Outer class definition =====
    
    public void m1() {
        // ===== Method definition inside the outer class =====
        // The local inner class will be declared inside this method.
        
        class Inner {
            // ===== Local Inner Class =====
            // A "local inner class" is defined inside a method (not directly inside a class).
            // It is local to that method, just like local variables.
            
            public void sum(int x, int y) {
                // A simple method that prints the sum of two integers.
                System.out.println("The Sum :" + (x + y));
            }
        }
        
        // ===== Creating an object of the local inner class =====
        Inner i = new Inner();
        // You can create the object *only* inside the method where the local class is defined.
        // The local class 'Inner' is not visible outside 'm1()'.

        // ===== Calling methods of the inner class =====
        i.sum(10, 20);     // Prints: The Sum :30
        i.sum(100, 200);   // Prints: The Sum :300
        i.sum(1000, 2000); // Prints: The Sum :3000
    }

    public static void main(String[] args) {
        // ===== Main method (program entry point) =====
        
        Test2 t = new Test2();  // Create an object of the outer class 'Test2'
        t.m1();                 // Call method 'm1()', which defines and uses the local inner class
    }
}