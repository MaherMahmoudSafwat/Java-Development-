import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
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
    public static void main(String[] args){
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
    }
}