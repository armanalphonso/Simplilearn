// Package declaration (optional)
package String;

public class Test10 {
    // Instance variable (private, only accessible within this class)
    private int i;

    // Constructor: initializes the object with a value for 'i'
    Test10(int i) {
        // 'this.i' refers to the instance variable
        // 'i' (on the right) refers to the constructor parameter
        this.i = i;
    }

    // Method that returns a Test10 object
    public Test10 modify(int i) {
        // Checks if the current object's 'i' is equal to the passed value
        if (this.i == i) {
            // If same, return the same object (this) to avoid unnecessary object creation
            return this;
        } else {
            // If different, return a new object with the new value
            return new Test10(i);
        }
    }

    public static void main(String[] args) {
        // Create a Test10 object with i = 10
        Test10 t1 = new Test10(10);

        // Call modify with 100, which is different from t1.i
        // So a new object is created and returned
        Test10 t2 = t1.modify(100);  // t2 ≠ t1

        // Call modify with 10, which is same as t1.i
        // So the same object is returned
        Test10 t3 = t1.modify(10);   // t3 == t1

        // === compares object references, not values
        // t1 and t2 are different objects → false
        System.out.println(t1 == t2);  // Output: false

        // t1 and t3 refer to the same object → true
        System.out.println(t1 == t3);  // Output: true
    }
}