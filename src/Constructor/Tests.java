package Constructor;
// 'package' groups related classes. This class belongs to the package named "Constructor".

class Tests {

    // This is NOT a constructor because it has a return type (void).
    // It is a normal METHOD — name happens to match the class name, but
    // because of 'void', it CANNOT be treated as a constructor.
    void Tests() {
        System.out.println("Constructor");
    }

    // This is the REAL constructor.
    // Why? Because:
    //  1. It has the same name as the class (Tests)
    //  2. It has NO return type (not even void)
    Tests() {
        // This constructor runs automatically every time new Tests() is executed.
        System.out.println("Java Constructor Called");
    }

    public static void main(String[] args) {

        // Creating first object of Tests
        // This calls the REAL constructor (Tests())
        Tests t1 = new Tests();

        // Creating second object
        Tests t2 = new Tests();

        // Calling the method Tests()
        // This does NOT call the constructor.
        // It calls the method that prints "Constructor"
        t1.Tests();
    }
}
