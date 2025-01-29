import java.util.Scanner;

public class Main {
    static int GlobalVariable = 5;
    public static void main(String[] args)
    {
        //Functions helps you in the Reusability.
        Scanner Input = new Scanner(System.in);
        System.out.println("Please enter 3 integers.");
        System.out.println("Please enter the first number");
        int Number1 = Input.nextInt();
        System.out.println("Please enter the second number");
        int Number2 = Input.nextInt();
        System.out.println("Please  enter the third number");
        int Number3 = Input.nextInt();
        int Sum = SumOfThreeNumbers(Number1,Number2,Number3);
        double Average = CalculateAverageOfTheThreeNumbers(Number1,Number2,Number3);
        Display(Sum,Average);
        {
            int x=0;
            x = 5;
            x = Number1;
        }
        //x;Not allowed as x is local variable only in between the previous two brackets.
        int GlobalVariable = 10;
        System.out.println(GlobalVariable);//It will prints 10 as the compiler we use the closer variable to the method.
        //To make the compiler prints and force it to print the global variable
        System.out.println(Main.GlobalVariable);
    }
    //Reusability of this code
    public static int SumOfThreeNumbers(int Num1,int Num2, int Num3)
    {
        System.out.println(GlobalVariable);//This is allowed
        return Num1+Num2+Num3;
    }
    public static double CalculateAverageOfTheThreeNumbers(int Num1, int Num2, int Num3)
    {
        return SumOfThreeNumbers(Num1,Num2,Num3)/3;
    }
    public static void Display(int s, double Avg)
    {
        System.out.println("The Sum of the 3 numbers is " + s);
        System.out.println("The average of the 3 numbers is " + Avg);
    }
}