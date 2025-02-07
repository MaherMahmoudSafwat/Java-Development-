import java.io.IOException;
import java.util.Scanner;

public class MainMenuScreen implements Utility
{
    private enum UserChoice{
        GeneralQuestions,MathQuestions,Exit;
        public static UserChoice getValue(String Value)
        {
            return switch (Value) {
                case "1" -> UserChoice.GeneralQuestions;
                case "2" -> UserChoice.MathQuestions;
                default -> UserChoice.Exit;
            };
        }
    };
    private boolean IsChoiceValid=true;
    private boolean IsOutOfRange=true;
    private int FirstTryLooper = 0;
    private void GotoGeneralQuizMenu()
    {
        GeneralQuiz Quiz = new GeneralQuiz();
        Quiz.Display();
    }
    private void GotoMathQuizMenu()
    {
        MathQuizMenu.Display();
    }
    private void UserChoice(UserChoice Choice)
    {
        switch(Choice)
        {
            case UserChoice.GeneralQuestions:
                GotoGeneralQuizMenu();
                break;
            case UserChoice.MathQuestions:
                GotoMathQuizMenu();
                break;
            case  UserChoice.Exit:
                break;
        }
    }
    public void DisplayMainMenuScreen(int i)
    {
        Scanner Input = new Scanner(System.in);
        String Choice = "";
        FirstTryLooper = i;
        do
        {
            if(FirstTryLooper>0)
                ClearerTheScreen();
            FirstTryLooper=1;
            System.out.print(TabsNumbers(10) + "-------------------------------------------");
            System.out.println("------------------------");
            System.out.println(TabsNumbers(15) + " Welcome to the Quiz Game ");
            System.out.print(TabsNumbers(10) + "-------------------------------------------");
            System.out.println("------------------------");
            System.out.println(TabsNumbers(14) + "Please Choose a Quiz type to start.");
            System.out.print(TabsNumbers(10) + "-------------------------------------------");
            System.out.println("------------------------");
            System.out.println(TabsNumbers(15) + "1-General Quiz.");
            System.out.println(TabsNumbers(15) + "2-Math Quiz.");
            System.out.println(TabsNumbers(15) + "3-Exit.");
            System.out.print(TabsNumbers(10) + "-------------------------------------------");
            System.out.println("------------------------");
            System.out.print(TabsNumbers(10));
            Choice = Input.nextLine();
            while(Choice.isEmpty() || Choice==null)
            {
                System.out.print(TabsNumbers(10));
                Choice = Input.nextLine();
            }
            IsChoiceValid = !IsChoiceValid(Choice);
            if(IsChoiceValid)
            {
                System.out.println(TabsNumbers(10) + "Invalid Choice, Please Try Again.");
                Input.nextLine();
                continue;
            }
            IsOutOfRange = !(Integer.parseInt(Choice) >= 1 && Integer.parseInt(Choice)<=3);
            if(IsOutOfRange)
            {
                System.out.println(TabsNumbers(10) + "Choice is out of range please try again.");
                Input.nextLine();
            }
        }while(IsChoiceValid || IsOutOfRange);
        UserChoice(UserChoice.getValue(Choice));
    }
}
