import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner Input  = new Scanner(System.in);
        System.out.println("Enter a grade");
        char Grade = Input.next().charAt(0);//Read only the character of the string
        switch(Grade)
        {
            case 'A': //Will compare A with Grade
                System.out.println("Excellent");
                break;//It will get out of the switch statement
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Fair");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade");
                break;

        }
    }
}