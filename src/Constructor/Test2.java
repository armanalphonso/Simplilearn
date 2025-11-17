package Constructor;
// The package name defines the folder/namespace of this class.



class Test2 {

    // ------------------- double-argument constructor -------------------
    Test2(double d) {
        this(10);  
        /*
         * 'this(10)' calls another constructor in the SAME class.
         * It must be the FIRST statement inside any constructor.
         *
         * This will call: Test2(int i)
         */

        System.out.println("double-arg Constructor");
        // Executes AFTER the int-arg constructor finishes.
    }



    // ------------------- int-argument constructor -------------------
    Test2(int i) {
        this();  
        /*
         * Calls the no-argument constructor (Test2()).
         * Again, must be the first line inside the constructor.
         */

        System.out.println("int-arg Constructor");
        // Executes after the no-arg constructor finishes.
    }



    // ------------------- no-argument constructor -------------------
    Test2() {
        System.out.println("no-arg Constructor");
        // Basic constructor with no arguments.
    }



    // ------------------- main method -------------------
    public static void main(String[] args) {

        Test2 t1 = new Test2(10.5);
        /*
         * Calls Test2(double)
         * That calls Test2(int)
         * That calls Test2()
         */

        Test2 t2 = new Test2(10);
        /*
         * Calls Test2(int)
         * That calls Test2()
         */

        Test2 t3 = new Test2();
        /*
         * Calls Test2()
         */
    }
}