// Example of exception handling in Java: Catching and handling errors during runtime

public class Main {
    public static void main(String[] args) {
        // Try block: Code that may throw an exception
        try {
            int[] numbers = {1, 2, 3};
            // Attempting to access an invalid index (out of bounds)
            System.out.println(numbers[5]);  // This will throw ArrayIndexOutOfBoundsException
        }
        // Catch block: Catching specific exceptions and handling them
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Tried to access an invalid array index.");
        }

        // Another example with a division operation
        try {
            int result = 10 / 0;  // This will throw ArithmeticException (division by zero)
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        // Example with multiple exceptions
        try {
            String input = null;
            // Trying to call a method on a null object (will throw NullPointerException)
            System.out.println(input.length());
        }
        // Multiple catch blocks can be used to handle different exceptions
        catch (NullPointerException e) {
            System.out.println("Error: Attempted to call a method on a null object.");
        }

        // Example using finally block
        try {
            System.out.println("Opening a resource...");
            // Simulating some code that may throw an exception
            int number = 10 / 0;  // Division by zero will throw an ArithmeticException
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        }
        finally {
            // This block is always executed, regardless of whether an exception occurred or not
            System.out.println("Closing resources...");  // For example, closing file streams or database connections
        }
    }

}