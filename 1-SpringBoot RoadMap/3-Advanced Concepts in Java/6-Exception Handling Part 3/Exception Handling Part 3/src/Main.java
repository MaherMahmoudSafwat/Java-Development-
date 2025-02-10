import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {
    /*
    Exception propagation allows exceptions to be passed from the method where they occur up the call stack to a method that can handle them.
    It improves code structure, making it easier to centralize and customize exception handling.
    Using the throws keyword in a method allows that method to declare exceptions it may throw, forcing the caller to handle or propagate them.
    */
    public static void Reader2() throws FileNotFoundException {
        FileReader("C:/Users/Maher/Desktop/EmptyTextFile.txt");
    }
    public static void FileReader(String FileReaderPath) throws FileNotFoundException,ArithmeticException
    {
        /*
         * The `throws` keyword in Java is used in method signatures to declare that a method might throw one or more exceptions.
         * It is part of the exception handling mechanism and allows a method to signal that it may encounter certain exceptions
         * during its execution, which the caller of the method will need to handle.
         *
         * Benefits of `throws`:
         *
         * 1. **Method Signature Declaration**:
         *    - When a method is declared with `throws`, it makes the exception handling explicit. The caller of the method knows
         *      that it needs to handle the specified exception(s) or propagate them further up the call stack.
         *    - This is particularly useful when working with **checked exceptions**, which must be either caught or declared.
         *
         * 2. **Promotes Robust Error Handling**:
         *    - By declaring exceptions using `throws`, it forces the caller to deal with exceptions properly. It helps to avoid
         *      situations where exceptions are ignored or not handled correctly, improving the reliability and robustness of the code.
         *
         * 3. **Code Readability**:
         *    - Declaring exceptions with `throws` makes it clear what kinds of exceptions a method might throw, making the code
         *      more readable and maintainable. The developer can easily understand which exceptions might be thrown and can plan
         *      their exception handling strategy.
         *
         * 4. **Exception Propagation**:
         *    - The `throws` keyword allows exceptions to be **propagated** to higher levels of the call stack. This is useful when
         *      the current method cannot or does not want to handle the exception but wants to pass it to a higher method for handling.
         *
         * Example of usage:
         *
         * public void readFile(String filename) throws IOException {
         *     // Code that may throw IOException (e.g., FileNotFoundException)
         *     FileReader file = new FileReader(filename);
         *     BufferedReader reader = new BufferedReader(file);
         *     // Reading file
         * }
         *
         * In this case, `IOException` is declared with `throws`, so any method calling `readFile()` must handle this exception
         * either with a try-catch block or by declaring it further up the call stack.
         */

        FileReader Reader = null;
        Reader = new FileReader(FileReaderPath);
    }
    public static void main(String[] args)  {
        //Checked Exception in Which you have to handle this Exception so you don't get error, you must handle it.4
        /*
        Checked exceptions are important because they:
        Ensure that developers handle predictable, recoverable errors.
        Prevent errors from being silently ignored by forcing explicit handling.
        Improve program robustness by addressing exceptional conditions before runtime.
        Make code easier to maintain and understand by clearly outlining potential failure points.
        */
        FileReader Reader = null;
        try {
            Reader = new FileReader("C:/Users/Maher/Desktop/EmptyTextFile.txt");
            System.out.println("File Content");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally
        {
            try {
                Reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        //--------------------

        try {
            FileReader("C:/Users/Maher/Desktop/EmptyTextFile.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}