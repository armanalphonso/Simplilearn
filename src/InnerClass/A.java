package InnerClass;
// The class belongs to the package "InnerClass".
// Packages help organize Java classes logically.

class A {
    // ===== Outer class (Level 1) =====
    
    class B {
        // ===== Inner class (Level 2) — nested inside A =====
        
        class C {
            // ===== Inner class (Level 3) — nested inside B =====
            
            public void m1() {
                // A simple instance method inside class C
                System.out.println("Inner class method");
            }
        }
    }
}
class Test1 {
    // ===== Separate class with main() method to test1 nested classes =====
    public static void main(String[] args) {

        // Step 1: Create an object of the OUTER class 'A'
        A a = new A(); 
        // Syntax: new A() — creates an instance of class A.

        // Step 2: Create an object of INNER class 'B' using the outer class object 'a'
        A.B b = a.new B(); 
        // Syntax rule: For a NON-STATIC inner class, you must use the outer class instance.
        // General form: OuterClass.InnerClass innerObj = outerObj.new InnerClass();

        // Step 3: Create an object of the nested inner class 'C' using the inner class 'B' object
        A.B.C c = b.new C();
        // Syntax rule: For a MULTI-LEVEL inner class, 
        // you must use an instance of its directly enclosing class ('b' in this case).

        // Step 4: Call the method m1() from class C
        c.m1(); 
        // Output: "Inner class method"
    }
}