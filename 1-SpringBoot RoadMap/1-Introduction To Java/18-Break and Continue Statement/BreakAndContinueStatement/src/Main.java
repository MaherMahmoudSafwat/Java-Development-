import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        int Numbers=0, Counter=0, Sum=0;
      /*  while(Counter < 5)
        {
            System.out.println("Please enter the number " + (Counter + 1) + " to calculate");
            Numbers = Input.nextInt();
            if(Numbers < 0)
            {
                System.out.println("Negative Numbers are not allowed");
                break;
            }
            Sum+=Numbers;
            Counter+=1;
        }
        System.out.println("The Sum of numbers is " + Sum);*/

        while(Counter < 5)
        {
            System.out.println("Please enter the number " + (Counter + 1) + " to calculate");
            Numbers = Input.nextInt();
            if(Numbers < 0)
            {
                System.out.println("Negative Numbers are not allowed");
                continue;
            }
            Sum+=Numbers;
            Counter+=1;
        }
        System.out.println("The Sum of numbers is " + Sum);

    }
}