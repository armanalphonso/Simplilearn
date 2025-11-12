// Package declaration – this source file belongs to the package named “InnerClass”
package InnerClass;

/*
 * Interface declaration – named Vehicle
 * Interfaces in Java declare abstract methods (and/or default/static methods from Java 8+),
 * and classes “implement” them by providing concrete definitions of those methods. :contentReference[oaicite:0]{index=0}
 */
interface Vehicle {

    /*
     * Abstract method declaration in the interface.
     * Any class that implements Vehicle must provide a public implementation of getNoofwheels().
     */
    public int getNoofwheels();

    /*
     * Nested class inside the interface – named DefaultVehicle.
     * A class can be declared inside an interface; such a nested class is implicitly static. :contentReference[oaicite:1]{index=1}
     * This class implements the Vehicle interface (since “implements Vehicle”).
     */
    class DefaultVehicle implements Vehicle {
        /*
         * Concrete implementation of the getNoofwheels() method of interface Vehicle.
         * Returns 2 in this case.
         */
        public int getNoofwheels() {
            return 2;
        }
    }
}

/*
 * Class Bus implements the Vehicle interface.
 * So it must provide a public implementation of getNoofwheels().
 */
class Bus implements Vehicle {
    public int getNoofwheels() {
        return 6;
    }
}

/*
 * Test class with main() method to run the program.
 */
class Tester {
    public static void main(String[] args) {
        /*
         * Creating an instance of the nested class Vehicle.DefaultVehicle.
         * Because DefaultVehicle is declared within interface Vehicle, the reference is:
         *     Vehicle.DefaultVehicle d = new Vehicle.DefaultVehicle();
         */
        Vehicle.DefaultVehicle d = new Vehicle.DefaultVehicle();
        System.out.println(d.getNoofwheels());  // prints “2”

        /*
         * Creating an instance of class Bus (implements Vehicle).
         */
        Bus b = new Bus();
        System.out.println(b.getNoofwheels());  // prints “6”
    }
}