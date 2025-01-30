public interface Shape
{
    public void Display();
    //default can be used to allow interface to have a body as a default
    default void Display2()
    {
        System.out.println("ABC");
    };
}
