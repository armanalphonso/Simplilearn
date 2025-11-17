package Constructor;
// This package declaration defines the namespace/folder where this class belongs.

import java.io.*;
// Importing java.io package because we are using IOException,
// which is located inside this package.


// ======================= PARENT CLASS =======================
class P1 {

    // Parent class constructor
    P1() throws IOException {
        /*
         * This is the constructor of class P1.
         *
         * 'throws IOException'
         * ---------------------
         * - IOException is a CHECKED EXCEPTION.
         * - Means the constructor may throw this exception.
         * - Any class or method calling this constructor
         *   MUST either handle (try-catch) or declare (throws) it.
         *
         * Since this constructor does not contain any code,
         * it still DECLARES it may throw IOException.
         */
    }
}


// ======================= CHILD CLASS =======================
class C1s extends P1 {
    /*
     * 'extends P1' means:
     * - C1s is a child class of P1
     * - C1s inherits all accessible members of P1
     * - C1s must call a constructor of P1 (explicitly or implicitly)
     */

    C1s() throws IOException {
        /*
         * Child class constructor.
         * It MUST handle or declare any checked exceptions 
         * thrown by the parent class constructor.
         *
         * Since P1() throws IOException,
         * this constructor MUST also declare:
         *    throws IOException
         *
         * or use try-catch to handle it.
         */

        super();  
        /*
         * 'super()' ALWAYS calls the parent class constructor.
         * It must be the FIRST statement inside any constructor.
         *
         * Here, it calls:
         *     P1() throws IOException
         */
    }
}