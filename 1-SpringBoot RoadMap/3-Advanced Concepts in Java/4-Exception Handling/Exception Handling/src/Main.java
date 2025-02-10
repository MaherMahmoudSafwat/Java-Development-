import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void ValidateNumber2(int Number)//throws Exception is optionally because RuntimeException unlike Exception Class is Unchecked.
    {
        if(Number < 0)
        {
            MyException ME = new MyException("Number less than Zero");
            throw ME;
        }
        System.out.println("ABC");
    }
    public static void f()
    {
        System.out.println("f()");
        f();
    }
    /*
     * The `throw` keyword in Java is used to explicitly **throw** an exception from a method or a block of code.
     * It is used when the program detects an error or an exceptional condition and needs to signal that an error has occurred.
     * When an exception is thrown using `throw`, the normal flow of execution is interrupted, and the control is passed to the nearest
     * `catch` block that can handle the exception.
     *
     * Benefits of `throw`:
     *
     * 1. **Explicit Exception Throwing**:
     *    - `throw` allows you to explicitly throw an exception at a specific point in your code when a certain condition is met.
     *      This provides better control over when and where exceptions are raised.
     *
     * 2. **Custom Exception Handling**:
     *    - By using `throw`, you can throw custom exceptions that are specific to your program’s logic, providing better error handling.
     *      You can create and throw user-defined exceptions to signal particular errors that are unique to your application's domain.
     *
     * 3. **Error Reporting**:
     *    - Throwing exceptions can help report specific errors to the caller (higher-level methods). It allows you to separate
     *      the error-handling code from the main logic of your program.
     *      This makes it easier to identify, diagnose, and fix issues, as errors are explicitly thrown with relevant messages or information.
     *
     * 4. **Ensures Exception Handling**:
     *    - When you throw an exception, you force the caller to deal with the exception, either by catching it or propagating it further.
     *      This ensures that exceptional cases are dealt with appropriately, preventing the program from continuing in an
     *      inconsistent or erroneous state.
     *
     * 5. **Control Flow**:
     *    - `throw` provides a way to alter the normal flow of execution. When an exception is thrown, control is transferred to the
     *    nearest `catch` block or propagated further
     */
    public static void ValidateNumber(int Number)
    {
        if(Number <= 0)
        {
            ArithmeticException AE = new ArithmeticException("Number is less Zero");
            throw AE;
        }
        else
        {
            System.out.println(Number);
        }
    }
    public static void ReadFile() throws FileNotFoundException
    {
        FileNotFoundException FNF = new FileNotFoundException("File Not Found");
        throw FNF;
    }
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
    public static void main(String[] args)
    {
        //Throwable class extends from Object Class
        //Exception class and Error Class both extends from Throwable
        /*
         * Difference between Exception and Error in Java:
         *
         * 1. Exception:
         * - An exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions.
         * - Exceptions are typically caused by problems that the program can recover from, such as invalid input, file not found,
         *   or network connection issues.
         * - Exceptions can be caught and handled using try-catch blocks, allowing the program to recover and continue running.
         * - Example: NullPointerException, IOException, ArithmeticException, etc.
         *
         * 2. Error:
         * - An error represents serious problems that are usually outside the control of the program, and they cannot be recovered from.
         * - Errors typically occur due to environmental issues like JVM or system-related problems.
         * - Errors are not intended to be caught or handled by the program. They indicate severe conditions, and the program should
         * usually terminate.
         * - Example: OutOfMemoryError, StackOverflowError, etc.
         *
         * In summary:
         * - **Exception**: Can be handled and recovered from.
         * - **Error**: Generally cannot be handled, and they indicate more severe problems.
         */
        int [] Arr = new int[3];
        try
        {
            int[] Arr2 = null;
            System.out.println(Arr2[0]);
            Arr[5] = 3;
        }catch(NullPointerException E)
        {
            System.out.println(E.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException E)
        {
            System.out.println(E.getMessage());
        }
        System.out.println("ABC");
        //------------------------------------------------
        Scanner Input = new Scanner(System.in);
        try
        {
            int Number = Input.nextInt() / 0;
        }
        catch(InputMismatchException | ArithmeticException E)
        {
            System.out.println(E.getMessage());
        }
        System.out.println("Hello , Java ");

        //==================================================
        try
        {
            int X = Input.nextInt() / 0;
        }
        catch(Exception E)
        {
            System.out.println(E.getMessage());
        }
        System.out.println("Hello , Java ");

        Arr = new int[3];
        //Try can have zero or more catch and one finally only, but it must have catch or finally.
        try
        {
            Arr[5]=5;
        }
        catch(Exception E)
        {
            System.out.println("Out of Index");
            //System.exit(0); or fatal error will prevent the finally block from being executed.
            return;
        }
        finally
        {
            /*
             * The importance of the `finally` block in a try-catch statement:
             *
             * 1. **Guaranteed Execution**: The `finally` block always executes, regardless of whether an exception is thrown
             * or not. This is important for performing cleanup tasks such as closing resources (e.g., files, database connections,
             * or sockets).
             *
             * 2. **Resource Management**: It ensures that critical code, like releasing resources or closing streams,
             * is executed even if an exception occurs. Without a `finally` block, resources might remain open,
             * leading to memory leaks or other issues.
             *
             * 3. **Exception Handling Flow**: If an exception is thrown in the `try` block, and the `catch` block handles it,
             * the `finally` block still runs after the `catch` block finishes execution.
             * This ensures that any necessary cleanup code is executed regardless of the success or failure of the code inside the `try`.
             *
             * 4. **Cannot Be Skipped**: Even if you use a `return` statement in the `try` or `catch` block,
             * `finally` block will always execute before the method actually returns a value.
             *
             * Example:
             * - If you're opening a file in the `try` block, you can close the file in the `finally` block to ensure it gets closed whether an exception occurred or not.
             */

            System.out.println("Finally");
        }
        System.out.println("ABC");

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
        //Try - catch in errors helps you in knowing the cause of Error but it won't fix it.
        try
        {
            f();
        }
        catch(Error E)
        {
            System.out.println(E);
        }
        try {
            ValidateNumber(-1);
        }
        catch(ArithmeticException E)
        {
            System.out.println(E.getMessage() + " Error");
        }
        System.out.println("ABC");
       /*  try {
            ReadFile();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/
        try
        {
            System.out.println(5/0);
        }
        catch(ArithmeticException E)
        {
            System.out.println(E);
            throw new ArithmeticException("Throw Exception");
        }
        finally
        {
            System.out.println("ABCDEFG");
        }
        try {
            ValidateNumber2(-1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Rest of Code");
    }
}