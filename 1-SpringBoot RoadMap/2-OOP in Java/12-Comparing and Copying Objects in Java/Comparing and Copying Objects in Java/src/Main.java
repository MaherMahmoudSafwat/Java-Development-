import org.w3c.dom.css.Rect;

public class Main {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle(10, 50);
        Rectangle R2 = new Rectangle(10, 50);

        //You can't use normal == Assignment Operator as both of R1 and R2 stores inside them Memory Address of the objects created in memory heap.
        /* if(R1 == R2)
        {
            System.out.println("Objects are the same");
        }
        else
        {
            System.out.println("Objects are different");
        }*/

        if (R1.IsEqual(R2)) {
            System.out.println("Objects are the Same.");
        } else {
            System.out.println("Objects are Different.");
        }

        //Reference Only Copy
        //If Use say that R1 = R2 this means that both of R1 and R2 stores the same memory address and points to the same memory object heap
        R1 = R2;
        if (R1 == R2)
        {
            System.out.println("Objects are the same.");
        }
        else
        {
            System.out.println("Objects are Different.");
        }
        R1.setLength(70);
        System.out.println(R2.getLength());//It will prints 70.0 because both of them points to the same memory address object heap in memory RAM.

        R2.setWidth(90);
        System.out.println(R1.getWidth());

        //Copy Constructor ---> Shallow Copy ---> Deep Copy
        Rectangle R3 = new Rectangle(R2);
        if(R2 == R3)
        {
            System.out.println("Objects are the same.");
        }
        else
        {
            System.out.println("Objects are Different.");
        }
        System.out.println(R3.getLength());
        System.out.println(R3.getWidth());
    }
}
