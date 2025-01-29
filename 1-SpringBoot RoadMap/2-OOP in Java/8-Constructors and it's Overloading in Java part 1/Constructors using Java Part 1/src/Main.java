public class Main {
    public static void main(String[] args)
    {
        //Constructor is called automatically the first thing once you create an object from the class
        Rectangle R1 = new Rectangle();
        Rectangle R2 = new Rectangle(13,19);
        System.out.println("Length is " + R2.getLength());
        System.out.println("Width is " + R2.getWidth());

        //In case you haven't created any constructor you will have a default constructor created by java.
        //Where the default constructor created by java will have all numeric values default set to zero.
        //Default constructor created by java will have all boolean values as a default value set to false.
        //The default constructor created by java will set all objects references variables to special value null like ----->
        //class object or strings
        /*
        Rectangle R3 = new Rectangle();
        System.out.println(R3.getLength());
        System.out.println(R3.getWidth());
        */
    }
}
