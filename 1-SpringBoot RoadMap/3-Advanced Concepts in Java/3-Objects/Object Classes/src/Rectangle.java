public class Rectangle
{
    int Area = 0;
    Rectangle(int Area)
    {
        this.Area = Area;
    }

    public void setArea(int area) {
        Area = area;
    }

    public int getArea() {
        return Area;
    }

    @Override
    public String toString()
    {
        return "Rectangle" + " " + Area;
    }
    public boolean isEquals(Rectangle R1)
    {
        return this.Area==R1.Area;
    }
}
