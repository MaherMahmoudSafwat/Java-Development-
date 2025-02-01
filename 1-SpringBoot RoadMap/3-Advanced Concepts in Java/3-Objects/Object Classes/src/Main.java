public class Main {
    public static void main(String[] args)
    {
        //Every Class created in java is inherited Automatically by a mother class Called Object.
        Rectangle R1 = new Rectangle(37);
        Rectangle R2 = new Rectangle(37);
        System.out.println(R1.toString());
        System.out.println(R1.equals(R2));//False
        System.out.println(R1.isEquals(R2));//True
        System.out.println(R1.hashCode());//Prints Hash Code.

        //You can use it as a dynamic variable at the RunTime.
        Object X=0;
        X=5;
        System.out.println(X);
        X=6.5f;
        System.out.println(X);
        X='A';
        System.out.println(X);
        X="String";
        System.out.println(X);
    }
}