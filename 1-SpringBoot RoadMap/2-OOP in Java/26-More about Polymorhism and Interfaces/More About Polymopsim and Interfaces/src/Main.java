public class Main {
    public static void main(String[] args)
    {
        Shape A1 = new Rectangle(20,30);
        //Shape B1 = (Square)A1; Not Allowed
        A1.Display();
        A1.Display2();
        Triangle A = new Triangle();
        A.Display();
        Triangle C3 = new Triangle();
    }
}
