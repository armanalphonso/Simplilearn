package Default_Package;

public class DoWhileDemo {
    public static void main(String[] args) {
        int count = 1; // Initialize count to 1
        
        // do-while loop syntax
        do {
            // Code inside the do block executes at least once
            System.out.println("Count is: " + count);
            // No modification of count variable here, so this will run infinitely
        } while (count < 10); // Condition checked after do block executes
    }
}
