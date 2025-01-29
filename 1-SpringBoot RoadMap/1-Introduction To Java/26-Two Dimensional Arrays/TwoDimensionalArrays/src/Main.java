import java.security.PublicKey;
import java.util.Scanner;

public class Main {
    static Scanner Input = new Scanner(System.in);
    public static void main(String[] args)
    {
        int Flag = 0;
        for(int i = 0; i < 20; i++)
        {
            if(i%2==0)
            {
                Flag = 1;
            }
            else
            {
                Flag = 2;
            }
            for(int j = 0; j <= i; j++)
            {
                if(Flag == 1)
                {
                    if(j%2==0)
                    {
                        System.out.print(1);
                    }
                    else
                    {
                        System.out.print(0);
                    }
                }
                else
                {
                    if(j%2==0)
                    {
                        System.out.print(0);
                    }
                    else
                        System.out.print(1);

                }
            }
            System.out.println();
        }
    }
    public static void FillAnArray(int [][] Lists)
    {
        for(int i = 0; i < Lists.length; i++)
        {
            for(int j = 0; j < Lists[i].length; j++)
            {
                System.out.println("Please enter the number in the row " + (i+1) + " and column " + (j+1));
                Lists[i][j] = Input.nextInt();
            }
        }
    }
    public static void PrintAnArray(int [][] Lists)
    {
        for (int i = 0; i < Lists.length; i++)
        {
            for (int j = 0 ;j < Lists[i].length; j++)
            {
                System.out.print(Lists[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int PrintTheSumOfAnElementsOfAnArray(int [][] Lists)
    {
        int Sum = 0;
        for (int i = 0; i < Lists.length; i++) {
            for (int j = 0; j < Lists[i].length; j++) {
                Sum += Lists[i][j];
            }
        }
        return Sum;
    }
    public  static void PrintJaggedArray(int [][] Lists)
    {
        for(int i = 0 ;i < Lists.length; i++)
        {
            for (int j = 0; j < Lists[i].length; j++)
            {
                System.out.print(Lists[i][j] + " ");
            }
            System.out.println();
        }
    }
}