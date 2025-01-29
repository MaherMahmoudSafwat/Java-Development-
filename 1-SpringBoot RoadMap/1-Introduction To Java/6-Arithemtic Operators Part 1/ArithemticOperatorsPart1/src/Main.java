public class Main {
    public static void main(String[] args)
    {
        //Arithemtic Operators
        //Addition
        System.out.println(2+3);
        //Subtraction
        System.out.println(2-1);
        //Multiplication
        System.out.println(2*3);
        //Division
        System.out.println(10/5);
        //Modulus
        System.out.println(13%6);

        //------------------------------------------------------
        //Arithemtic Precedence.
        //1-Brackets.
        //2-Power.
        //3-Multiplication,Division And Modulus The first to come from left to right.
        //4-Addition And Subtraction The first to come from left to right.

        //2+(3+4)*3/3%3-Math.pow(2,2)
        //2+(3+4)*3/3%3-4
        //2+7*3/3%3-4
        //2+21/3%3-4
        //2+7%3-4
        //2+1-4
        //3-4
        //-1
        System.out.println(2+(3+4)*3/3%3-Math.pow(2,2));

        //------------------------------------------------------
        //5 and 2 are operands and Division sign / is operator where integer with integer give you and integer.
        System.out.println(5/2);
        //float with integer gives you float
        System.out.println(5.0f/2);
        //Double with integer gives you Double
        System.out.println(5.0/2);
        //Double with float with integer gives you Double
        System.out.println(5.0+5.2f+3);

        //------------------------------------------------------
        //Implicit Casting changing datatype to another data type but it is done by the compiler.
        int x = 5;
        double y = x;
        System.out.println(y);
        int z = 6;
        //short u = z;Error not Allowed as in implicit casting you can't change from big data type and change it and store it to a small data type
        float M = 6.567f;
        //z=M; Error not allowed as data type integer will not print the decimal parts of M.
        //if you really want to change these kinds of data types forcefully you can it manually by using Explicit Casting.
        //Explicit Casting.
        z = (int)M;
        System.out.println(z);
        System.out.println((double)z);
    }
}