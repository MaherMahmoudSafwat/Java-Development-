import java.util.Scanner;

public class MathQuizMenu implements Utility
{
    protected static int CounterAnswers = 0;
    protected static Utility U = new MathQuizMenu();
    protected static String [] ArrayOfOperators = {"+","-","/","*"};
    protected static String [] ArrayOfNumbers;
    protected static int [] ArrayOfNumbersOnly;
    protected static int CorrectAnswer = 0;
    protected static enum DifficultyOfTheGame
    {
        EasyLevel,MediumLevel,HardLevel,Exit;
        public static DifficultyOfTheGame UserChoice(String Choice)
        {
            return switch(Choice)
            {
                case "1"->DifficultyOfTheGame.EasyLevel;
                case "2"->DifficultyOfTheGame.MediumLevel;
                case "3"->DifficultyOfTheGame.HardLevel;
                default -> DifficultyOfTheGame.Exit;
            };
        }
    };

    protected static void UserChoice(DifficultyOfTheGame UserChoice)
    {
        MainMenuScreen MainMenu = new MainMenuScreen();
        switch(UserChoice)
        {
            case DifficultyOfTheGame.EasyLevel:
                CounterAnswers = 0;
                EasyMathLevelQuiz.Display();
                ViewFinalResultsScore();
                MainMenu.DisplayMainMenuScreen(1);
                break;
            case DifficultyOfTheGame.MediumLevel:
                CounterAnswers = 0;
                MediumMathLevelQuiz.Display();
                ViewFinalResultsScore();
                MainMenu.DisplayMainMenuScreen(1);
                break;
            case DifficultyOfTheGame.HardLevel:
                CounterAnswers = 0;
                HardMathLevelQuiz.Display();
                ViewFinalResultsScore();
                MainMenu.DisplayMainMenuScreen(1);
                break;
            case DifficultyOfTheGame.Exit:
                MainMenu.DisplayMainMenuScreen(1);
                break;
        }
    }
    protected static void ViewFinalResultsScore()
    {
        System.out.println(U.TabsNumbers(10) + "Your Score is " + CounterAnswers);
        if(CounterAnswers < 5)
        {
            System.out.println(U.TabsNumbers(10) + "You have a weak math knowledge :-(.");
        }
        else if(CounterAnswers < 8)
        {
            System.out.println(U.TabsNumbers(10) + "You have a normal math knowledge :-|.");
        }
        else
        {
            System.out.println(U.TabsNumbers(10) + "You have a good math knowledge :-).");
        }
        System.out.println(U.TabsNumbers(10) + "Press Any Key to go back to the Main Menu.");
        Scanner Input = new Scanner(System.in);
        Input.nextLine();
    }
    protected static void GetIncrementScore(boolean FlagRightOrWrong)
    {
        CounterAnswers = (FlagRightOrWrong)?++CounterAnswers:CounterAnswers;
    }
    protected static void Display()
    {
        Scanner Input = new Scanner(System.in);
        String Choice = "";
        boolean IsChoiceValid=true;
        boolean IsChoiceOutOfRange=true;
        do
        {
            U.ClearerTheScreen();
            System.out.print(U.TabsNumbers(10) + "-------------------------------------------");
            System.out.println("------------------------");
            System.out.println(U.TabsNumbers(15) + "Welcome to the Math quiz exam.");
            System.out.print(U.TabsNumbers(10) + "-------------------------------------------");
            System.out.println("------------------------");
            System.out.println(U.TabsNumbers(10) + "Please Choose Your Difficulty Level");
            System.out.println(U.TabsNumbers(10) + "1-Easy Level.");
            System.out.println(U.TabsNumbers(10) + "2-Medium Level.");
            System.out.println(U.TabsNumbers(10) + "3-Hard Level.");
            System.out.println(U.TabsNumbers(10) + "4-Exit");
            System.out.print(U.TabsNumbers(10) + "-------------------------------------------");
            System.out.println("------------------------");
            System.out.print(U.TabsNumbers(10));
            Choice = Input.nextLine();
            IsChoiceValid = !U.IsChoiceValid(Choice);
            while(Choice.isEmpty()||Choice==null)
            {
                System.out.print(U.TabsNumbers(10));
                Choice = Input.nextLine();
            }
            if(IsChoiceValid)
            {
                System.out.println(U.TabsNumbers(10) + "Invalid Choice, Please try again.");
                System.out.print(U.TabsNumbers(10));
                Input.nextLine();
                continue;
            }
            IsChoiceOutOfRange = (Integer.parseInt(Choice) > 4 || Integer.parseInt(Choice) < 1);
            if(IsChoiceOutOfRange)
            {
                System.out.println(U.TabsNumbers(10) + "Choice is out of range, Please try again.");
                System.out.print(U.TabsNumbers(10));
                Input.nextLine();
                continue;
            }
        }while(IsChoiceValid || IsChoiceOutOfRange);
        UserChoice(DifficultyOfTheGame.UserChoice(Choice));
    }
}
