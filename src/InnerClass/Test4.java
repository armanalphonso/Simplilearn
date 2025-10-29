package InnerClass;
// Package declaration — this file belongs to the "InnerClass" package.
// Packages help organize related Java classes logically.

class Test4 {
    // ===== Outer class definition =====
    
    public void m1() {
        // ===== Instance method of the outer class =====
        // The local inner class will be declared inside this method.
        
        int x = 10;
        // Local variable inside the method 'm1'.
        // This variable can be accessed by the inner class,
        // BUT — it must be *final* or *effectively final* (its value should not change).

        class Inner {
            // ===== Local Inner Class Definition =====
            // Declared inside method 'm1'.
            // It is local to this method and cannot be accessed outside.

            public void m2() {
                // ===== Method inside the local inner class =====
                // Local inner classes can access:
                // - Instance variables of outer class
                // - Static variables of outer class
                // - Local variables of the enclosing method, ONLY if they are effectively final.

                System.out.println(x);  
                // Accessing the local variable 'x' from the enclosing method.
                // This works because 'x' is effectively final (not modified after initialization).
            }
        }

        // ===== Creating an object of the local inner class =====
        Inner i = new Inner();
        // You can only create and use the local class object inside the same method.

        // ===== Calling method of the local inner class =====
        i.m2();  
        // Prints: 10
    }

    public static void main(String[] args) {
        // ===== Main method — program entry point =====
        
        Test4 t = new Test4();  // Create an object of the outer class 'Test4'
        t.m1();                 // Call 'm1()', which defines and uses the local inner class
    }
}