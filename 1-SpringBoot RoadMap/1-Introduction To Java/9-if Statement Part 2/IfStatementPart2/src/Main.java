import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        //Nested if statement
        int Number=0;
        System.out.println("Please enter a number");
        Number = Input.nextInt();
        if(Number > 0)
        {
            if(Number % 2 == 0)
            {
                System.out.println("The number is even");
            }
            else System.out.println("The number is odd");
        }
        else
        {
            System.out.println("The number is negative");
        }

        //Multi-Way if Statements

        int Marks = Input.nextInt();

        if(Marks > 90)
        {
            System.out.println("You Got A");
        }
        else if(Marks > 80)
        {
            System.out.println("You Got B");
        }
        else if (Marks > 70)
        {
            System.out.println("You Got C");
        }
        else if(Marks > 60)
        {
            System.out.println("You Got D");
        }
        else
        {
            System.out.println("You got F");
        }

        //Logical Operators
        //&& , ||
        //&& all must be true so the result becomes true.
        //|| one must be true at least so the result becomes true.
        if(Marks > 90 && Marks < 100)
        {
            System.out.println("you got A");
        }
        else if(Marks > 80 || Marks < 90)
        {
            System.out.println("You Succeeded");
        }
        else
        {
            System.out.println("Numbers are out of range");
        }
    }
}