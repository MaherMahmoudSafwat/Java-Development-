public class Main {
    public static void main(String[] args)
    {
<<<<<<< HEAD
        //To spilt an array of strings.
=======
         //To spilt an array of strings.
>>>>>>> 9d34f331c35c2155ae8c3ba8478f7fd716cf97bd
        String S1 = "C++ / C / JAVA / C# / PYTHON";
        String [] S2 = S1.split("/");
        for(String i : S2)
        {
            System.out.println(i);
        }
        //To join an array of Strings
<<<<<<< HEAD
        String S3 = String.join("/",S2);
=======
        String S3 = String.join(S2,"");
>>>>>>> 9d34f331c35c2155ae8c3ba8478f7fd716cf97bd
        System.out.println(S3);
        //There is a Character class and it has it is own methods
        Character A = 'A';
        System.out.println(Character.toLowerCase(A));
        //There is a String class and it has it is own Methods
        String B = "B";
        System.out.println(B.indexOf("B"));
        //There is a Integer cxlass and it has it is own methods
        Integer X = 51639;
<<<<<<< HEAD
        System.out.println(Integer.max(X,5));
        //Every Primitive data type has its own class and it is own method but you write the primitive data type completely and the first character of it is capital.
        System.out.println(Double.max(2,4));
=======
        System.out.println(Integer.max(X));
        //Every Primitive data type has its own class and it is own method but you write the primitve data type completely and the first charcter of it is capital.
        System.out.println(Double.max(123));
>>>>>>> 9d34f331c35c2155ae8c3ba8478f7fd716cf97bd
    }
}
