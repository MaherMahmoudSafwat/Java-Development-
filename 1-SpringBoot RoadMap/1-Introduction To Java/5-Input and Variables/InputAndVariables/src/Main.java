import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner is a class an input is an object that reads from User.
        //System.in means that the System reads Input from user.
        Scanner Input  = new Scanner(System.in);
        System.out.println("Please enter Your FirstName:");
        int x = y = z; 
        String Fname; //Declaration to the Variable.
        Fname = "";   //Assignment to the Variable.
        String Name = "";//initalization
        Fname = Input.next();
        System.out.println("Your name is " + Fname);
        System.out.println("Enter Your Salary.");
        int Salary = 0;
        //Use f at the end of float datatypes.
        float NetSalary=3.5f,FullSalary=0;
        Salary = Input.nextInt();
        //NetSalary = Input.nextFloat();
        NetSalary = Salary * 0.1f;
        System.out.printf("Your Net Salary is %f",NetSalary);
    }
}
