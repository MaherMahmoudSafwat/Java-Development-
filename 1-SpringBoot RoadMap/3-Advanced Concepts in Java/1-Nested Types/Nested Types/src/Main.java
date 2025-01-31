public class Main {
    public static void main(String[] args)
    {
        Car C = new Car();
        //Car.Engine1 Z = new Car.Engine1();Not Allowed for a nonstatic inner class.
        Car.Engine1 Y = C.new Engine1();
        Y.Run();
        Y.Run();
        Y.Run();
        System.out.println(C.getX());
        Car Z = new Car();
        System.out.println(Z.getX());
        Car.Engine2 S= new Car.Engine2();//This is allowed because Engine2 is a static class 
    }
}