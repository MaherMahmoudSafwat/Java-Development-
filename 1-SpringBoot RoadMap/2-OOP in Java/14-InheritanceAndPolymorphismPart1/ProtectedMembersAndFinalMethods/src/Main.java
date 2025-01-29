// Main class to demonstrate Protected Members, Final Methods, and Polymorphism
public class Main {
    public static void main(String[] args) {
        // Create instances of Rectangle and Square
        Shape myShape = new Shape();  // Creating Shape object
        Rectangle myRectangle = new Rectangle(5, 10);  // Creating Rectangle object
        Square mySquare = new Square(5);  // Creating Square object

        // Polymorphism in action: Method is determined by the object type
        System.out.println("Shape Area: " + myShape.getArea());  // Calls method in Shape class (base class)
        System.out.println("Rectangle Area: " + myRectangle.getArea());  // Calls overridden method in Rectangle
        System.out.println("Square Area: " + mySquare.getArea());  // Calls overridden method in Square

        // Demonstrating the use of protected members
        System.out.println("Accessing protected 'area' directly in Rectangle: " + myRectangle.area);
        System.out.println("Accessing protected 'area' directly in Square: " + mySquare.area);

        // Testing final method behavior (final methods cannot be overridden)
        myRectangle.printDetails(); // Calls the final method from Rectangle
        // Uncommenting the code in AnotherRectangle to override the final method will cause a compile-time error.
        // AnotherRectangle myAnotherRectangle = new AnotherRectangle(3, 7);  // This would not work if overriding printDetails() was attempted
    }
}
