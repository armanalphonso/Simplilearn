package Default_Package;

public class IfElseifDemo {
    public static void main(String[] args) {
        int testscore = 76; // Declares and initializes the test score
        char grade; // Declares a variable to store the grade

        // Start checking conditions from top
        if (testscore >= 90) {           // Checks if score is 90 or above
            grade = 'A';                 // If true, assigns grade A
        } else if (testscore >= 80) {    // Checks if score is 80 or above (and less than 90)
            grade = 'B';                 // If true, assigns grade B
        } else if (testscore >= 70) {    // Checks if score is 70 or above (and less than 80)
            grade = 'C';                 // If true, assigns grade C
        } else if (testscore >= 60) {    // Checks if score is 60 or above (and less than 70)
            grade = 'D';                 // If true, assigns grade D
        } else {                         // If none of the above are true
            grade = 'F';                 // Assigns grade F
        }
        System.out.println("Grade = " + grade); // Prints the result
    }
}