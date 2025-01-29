// Main class to demonstrate Inheritance, Polymorphism, and the use of super
public class Main {
    public static void main(String[] args) {
        // Create instances of Rectangle and Square
        Shape myShape = new Shape();  // Creating Shape object
        Rectangle myRectangle = new Rectangle(5, 10);  // Creating Rectangle object
        Square mySquare = new Square(5);  // Creating Square object

        // Polymorphism in action: Method is determined by the object type
        System.out.println("Shape Area: " + myShape.getArea());  // Inherited method from Shape
        System.out.println("Rectangle Area: " + myRectangle.getArea());  // Overridden method in Rectangle
        System.out.println("Square Area: " + mySquare.getArea());  // Overridden method in Square

        // Demonstrating inheritance of common method
        myShape.calculateArea();  // Calls method in Shape class (base class)
        myRectangle.calculateArea();  // Calls overridden method in Rectangle subclass
        mySquare.calculateArea();  // Calls overridden method in Square subclass
    }
}