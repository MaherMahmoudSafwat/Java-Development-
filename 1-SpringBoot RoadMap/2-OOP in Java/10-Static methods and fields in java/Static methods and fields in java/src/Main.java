public class Main {
    public static void main(String[] args)
    {
        Rectangle R1 = new Rectangle();//No. of objects is incremented by 1 and now is equals to 1
        System.out.println(R1.getNo_Of_Objects());
        Rectangle R2 = new Rectangle();//No. of objects is incremented by 1 and now is equals to 2
        Rectangle R3 = new Rectangle();//No. of objects is incremented by 1 and now is equals to 3
        System.out.println(R3.getNo_Of_Objects());

        System.out.println(Rectangle.getNo_Of_Objects());
    }
}