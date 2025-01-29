import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        int Marks=0;
        System.out.println("Please enter your Mark.");
        Marks = Input.nextInt();

        //Selection Statement, Control Flow , One way Statement
        if(Marks >= 60)
            System.out.println("Congratulations you Succeeded");
        if(Marks >= 70)
        {
            System.out.println("Congratulations");
            System.out.println("Your are up to next level");
        }
        //one = is assignment but two equals are comparsion.
        int a = 9, b = 5;
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a != b);//Not Equal is a not equals to b

        //Two Way Selection Statements
        System.out.print("Please enter a number\n");
        int Number = Input.nextInt();
        if(Number < 0)
            System.out.print("This number is negative.\n");
        else
            System.out.println("This number is positive.\n");
    }

}