public class Main {
    public static void main(String[] args)
    {
        Rectangle R1 = new Rectangle(10,20);
        double RoomLength = 37;
        //Pass by value.
        R1.ModifyLengthOfThRectangle(RoomLength);//length = RoomLength as you only a copy of the value of the variable of RoomLength
        System.out.println(RoomLength);
        //Pass by value is applied only in primitive data types such as integer, double, boolean and etc.
        // Pass-by-value of the reference
        R1.ModifyObjectOfTheRectangle(R1); // 'R1' and the parameter inside the method both point to the same object (same memory address).
        // Both 'R1' and the parameter inside the method reference the same object, so modifications affect the same object.
        // Rectangle1 (R1) Address Variable  -> Points to the same memory address as the parameter inside the method.
        System.out.println(R1.getWidth());

        Rectangle R2 = new Rectangle(10,20);
        Rectangle R3 = new Rectangle(10,20);
        //Rectangle R4 = new Rectangle();
        //First Method to Store and Print Objects Variables.
        //Rectangle R5 = new Rectangle();
        //R5 = R5.AddTwoObjects(R2,R3);
        //System.out.println(R5.getLength());
        //System.out.println(R5.getWidth());
        //Second Method to Store and Print Objects Variables.
        /* R4 = R3.AddTwoObjects(R2);
        System.out.println(R4.getLength());
        System.out.println(R4.getWidth());*/
        //Third Method To Store and Print Objects Variables.
        //R3 = R3.AddTwoObjects(R2);
        //Fourth Method To Store and Print Object Variables.
        System.out.println(R3.AddTwoObjects(R2).getLength());
        System.out.println(R3.AddTwoObjects(R2).getWidth());
    }
}
