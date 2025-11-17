package Constructor; 
// 'package' is used to group related classes. 
// Here, the class Student belongs to the package named 'Constructor'.

class Student {
    
    // Instance variables (also called fields)
    // These hold data specific to each object of the Student class.
    String name;   
    int rollno;

    // Constructor of the Student class
    // A constructor is a special method used to initialize objects.
    // It has the same name as the class and does NOT have a return type (not even void).
    Student(String name, int rollno) {
        // 'this' keyword refers to the current object.
        // It is used to differentiate between instance variables and parameters 
        // when they have the same name.
        this.name = name;
        this.rollno = rollno;
    }

    // Main method: Entry point of the program
    public static void main(String[] args) {

        // Creating object s1 using the constructor
        // 'new' keyword allocates memory and calls the constructor.
        Student s1 = new Student("Durga", 54);

        // Creating object s2
        Student s2 = new Student("Addi", 48);

        // Printing values stored in object s1
        // Accessing instance variables using the dot (.) operator
        System.out.println(s1.name + " " + s1.rollno);

        // Printing values stored in object s2
        System.out.println(s2.name + " " + s2.rollno);
    }
}