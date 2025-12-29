package session9.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {


        // Declare an ArrayList
        List<String> list = new ArrayList<>();
        // Method to add elements to the ArrayList
        list.add("Mohamed");
        list.add("Ahmed");
        list.add("Sayed");
        list.add("Mahmoud");
        list.add("Omar");
        // Print the ArrayList
        System.out.println("ArrayList: " + list);

        // Method to access elements from the ArrayList
        String firstElement = list.get(0);
        System.out.println("First Element: " + firstElement);
        System.out.println("Second Element: " + list.get(1));

        // Method to remove an element from the ArrayList
        list.remove("Ahmed");
        System.out.println("ArrayList after removal: " + list);

        // Method to update an element in the ArrayList
        list.set(0, "Ali");
        System.out.println("ArrayList after update: " + list);

        // Method to get the size of the ArrayList
        int size = list.size();
        System.out.println("Size of ArrayList: " + size);

        // Method to iterate through the ArrayList
        System.out.println("Iterating through ArrayList:");
        for (String name : list) {
            System.out.println("Name: " + name);
        }

        // Clear the ArrayList
        list.clear();
        System.out.println("ArrayList after clearing: " + list);
    }
}
