package Constructor;
// 'package' groups related classes. This class belongs to the package named 'Constructor'.

class Test {

    // Constructor of the class Test
    // A constructor is a special block of code that is executed automatically 
    // when an object of the class is created.
    // It has:
    //   1. Same name as the class
    //   2. No return type (not even void)
    Test() {
        System.out.println("Constructor");
        // This prints a message every time the constructor is called.
    }

    // Main method — execution starts here
    public static void main(String[] args) {

        // Creating object t1 of class Test
        // 'new' keyword allocates memory and calls the constructor
        Test t1 = new Test();  // Constructor executes here

        // Creating object t2
        Test t2 = new Test();  // Constructor executes again

        // Creating object t3
        Test t3 = new Test();  // Constructor executes again
    }
}