import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        //Signature of function is FunctionName With Parameters it has
        int Num1=1,Num2=2;
        System.out.println("Please enter Number 1");
        Num1 = Input.nextInt();
        System.out.println("Please enter Number 2");
        Num2 = Input.nextInt();
        //System.out.println("The larger number is " + Larger(Num1,Num2));*/
        /*char FirstCharacter = 'a';
        char SecondCharacter = 'b';
        System.out.println("Please enter character number 1");
        FirstCharacter = Input.next().charAt(0);
        System.out.println("Please enter character number 2");
        SecondCharacter = Input.next().charAt(0);
        System.out.println("The larger character is " + Larger(FirstCharacter,SecondCharacter));*/
        System.out.println("Please enter Number 3");
        int Num3 = Input.nextInt();
        System.out.println("The larger number is " + Larger(Num1,Num2,Num3));
    }
    //Function (Method) Overloading
    public static int Larger(int N1, int N2)
    {
        if(N1 > N2)
            return N1;
        else
            return N2;
    }
    public static char Larger(char A1, char A2)
    {
        if(A1>A2)
            return A1;
        else return A2;
    }
    public static int Larger(int N1, int N2, int N3)
    {
        if(N3 > N1 && N2 > N3)return N2;
        else if(N1 > N2 && N1 > N3) return N1;
        else return N3;
    }
}