import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //All the following are valid for loops.
        for(int i = 0; i<10; i++)
        {
            System.out.println(i);
        }
        for(int i = 10; i>=0; i--)
        {
            System.out.println(i); 
        }
        for(int i = 0; i<=10; i+=2)
        {
            System.out.println(i);
        }
        int i=2;
        for(;i<=10; i+=2)
        {
            System.out.println(i);
        }
        for(;i<=10;)
        {
            System.out.println(i);
            i+=2;
        }
        for (int j = 1; j++<10;)
        {
            System.out.println(j);
        }
        Scanner Input = new Scanner(System.in);
        for(int l = 0; l < 5; l++)
        {
            System.out.println("Please enter the number "+ (l+1) + " to calculate its factorial");
            int NumberToCalculate = Input.nextInt();
            int NumberFactorial = 1;
            for (int m = 1; m <= NumberToCalculate; m++)
            {
                NumberFactorial = NumberFactorial*m;
            }
            System.out.printf("The factorial of %d is %d \n", NumberToCalculate, NumberFactorial);
        }
    }
}
