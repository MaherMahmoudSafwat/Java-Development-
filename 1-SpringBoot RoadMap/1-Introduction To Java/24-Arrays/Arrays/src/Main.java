import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        //Array Declaration;
        double [] Salaries1 = new double[10];
        //Array Assignment
        Salaries1 = new double [] {1,2,3,4,5,6,7,8,9,10};//Array is a zero based index.
        //Array Initialization
        double [] Salaries2 = {10,20,30,40,50,60,70,80,90,100};
        //Dynamic Array.
        int Size = 5;
        //Array Size should of have an integer data type.
        double [] Salaries3 = new double[Size];//First Type Method
        double [] Salaries4 = new double[Size * 5];//Second Type Method array can have Expression.
        //final is a keyword constant used when you want to unchange the value of a datatype
        final int ARRAY_SIZE = 5;

        for(int i = 0; i < Salaries3.length; i++)
        {
            //To Access array index.
            System.out.println(Salaries3[i]);
        }

        //----------------------------------------------------
        int [] Salaries5 = new int[ARRAY_SIZE];
        int Sum = 0;
        for(int i = 0; i < Salaries5.length; i++)
        {
            System.out.println("Please enter the Salary no. " + (i+1));
            //To Assign an element to every index of the array.
            Salaries5[i] = Input.nextInt();
        }
        int Counter = 0;
        for(int i = 0; i < Salaries5.length; i++)
        {
            //To Access The Elements of The Array.
            Salaries5[0] = 3;
            if(Salaries5[i] > 0)
            {
                Sum+= Salaries5[i];
                Counter++;
            }
        }
        System.out.println("The Sum of Positive numbers in tbe array is " + Sum);
        System.out.printf("While the number of the positive numbers in the array is %d", Counter);
    }
}