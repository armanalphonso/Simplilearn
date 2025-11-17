package Constructor; 
// 'package' defines the folder/group this class belongs to.
// The package name should match the directory structure of your project.

class Test1 {
    
    // This is a no-argument constructor for the class Test1.
    Test1() {
        super(); 
        /*
         * 'super()' calls the constructor of the parent class.
         * Since Test1 does not explicitly extend another class,
         * its parent class is 'Object' (the root of all Java classes).
         * So this calls Object's constructor.
         *
         * NOTE: Even if you don't write super(), Java automatically inserts it.
         */

        System.out.println("Constructor");
        // Prints the text "Constructor" to the console
    }
}