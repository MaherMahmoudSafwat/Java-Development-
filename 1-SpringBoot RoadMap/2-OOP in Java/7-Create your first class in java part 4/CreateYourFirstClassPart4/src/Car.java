import java.time.Year;
import java.util.Scanner;

public class Car
{
    private String Name;
    private int YearModel;

    //Setter, Mutator
    public void setName(String name)
    {
        Name = name;
    }
    public void setYearModel(int Year_Model)
    {
        while(Year_Model <= 0)
        {
            System.out.println("Year must be greater than Zero 0.");
            Scanner Input = new Scanner(System.in);
            Year_Model = Input.nextInt();
        }
        YearModel=Year_Model;
    }

    //Getter,Accessor
    public String getName()
    {
        return Name;
    }
    public int getYearModel()
    {
        return YearModel;
    }
    /*
     Summary of Differences:
     Setter = Method to set a value (or mutate state).
     Mutator = Term used for any method that mutates or modifies the state, including setters.
     Getter = Method to get or retrieve a value (accessor).
     Accessor = Method to access or retrieve a value, often synonymous with getter.
     */
}
