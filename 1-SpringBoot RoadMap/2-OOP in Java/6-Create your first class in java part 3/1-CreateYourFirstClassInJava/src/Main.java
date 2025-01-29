public class Main
{
    public static void main(String[] args)
    {
        /*
        R1 is a variable created from by the class Rectangle and it's memory address points the object created in
        the heap of datatype rectangle
        */
        Rectangle R1 = new Rectangle();
        R1.setLength(5);
        R1.setWidth(4);
        System.out.println("The area of R1 is :- " + R1.getArea());

        Rectangle R2 = new Rectangle();
        R2.setLength(7);
        R2.setWidth(8);
        System.out.println("The area of R2 is :- " + R2.getArea());

    }
}