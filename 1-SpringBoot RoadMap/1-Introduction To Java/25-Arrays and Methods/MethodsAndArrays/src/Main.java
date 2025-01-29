import java.util.Scanner;

public class Main {
    static Scanner Input = new Scanner(System.in);
    public static void main(String[] args)
    {
        int [][][] Matrix = new int[1][2][3];
    }
    public static void FillAnArrayList(int [] List)
    {
        for(int i = 0; i < List.length; i++)
        {
            System.out.println("Please enter the Element Number no. " + (i+1));
            List[i] = Input.nextInt();
        }
    }
    public static void PrintArrayList(int [] Lists)
    {
        for(int i = 0; i < Lists.length; i++)
        {
            System.out.println(Lists[i]);
        }
    }
    public static int SearchForAnTarget(int [] Lists, int Target)
    {
        for(int i = 0; i < Lists.length; i++)
        {
            if(Lists[i] == Target)
                return i;
        }
        return -1;
    }
}
