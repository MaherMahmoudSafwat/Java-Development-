import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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
    }
}