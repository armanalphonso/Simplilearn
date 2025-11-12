// Package declaration - this file is part of the package 'InnerClass'
package InnerClass;

/*
 * Outer class declaration - class Test8
 * - This is the main (outer) class that contains variables and a local inner class.
 */
class Test8 {

    /*
     * Instance variable (non-static)
     * - Belongs to each individual object of Test8.
     * - You need to create an object of Test8 to access 'x'.
     */
    int x = 10;

    /*
     * Static variable
     * - Belongs to the class itself, not to any specific object.
     * - Can be accessed directly using Test8.y or just 'y' within the same class.
     */
    static int y = 20;

    /*
     * Instance initializer block
     * - This block runs automatically every time an object of Test8 is created,
     *   before the constructor.
     * - Syntax: { ... } (block directly inside the class body, but outside any method/constructor)
     */
    {
        /*
         * Local Inner Class Declaration
         * - Declared inside a block (like this initializer block, or a method, or a constructor).
         * - Scope: It exists only within this block. Outside of it, it cannot be accessed.
         * - Unlike static nested classes, local inner classes are *non-static* by nature.
         * - They can access:
         *      ✅ Instance variables of the outer class (like x)
         *      ✅ Static variables of the outer class (like y)
         */
        class Nested {

            /*
             * Instance method m1() of the local inner class.
             * - Prints both instance and static variables of the outer class.
             */
            public void m1() {
                // Accessing outer class's instance variable
                System.out.println(x);

                // Accessing outer class's static variable
                System.out.println(y);
            }
        }

        /*
         * NOTE:
         * We declared the class Nested here, but it hasn’t been *used*.
         * To use it, you would need to create an instance inside the same block:
         * 
         *    Nested n = new Nested();
         *    n.m1();
         *
         * Otherwise, this block simply defines the class but does not execute anything.
         */
    }
}