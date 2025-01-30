import A.Class1;
import A.Class1.*;
import B.*;
import static B.Class1.X;

public class Main {
    public static void main(String[] args)
    {
        Class1 A = new Class1();
        //If you two classes have the same name in different packages just do the following.
        B.Class1 NewObject = new B.Class1();
        //I can access X directly without needing any object or class by using the following statement import static B.Class1.X;
        X=5;
        B.Class1.X =5;
        NewObject.X =9;
    }
}
