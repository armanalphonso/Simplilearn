package Default_Package;

public class SimpleExceptionDemo {
    public static void main(String[] args) {
        try {
            int data = 100 / 0;  // This will throw ArithmeticException
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        try {
            String a = null;  // This will throw NullPointerException
            System.out.println(a.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot access character from a null string.");
        }
    }
}
