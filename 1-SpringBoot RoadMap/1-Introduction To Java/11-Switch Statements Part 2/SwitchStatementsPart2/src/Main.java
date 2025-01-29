import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Please enter a character to test :");
        char Grade = Input.next().charAt(0);
        switch(Grade)
        {
            //You can have case without default or you you can have default without case.
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel Character");
                break;
            default:
                System.out.println("Normal Character");
        }
        //You can use if if you have ranges and or float numbers to compare and here you must use if.
        //but in any other situation you can use if statement or switch case statement.
        }
}