public class Main {
    //Public is used so that we can call this method from inside this class or from outside this class.
    //Static is used so that we can use it to call the method directly without the need to create a new object.
    //void has no return type.
    public static void DrawLine1()
    {
        int i;
        for(i=0; i<71; i++)
        {
            System.out.print('*');
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        //Built-in Functions
        int Number = (int)Math.pow(2,3);
        System.out.println(Number);
        Number = (int)Math.pow(2,3)/4 + 2/4;
        System.out.println(Number);
        //---------------------------------------
        DrawLine1();
        Drawline2('-');
        Drawline3('&',79);
        System.out.println("Welcome to the First Lecture in the Methods or / Functions");
        DrawLine1();
        Drawline2('*');
        Drawline3('#',89);
        System.out.println(SumOfTheNumbers(2,3));
        int Numbers = 0;
        int Sum = SumOfTheNumbers(3,5);
        System.out.println(Sum);
        Numbers /= Sum;
        System.out.println(Numbers);
        Sum = SumOfTheNumbers(7,9)+8%5;
        System.out.println(Sum);

    }
    public static void Drawline2(char Draw)
    {
        int i;
        for (i=0; i<71; i++)
        {
            System.out.print(Draw);
        }
        System.out.println();
    }
    public static void Drawline3(char Draw, int Length)
    {
        int i;
        for(i=0; i<Length; i++)
        {
            System.out.print(Draw);
        }
        System.out.println();
    }
    //Data type returned could of be an datatype not just an integer.
    public static int SumOfTheNumbers(int x, int y)
    {
        int z = 0;
        z = x+y;
        return z;
    }
}