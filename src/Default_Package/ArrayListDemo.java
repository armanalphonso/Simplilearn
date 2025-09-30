package Default_Package;

// Import the required classes
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Creates an ArrayList of Integer type with an initial capacity of 5
        List<Integer> arrayList = new ArrayList<Integer>(5);

        // Adds integers 1 to 5 into the arrayList using the add() method
        for (int i = 1; i <= 5; i++)
            arrayList.add(i); // .add(element) appends the element at the end of the list

        // Prints the arrayList contents: [1, 2, 3, 4, 5]
        System.out.println(arrayList);

        // Removes the element at index 3 (which is the number 4) from the list
        arrayList.remove(3);

        // Prints the updated arrayList: [1, 2, 3, 5]
        System.out.println(arrayList);

        // Iterates through the arrayList and prints each element on a new line
        for (int i = 0; i < arrayList.size(); i++)
            System.out.println(arrayList.get(i)+"");
    }
}