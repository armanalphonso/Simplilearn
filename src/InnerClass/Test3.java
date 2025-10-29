package InnerClass;  
// Package declaration — this file belongs to the "InnerClass" package.
// Packages help organize classes and avoid naming conflicts.

class Test3 {
    // ===== Outer class definition =====
    
    int x = 10;          // Instance variable of outer class
    static int y = 20;   // Static variable of outer class

    public void m1() {
        // ===== Instance method of the outer class =====
        // The local inner class is declared inside this method.

        class Inner {
            // ===== Local Inner Class =====
            // Defined INSIDE the method m1().
            // It is local to this method — cannot be accessed outside it.

            public void m2() {
                // ===== Method inside the local inner class =====
                // This method can access both instance and static members of the outer class.
                
                System.out.println(x); // Accessing instance variable of outer class
                System.out.println(y); // Accessing static variable of outer class
            }
        }
        // ===== Creating an object of the local inner class =====
        Inner i = new Inner();
        // The local class can only be instantiated inside the same method where it is defined.

        // ===== Calling the method of the inner class =====
        i.m2(); 
        // This will print the values of 'x' and 'y' from the outer class.
    }

    public static void main(String[] args) {
        // ===== Main method (program entry point) =====
        
        Test3 t = new Test3(); // Create an object of the outer class 'Test3'
        t.m1();                // Call method 'm1()', which defines and uses the local inner class
    }
}