package InnerClass; 
// This declares that the class belongs to the package named 'InnerClass'.
// Packages are used to organize classes and avoid naming conflicts.


// Define a normal (non-abstract) class PopCorn
class PopCorn {
    public void taste() {
        System.out.println("salty");
    }
}
// This is a simple class with one method 'taste()' that prints "salty".
// Later, we'll override this method using an anonymous inner class.


class Test5 {
    public static void main(String[] args) {
        
        // -------------------- Anonymous Inner Class --------------------
        // Here, we create an object of PopCorn *and at the same time*
        // define a new class that extends PopCorn and overrides 'taste()'.
        // Syntax:
        // ClassName ref = new ClassName() {
        //      // overridden methods or new methods
        // };
        PopCorn p = new PopCorn() {
            public void taste() {
                System.out.println("spicy");
            }
        };
        // 'new PopCorn() { ... }' creates an *anonymous inner subclass* of PopCorn.
        // This subclass overrides the 'taste()' method to print "spicy".
        // No name is given to this class — hence it’s called “anonymous”.
        
        p.taste();  // Calls the overridden 'taste()' → Output: spicy


        // -------------------- Normal Object Creation --------------------
        PopCorn p1 = new PopCorn();
        // This creates a normal PopCorn object (not an anonymous class).
        
        p1.taste();  // Calls the original 'taste()' → Output: salty


        // -------------------- Another Anonymous Inner Class --------------------
        PopCorn p2 = new PopCorn() {
            public void taste() {
                System.out.println("sweet");
            }
        };
        // Again, this is a new *different* anonymous subclass of PopCorn.
        // It overrides 'taste()' to print "sweet".
        
        p2.taste();  // Output: sweet
        System.out.println(p.getClass().getName());
        System.out.println(p1.getClass().getName());
        System.out.println(p2.getClass().getName());
    }
}