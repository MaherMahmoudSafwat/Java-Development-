public class Rectangle
{
    private double Length = 0;
    private double Width = 0;
    
    public void setLength(double length) {
        Length = length;
    }
    public double getLength()
    {
        return Length;
    }
    public void setWidth(double width)
    {
        Width = width;
    }
    public double getWidth()
    {
        return Width;
    }
    public double getArea()
    {
        return Length * Width;
    }
}
