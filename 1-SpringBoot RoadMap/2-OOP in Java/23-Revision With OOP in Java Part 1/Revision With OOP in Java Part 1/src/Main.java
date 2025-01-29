import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store Shape objects
        ArrayList<Shape> shapes = new ArrayList<>();

        // Add objects of different classes (Rectangle and Square) to the ArrayList
        shapes.add(new Rectangle(10, 5));
        shapes.add(new Square(4));
        shapes.add(new Rectangle(6, 3));
        shapes.add(new Square(7));

        // Loop through the ArrayList and use instanceOf to check the type of each object
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                // Type casting: Casting to Rectangle to access Rectangle specific methods
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("This is a rectangle:");
                rectangle.draw();
                System.out.println("Area of rectangle: " + (rectangle.length * rectangle.width));
            } else if (shape instanceof Square) {
                // Type casting: Casting to Square to access Square specific methods
                Square square = (Square) shape;
                System.out.println("This is a square:");
                square.draw();
                System.out.println("Area of square: " + (square.side * square.side));
            } else {
                System.out.println("Unknown shape type");
            }
        }
    }
}