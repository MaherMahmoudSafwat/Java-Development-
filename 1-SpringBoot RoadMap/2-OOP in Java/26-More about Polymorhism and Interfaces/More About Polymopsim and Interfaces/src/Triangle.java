import java.lang.annotation.ElementType;

//The final is used to allow the class not to be extended by any other subclass but you can create an object from it.
@Display(Display1 = "Hi")
public final class Triangle
{
    public void Display()
    {
        System.out.println("This is a Triangle.");
    }
}
