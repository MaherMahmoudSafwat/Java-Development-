import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        boolean PositiveInput = true;
        int Counter = 0, Sum = 0;
        while(PositiveInput == true)
        {
            System.out.printf("Please enter a number\n");
            Sum = Input.nextInt();
            if(Sum < 0)
            {
                PositiveInput = false;
            }
            else
            {
                Counter = Counter + Sum;
            }
        }
        System.out.printf("The sum of the numbers you have entered is %d",Counter);
    }
}