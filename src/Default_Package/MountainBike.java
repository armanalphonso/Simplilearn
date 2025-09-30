package Default_Package; 
// Declaring the package name (a way to organize classes)

// Parent class
class Bicycle {
    public int speed;   // Attribute (field) for speed
    public int gear;    // Attribute (field) for gear

    // Constructor to initialize speed and gear
    public Bicycle(int speed, int gear) {
        this.speed = speed; // 'this' refers to the current object's speed
        this.gear = gear;   // Assign parameter to class field
    }

    // Method to display bicycle details
    public void display() {
        System.out.println("Speed: " + speed + ", Gear: " + gear);
    }
}

// Child class (inherits Bicycle using 'extends')
class LandBike extends Bicycle {
    public int seatHeight; // Additional property for LandBike

    // Constructor for LandBike
    public LandBike(int speed, int gear, int seatHeight) {
        super(speed, gear); // Call parent class constructor
        this.seatHeight = seatHeight; // Assign seatHeight value
    }

    // Overriding the display() method from Bicycle class
    public void display() {
        super.display(); // Call parent's display() to show speed & gear
        System.out.println("Seat Height: " + seatHeight); // Add seat height
    }
}

// Main class to run the program
public class MountainBike {
    public static void main(String[] args) {
        // Create a LandBike object with speed=20, gear=3, seatHeight=25
        LandBike bike = new LandBike(20, 3, 25);

        // Call display() method → prints speed, gear, and seat height
        bike.display();
    }
}