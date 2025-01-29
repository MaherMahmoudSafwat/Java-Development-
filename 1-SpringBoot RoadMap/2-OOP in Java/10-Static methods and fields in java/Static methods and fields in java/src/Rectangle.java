public class Rectangle
{
    private double length;
    private double width;
    //Static Field
    // Static variable: This variable is shared by all instances (objects) of the class.
    // It belongs to the class itself, not to any specific instance of the class.
    // It can be accessed without creating an object of the class.
    private static int No_Of_Objects = 0;

    // Instance method: This method belongs to an object (instance) of the class.
    // It can access both instance variables and static variables.
    Rectangle()
    {
        No_Of_Objects++;//Modify the static variable.
    }

    public void setLength(double length) {
        // Instance variable: This variable belongs to an instance of the class.
        this.length = length;
        //No_Of_Objects++;This allowed as non static methods can access static fields or static methods. 
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea()
    {
        return length * width;
    }

    //Static method
    // Static method: This method is also associated with the class, not instances.
    // It can be called without creating an object of the class.
    // A static method can only access static variables and other static methods.
    public static int getNo_Of_Objects() {
        return No_Of_Objects;
        //instance fields
        //length = 5; Not allowed as Static methods may not communicate with instance fields, only static fields.
    }
    //You can in non static method access a static field or static instance but you can't access instance fields or instance methods from static method
}
