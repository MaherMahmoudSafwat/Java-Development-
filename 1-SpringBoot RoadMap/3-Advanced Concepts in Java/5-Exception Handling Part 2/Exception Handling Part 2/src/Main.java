public class Main {
    public static void main(String[] args)
    {
        int [] Arr = new int[3];
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
    }
}