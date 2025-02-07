import java.util.Scanner;

public class HardMathLevelQuiz extends MathQuizMenu
{
    public static void Shifter(String GetRandomOperator, int GetMaxLength)
    {
        int DifferenceLengthMinimum = 0;
        for(int i = 0; i<ArrayOfNumbers.length;i++)
        {
            if(i==0)
            {
                DifferenceLengthMinimum=GetMaxLength-ArrayOfNumbers[i].length();
                ArrayOfNumbers[i] = NumberOfSpaces(DifferenceLengthMinimum+1) + ArrayOfNumbers[i];
                continue;
            }
            DifferenceLengthMinimum=GetMaxLength-ArrayOfNumbers[i].length();
            ArrayOfNumbers[i] = GetRandomOperator + NumberOfSpaces(DifferenceLengthMinimum) + ArrayOfNumbers[i];
        }
    }
    public static void GetNumbers(String GetRandomOperator)
    {
        ArrayOfNumbers = new String[(int)(Math.random()*7)+2];
        ArrayOfNumbersOnly = new int[ArrayOfNumbers.length];
        for(int i = 0;i<ArrayOfNumbers.length;i++)
        {
            if(i==0)
            {
                ArrayOfNumbers[i] = String.valueOf((int) (Math.random() * 500000));
                ArrayOfNumbersOnly[i] = Integer.parseInt(ArrayOfNumbers[i]);
            }
            else
            {
                ArrayOfNumbers[i] = String.valueOf((int) (Math.random() * 500000));
                if(Integer.parseInt(ArrayOfNumbers[i])==0)
                    ArrayOfNumbers[i]=String.valueOf(1);
                ArrayOfNumbersOnly[i] = Integer.parseInt(ArrayOfNumbers[i]);
            }
        }
    }
    public static String NumberOfSpaces(int N)
    {
        String SpacesNumber = "";
        for(int i =0; i < N; i++)
            SpacesNumber+=" ";
        return SpacesNumber;
    }
    public static void HandleEquationsLength(String GetRandomOperator)
    {
        int GetMaxLength = 0;
        for(int i = 0;i<ArrayOfNumbers.length;i++)
        {
            if(ArrayOfNumbers[i].length() > GetMaxLength)
                GetMaxLength = ArrayOfNumbers[i].length();//
        }
        Shifter(GetRandomOperator,GetMaxLength);
    }
    public static void ShowEquationsToUserInTheScreen()
    {
        for(String i : ArrayOfNumbers)
        {
            System.out.println(U.TabsNumbers(11) + i);
        }
        System.out.println(U.TabsNumbers(10) + "----------------------------");
    }
    public static boolean GetFinalResult(String GetOperator,long UserInput)
    {
        long GetResult = 0;
        switch(GetOperator)
        {
            case "+":
                for(int i :ArrayOfNumbersOnly)
                {
                    GetResult+=i;
                }
                break;
            case "-":
                GetResult = ArrayOfNumbersOnly[0]-ArrayOfNumbersOnly[1];
                for(int i=2;i<ArrayOfNumbersOnly.length;i++)
                {
                    GetResult-=ArrayOfNumbersOnly[i];
                }
                break;
            case "*":
                GetResult = 1;
                for(int i : ArrayOfNumbersOnly)
                {
                    GetResult*=i;
                }
                break;
            case "/":
                GetResult = ArrayOfNumbersOnly[0]/ArrayOfNumbersOnly[1];
                for(int i =2; i<ArrayOfNumbersOnly.length;i++)
                {
                    GetResult/=ArrayOfNumbersOnly[i];
                }
                break;
        }
        if(UserInput==GetResult)
        {
            System.out.println(U.TabsNumbers(10)+"Correct Answer :-).");
            return true;
        }
        System.out.println(U.TabsNumbers(10) + "Wrong Answer :-(.");
        System.out.println(U.TabsNumbers(10) + "The right answer is " + GetResult);
        return false;
    }
    public static long GetUserInput()
    {
        String UserInput = "";
        boolean IsValidUserInput = true;
        Scanner Input = new Scanner(System.in);
        do
        {
            System.out.print(U.TabsNumbers(10));
            UserInput = Input.nextLine();
            while(UserInput.isEmpty()||UserInput==null)
            {
                System.out.print(U.TabsNumbers(10));
                UserInput = Input.nextLine();
            }
            IsValidUserInput = !U.IsChoiceValidWithNegativeSign(UserInput);
            if(IsValidUserInput)
            {
                System.out.println(U.TabsNumbers(10)+"Invalid Choice, Please try again.");
                Input.nextLine();
            }
        }while(IsValidUserInput);
        return Long.parseLong(UserInput);
    }
    public static void Display()
    {
        U.ClearerTheScreen();
        int Counter = 0;
        CounterAnswers = 0;
        while(Counter < 10)
        {
            int GetOperator = (int)((Math.random()*4));
            GetNumbers(ArrayOfOperators[GetOperator]);
            HandleEquationsLength(ArrayOfOperators[GetOperator]);
            ShowEquationsToUserInTheScreen();
            GetIncrementScore(GetFinalResult(ArrayOfOperators[GetOperator],GetUserInput()));
            Counter++;
        }
    }
}

