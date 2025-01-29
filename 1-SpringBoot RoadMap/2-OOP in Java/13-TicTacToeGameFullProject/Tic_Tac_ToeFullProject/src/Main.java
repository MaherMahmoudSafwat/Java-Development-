import java.util.Scanner;

public class Main {
    static char PlayerChoice;
    static char [] Games = {'-','-','-','-','-','-','-','-','-'};
    static Scanner Input = new Scanner(System.in);
    static TicTacToe XO_Game;
    public static String UtilityMethod(int NumberOfTabs)
    {
        String Tabs = "";
        for(int i = 0; i < NumberOfTabs; i++)
        {
            Tabs += "\t";
        }
        return Tabs;
    }
    public static void main(String[] args)
    {
        System.out.println(UtilityMethod(9) + "Welcome to tic tac toe Game.");
        System.out.print("Please enter your Rule X/O ? :- ");
        do
        {
            PlayerChoice = Input.next().charAt(0);
            XO_Game = new TicTacToe(PlayerChoice);
            if(!XO_Game.GetIsValidCharacter())
            {
                System.out.print("Invalid Choice Please choose your Rule X/O ? :- ");
            }
        }while(!XO_Game.GetIsValidCharacter());
        int WhoStartFirst = (int)(Math.random()*2);
        if (WhoStartFirst == 0)
        {
            ComputerStartsFirst();
        }
        else if(WhoStartFirst==1)
        {
            PlayerStartsFirst();
        }
    }
    public static void PlayerStartsFirst()
    {
        int Index = 0;
        char Winner = 'Z';
        boolean IsEmptyField;
        while(Winner == 'Z')
        {
            if(XO_Game.GetIsFull())
                break;
            XO_Game.DrawGame(Games);
            System.out.println("Please enter the " + XO_Game.PlayerChoice + " in an empty fill field");
            do
            {
                Index = Input.nextInt();
                IsEmptyField = Games[Index]!= '-';
                if(IsEmptyField)
                {
                    System.out.println("You can't put your " + XO_Game.PlayerChoice + " in this field");
                    continue;
                }
                XO_Game.PlayerRound(Games,Index);
            }while(IsEmptyField);
            Winner = XO_Game.WhoIsWinner(Games);
            if(Winner != 'Z')
                break;
            XO_Game.ComputerRound(Games);
            XO_Game.DrawGame(Games);
            Winner = XO_Game.WhoIsWinner(Games);
            if(XO_Game.GetIsFull())
                break;
            if(Winner != 'Z')
                break;
        }
        if(XO_Game.WhoIsWinner(Games)=='Z')
        {
            XO_Game.DrawGame(Games);
            System.out.println("The Game is Over and it is All Draw");
        }
        else if(XO_Game.WhoIsWinner(Games) == 'X' && XO_Game.PlayerChoice == 'X')
        {
            XO_Game.DrawGame(Games);
            System.out.println("congratulations you have won :-) .");
        }
        else if(XO_Game.WhoIsWinner(Games) == 'O' && XO_Game.PlayerChoice == 'O')
        {
            XO_Game.DrawGame(Games);
            System.out.println("congratulations you have won :-).");
        }
        else
        {
            XO_Game.DrawGame(Games);
            System.out.println("Sorry you lost :-(.");
        }
    }
    public static void ComputerStartsFirst()
    {
        int Index = 0;
        char Winner = 'Z';
        boolean IsEmptyField;
        while(Winner == 'Z')
        {
            if(XO_Game.GetIsFull())
                break;
            XO_Game.ComputerRound(Games);
            Winner = XO_Game.WhoIsWinner(Games);
            if(XO_Game.GetIsFull())
                break;
            if(Winner != 'Z')
                break;
            System.out.println("Please enter the " + XO_Game.PlayerChoice + " in an empty fill field");
            XO_Game.DrawGame(Games);
            do
            {
                Index = Input.nextInt();
                IsEmptyField = Games[Index]!= '-';
                if(IsEmptyField)
                {
                    System.out.println("You can't put your " + XO_Game.PlayerChoice + " in this field");
                    continue;
                }
                XO_Game.PlayerRound(Games,Index);
            }while(IsEmptyField);
            XO_Game.DrawGame(Games);
            Winner = XO_Game.WhoIsWinner(Games);
            if(Winner != 'Z')
                break;
        }
        if(XO_Game.WhoIsWinner(Games)=='Z')
        {
            XO_Game.DrawGame(Games);
            System.out.println("The Game is Over and it is All Draw");
        }
        else if(XO_Game.WhoIsWinner(Games) == 'X' && XO_Game.PlayerChoice == 'X')
        {
            XO_Game.DrawGame(Games);
            System.out.println("congratulations you have won :-) .");
        }
        else if(XO_Game.WhoIsWinner(Games) == 'O' && XO_Game.PlayerChoice == 'O')
        {
            XO_Game.DrawGame(Games);
            System.out.println("congratulations you have won :-).");
        }
        else
        {
            XO_Game.DrawGame(Games);
            System.out.println("Sorry you lost :-(.");
        }
    }
}