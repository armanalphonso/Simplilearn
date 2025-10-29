package Default_Package;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsDemo {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:\\Users\\roman\\OneDrive\\Desktop\\input.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
