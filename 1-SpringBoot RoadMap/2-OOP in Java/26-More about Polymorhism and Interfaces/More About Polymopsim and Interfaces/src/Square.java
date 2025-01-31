public class Square implements Shape
{
    int Length;
    Square(int Length)
    {
        this.Length = Length;
    }
    public void Display()
    {
        System.out.println(Length*Length);
    }
}
