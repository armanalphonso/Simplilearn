package Default_Package;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        // Creating a list and adding integer elements
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);

        // Using Java Stream to map each number to its square and collect into a list
        List<Integer> squaresList = numbersList.stream()
                .map(x -> x * x) // map() transforms each element
                .collect(Collectors.toList()); // collect() gathers elements into a list

        System.out.println("List of squared numbers: " + squaresList);

        // Using a set to eliminate duplicates and store squared numbers
        Set<Integer> squareSet = new HashSet<>();
        for (Integer i : numbersList) {
            squareSet.add(i * i); // Manually squaring each number and adding to the set
        }

        System.out.println("Set of squared numbers (no duplicates): " + squareSet);
    }
}