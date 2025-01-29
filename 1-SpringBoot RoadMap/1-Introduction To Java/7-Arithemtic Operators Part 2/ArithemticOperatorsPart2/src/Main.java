public class Main {
    public static void main(String[] args) {
        //Post Increment i++
        //Pre Increment ++i
        int i=9,j=2;
        //Since both i++ and j++ are in single lines they both are the same
        i++;
        ++j;
        System.out.println(i);//10
        System.out.println(j);//3
        //Post Increment
        System.out.println(i++);//10
        System.out.println(i);//11
        //Pre Increment
        System.out.println(++j);//4
        System.out.println(j);//4

        //---------------------
        System.out.println(++j+4/2);//7
        System.out.println(++j/2.0);//++j has precedence more than multiplication and division
        //j = 6
        //j+++j+5
        //6+7+5 = 18
        System.out.println(j+++j+5);//18
        System.out.println(++j+j+5);//21
        //j+++++j is not allowed n java.
        System.out.println(j+++(++j)+5);//23 as j++ = 8 and ++j since j is now 9 ++j makes it now 10 so 8+10+5 is equals 23

        //Everything we said about post increment and pre-increment applied to post decrement and pre-decrement
        //Post Decrement i--
        //Pre Decrement --i
        int y = 5, g=8;
        y--;
        --g;
        System.out.println(y);
        System.out.println(g);

        //===============================
        //Compact Operators
        int C = 9;
        C+=10; //means C = C + 10;
        System.out.println(C);
        C-=10; //means C = C - 10;
        System.out.println(C);
        C/=10; //means C = C / 10;
        System.out.println((double)C);
        C*=10; //means C = C * 10;
        System.out.println((double)C);
        C%=10; //means C = C % 10;
        System.out.println(C);
    }
}