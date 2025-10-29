package Default_Package;

public class SwitchDemo {
    public static void main(String[]args) {
        int month = 6; // Declare and initialize the month variable
        String monthString; // Declare a variable to store the month's name

        // The switch statement checks the value of month
        switch (month) {
            case 1:
                monthString = "January"; // If month == 1
                break; // Exit the switch block
            case 2:
                monthString = "February"; // If month == 2
                break;
            case 3:
                monthString = "March"; // If month == 3
                break;
            case 4:
                monthString = "April"; // If month == 4
                break;
            case 5:
                monthString = "May"; // If month == 5
                break;
            case 6:
                monthString = "June"; // If month == 6
                break;
            case 7:
                monthString = "July"; // If month == 7
                break;
            case 8:
                monthString = "August"; // If month == 8
                break;
            case 9:
                monthString = "September"; // If month == 9
                break;
            case 10:
                monthString = "October"; // If month == 10
                break;
            case 11:
                monthString = "November"; // If month == 11
                break;
            case 12:
                monthString = "December"; // If month == 12
                break;
            default:
                monthString = "Invalid month"; // If no cases match
                break;
        }
        System.out.println(monthString); // Output the result
    }
}