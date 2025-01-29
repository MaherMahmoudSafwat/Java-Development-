public class Rectangle
{
    private double Length;
    private double Width;

    Rectangle(double length, double width)
    {
        Length = length;
        Width = width;
    }
    public void setLength(double length) {
        Length = length;
    }

    public double getLength() {
        return Length;
    }

    public void setWidth(double width) {
        Width = width;
    }

    public double getWidth() {
        return Width;
    }

    //Instead of using == Operator use a Method to Compare the Two Objects.
    public boolean IsEqual(Rectangle R1)
    {
        if(this.Length == R1.Length && this.Width == R1.Width)
            return true;
        else
            return false;
    }

    //Copy Constructor ---> Deep Copy
    public Rectangle (Rectangle SourceObject)
    {
        Length = SourceObject.Length;
        Width = SourceObject.Width;
    }
}
