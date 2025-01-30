public class Main {
    public static void main(String[] args)
    {
        Cat C1 = new Cat();//Static Anonymous Block Bracket is called only one time.
        Cat C2 = new Cat();

        //int X = null; Not Allowed because we use null only with a reference DataTypes only.
        C2.m((String)null);//You can use type casting if the function doesn't know what who takes null.
    }
}