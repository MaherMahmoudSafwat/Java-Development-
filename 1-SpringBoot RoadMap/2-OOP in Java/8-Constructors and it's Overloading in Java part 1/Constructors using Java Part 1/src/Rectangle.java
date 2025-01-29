public class Rectangle
{
    private double Length;
    private double Width;

    // Constructor - Special method to initialize objects
    // A constructor is called when an object of a class is created.
    // It has the same name as the class and does not have a return type, not even 'void'.
    //Constructors Overloading
    //Default Constructor
    public Rectangle()
    {
        // Constructor body can contain any initialization code.
        // This constructor will initialize the object with default values or specified values.
        Length=15;
        Width=10;
        System.out.println("Length is " + Length + " and Width is " + Width);
    }

    //Parameterized Constructor
    public Rectangle(double length, double width)
    {
        Length = length;
        Width = width;
    }

    // Normal method - A normal method has a return type (like void, int, etc.)
    // and is used to define behavior or functionality of the class objects.
    public void setLength(double length) {
        Length = length;
    }

    public void setWidth(double width) {
        Width = width;
    }

    public double getLength() {
        return Length;
    }

    public double getWidth() {
        return Width;
    }
}
