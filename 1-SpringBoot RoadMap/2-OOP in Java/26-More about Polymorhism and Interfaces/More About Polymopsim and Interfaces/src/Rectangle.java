public class Rectangle implements Shape
{
    public int Length=0;
    public int Width=0;
    public int Area = 0;
    Rectangle(int Area)
    {
        this.Area = Area;
    }
    Rectangle(int Length,int Width)
    {
        //The this here is used to call the another constructor in the same class.
        this(Length*Width);
        this.Length=Length;
        this.Width=Width;
    }
    public void Display()
    {
        System.out.println(Area);
    }
    public void Display2()
    {
        System.out.println("This is a Rectangle.");
    }
}
