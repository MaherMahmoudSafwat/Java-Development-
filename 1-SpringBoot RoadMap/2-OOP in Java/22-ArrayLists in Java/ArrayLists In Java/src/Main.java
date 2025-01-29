import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList using the add() method
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Display the ArrayList elements
        System.out.println("ArrayList: " + numbers);

        // Accessing elements using the get() method
        System.out.println("Element at index 2: " + numbers.get(2));  // Output: 30

        // Checking the size of the ArrayList using the size() method
        System.out.println("Size of ArrayList: " + numbers.size());  // Output: 5

        // Removing an element at a specific index using the remove() method
        numbers.remove(2);  // Removes the element at index 2 (value 30)
        System.out.println("ArrayList after removal: " + numbers);

        // Removing a specific element by value using remove(Object) method
        numbers.remove(Integer.valueOf(50));  // Removes the element with value 50
        System.out.println("ArrayList after removing value 50: " + numbers);

        // Checking if an element exists using contains() method
        boolean contains20 = numbers.contains(20);  // Returns true if 20 is in the list
        System.out.println("Does the ArrayList contain 20? " + contains20);  // Output: true

        // Checking if the ArrayList is empty using isEmpty() method
        System.out.println("Is the ArrayList empty? " + numbers.isEmpty());  // Output: false

        // Clearing all elements from the ArrayList using the clear() method
        numbers.clear();
        System.out.println("ArrayList after clear: " + numbers);  // Output: []

        // Adding elements again to demonstrate other methods
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);

        // Iterating over the ArrayList using a for-each loop
        System.out.println("ArrayList elements after adding new values:");
        for (int num : numbers) {
            System.out.println(num);  // Output: 100, 200, 300, 400
        }

        // Using indexOf() to find the index of an element
        int indexOf300 = numbers.indexOf(300);  // Returns the index of 300
        System.out.println("Index of 300: " + indexOf300);  // Output: 2

        // Using set() to update an element at a specific index
        numbers.set(2, 350);  // Replaces element at index 2 with 350
        System.out.println("ArrayList after updating index 2: " + numbers);  // Output: [100, 200, 350, 400]

        // Using toArray() to convert the ArrayList into an array
        Integer[] numArray = numbers.toArray(new Integer[0]);
        System.out.println("Array converted from ArrayList: ");
        for (int num : numArray) {
            System.out.println(num);  // Output: 100, 200, 350, 400
        }
    }
}