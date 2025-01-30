import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to hold objects of Shape type
        ArrayList<Shape> shapes = new ArrayList<>();
        
        // Adding different types of Shape objects (Square, Rectangle) to the list
        shapes.add(new Square());     // Adding Square object
        shapes.add(new Rectangle());  // Adding Rectangle object
        
        // Iterating through the list of shapes
        for (Shape shape : shapes) {
            // Using instanceOf to check the type of each object
            if (shape instanceof Square) {
                // Casting Shape to Square
                Square square = (Square) shape;
                System.out.println("This is a Square");
            } else if (shape instanceof Rectangle) {
                // Casting Shape to Rectangle
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("This is a Rectangle");
            }
        }
    }
}
