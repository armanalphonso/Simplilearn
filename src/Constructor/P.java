package Constructor;  
// The 'package' declaration defines the folder/namespace 
// where these classes are located. 
// Must match your project's folder structure.


// ===================== PARENT CLASS =====================
class P {

    String s = "Parent";  
    /*
     * Instance variable (field) of class P.
     * Type: String
     * Name: s
     * Value: "Parent"
     *
     * Since this class is the parent of C (via inheritance),
     * class C will inherit this variable.
     */
}



// ===================== CHILD CLASS =====================
class C extends P {  
    // 'extends P' means class C inherits properties of class P.

    String s = "Child";  
    /*
     * This is another variable named 's' in the child class.
     * It has the same name as the parent's 's'.
     * This is called "variable shadowing":
     * The child's variable hides the parent's variable.
     */

    
    public void m1() {
        // A normal method (non-static). Accessible because it is 'public'.

        System.out.println(s);
        /*
         * Prints child's variable 's'.
         * This refers to C.s (child's version).
         * Output: "Child"
         */

        System.out.println(this.s);
        /*
         * 'this' refers to the current object of class C.
         * So this also prints the child's variable.
         * Output: "Child"
         */

        System.out.println(super.s);
        /*
         * 'super' refers to the parent class (P).
         * 'super.s' accesses the parent's variable 's'.
         * Output: "Parent"
         */
    }
}



// ===================== TEST CLASS WITH MAIN METHOD =====================
class Test1s {

    public static void main(String[] args) {
        // without creating an object of the Test1s class.

        C c = new C(); 
        /*
         * Creates an object 'c' of class C.
         * When an object is created, its instance variables
         * become available and its methods can be called.
         */

        c.m1();  
        /*
         * Calls the m1() method of class C.
         * Output will be:
         * Child
         * Child
         * Parent
         */
    }
}