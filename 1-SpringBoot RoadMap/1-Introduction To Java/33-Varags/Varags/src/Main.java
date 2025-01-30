public class Main {
    public static void ReadNumbers(int...n1)//Vararg is Array of parameters.
    {
        int length = n1.length;
        if(length > 0)
        {
            System.out.println(n1[0]);
        }
    }
    /* public static void ReadNumbers2(int...n2,String x1)
    {

    }*///Not allowed as Varargs must be at the end of the parameter lists.
    /*public static void ReadNumbers2(String X1, int...n1)
    {

    }*///Allowed
    public static void ReadNumbers2(String X1, int...n1)
    {
        System.out.println(X1);
        for(int x : n1)
        {
            System.out.println(x);
        }
    }
    public static void ReadNumbers3(int[]...X1)//Array of Arrays ---> Matrix
    {
        for(int i =0; i<X1.length;i++)
        {
            for(int j =0;j<X1[i].length;j++)
            {
                System.out.print(X1[i][j]);
            }
            System.out.println();
        }
    }
    public static void ReadNumbers4(int[]...X1)//Array of Arrays ---> Matrix
    {
        for(int a[] :X1)
        {
            for(int b : a)
            {
                System.out.print(b);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void  ReadNumbers5(int[][]...X1)
    {
        for(int a[][]:X1)
        {
            for(int b[]:a)
            {
                for(int c :b)
                {
                    System.out.print(c);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args)
    {
        System.out.println(args.length);
        ReadNumbers2("ABC");
        ReadNumbers2("ABC",1,2,3,4,5);
        int[] Arr1 = {1,2,3};
        int[] Arr2 = {4,5,6};
        int[][] Arr3 = {Arr1,Arr2};
        ReadNumbers3(Arr3);//Arr3[2][3]
        ReadNumbers4(Arr3);
        int [][] Arr4 = {{1,2,3},{4,5,6}};
        int [][] Arr5 = {{7,8,9},{10,11,12}};
        int [][][] Arr6 = {Arr4,Arr5};
        ReadNumbers5(Arr4,Arr5);
        ReadNumbers5(Arr6);
        int[][] Arr7 = new int[2][];
        Arr7[0] = new int[2];
        Arr7[0][0] = 7;
        Arr7[0][1] = 8;
        Arr7[1] = new int[3];
        Arr7[1][0] = 1;
        Arr7[1][1] = 2;
        Arr7[1][2] = 3;
        ReadNumbers5(Arr7);
    }
}