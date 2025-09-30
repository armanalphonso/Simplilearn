package Default_Package;  
// Package declaration (used to organize classes into groups)


// Class declaration
public class Student {
    // Private fields (Encapsulation: accessible only inside this class)
    private String name;
    private int age;
    private String address;

    // Constructor to initialize name, age, and address
    public Student(String name, int age, String address) {
        this.name = name;       // 'this' refers to the current object
        this.age = age;         // Assigns parameter 'age' to the class field
        this.address = address; // Assigns parameter 'address' to the class field
    }

    // Setter method to change 'name'
    public void SetName(String name) {
        this.name = name;
    }

    // Setter method to change 'age'
    public void setAge(int age) {
        this.age = age;
    }

    // Setter method to change 'address'
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter method to access 'name'
    public String getName() {
        return name;
    }

    // Getter method to access 'age'
    public int getAge() {
        return age;
    }

    // Getter method to access 'address'
    public String getAddress() {
        return address;
    }

    // toString() method → returns object data as a formatted string
    public String toString() {
        return ("Student name is " + this.getName()
                + ", age is: " + this.getAge()
                + " and address is: " + this.getAddress());
    }

    // main() method (program starts here)
    public static void main(String[] args) {
        // Create a Student object 'john' and initialize via constructor
        Student john = new Student("John", 25, "23 East, California");

        // Print student details using getter methods
        System.out.println(john.getName());     // prints: John
        System.out.println(john.getAge());      // prints: 25
        System.out.println(john.getAddress());  // prints: 23 East, California
    }
}