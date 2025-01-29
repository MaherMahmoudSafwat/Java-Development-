import org.w3c.dom.css.Rect;

public class Rectangle
{
    private double length;
    private double width;

    Rectangle()
    {}
    Rectangle(double length, double width)
    {
        this.length=length;
        this.width=width;
    }

    public void ModifyLengthOfThRectangle(double length)
    {
        length = 56;
    }

    public void ModifyObjectOfTheRectangle(Rectangle Rectangle1)
    {
        Rectangle1.width = 90;
    }

   //Not the best way of code.
   /* public Rectangle AddTwoObjects (Rectangle R1, Rectangle R2)
    {
        Rectangle Result = new Rectangle();
        Result.length = R1.length + R2.length;
        Result.width = R1.width + R2.width;
        return Result;
    }*/

    public Rectangle AddTwoObjects(Rectangle R)
    {
        Rectangle Result = new Rectangle();
        Result.length = this.length + R.length;
        Result.width = this.width + R.width;
        return Result;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getArea()
    {
        return length * width;
    }
}
