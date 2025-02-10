
public class Main {
    public static void ValidateNumber(int Number)//throws Exception is optionally because RuntimeException unlike Exception Class is Unchecked.
    {
        if(Number < 0)
        {
            MyException ME = new MyException("Number less than Zero");
            throw ME;
        }
        System.out.println("ABC");
    }
    public static void main(String[] args)
    {
        try {
            ValidateNumber(-1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Rest of Code");
    }
}