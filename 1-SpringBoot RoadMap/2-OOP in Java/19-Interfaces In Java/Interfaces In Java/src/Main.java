
// Main class to demonstrate how interfaces allow multiple inheritance, polymorphism, and method overriding
public class Main {
    public static void main(String[] args) {
        // Polymorphism: Shape reference can point to either Rectangle or Square object
        Shape myShape;

        // Creating a Rectangle object and using the Shape and Display interface methods
        myShape = new Rectangle(10, 5);
        myShape.draw();  // Calls Rectangle's draw method
        // Using Display interface method directly
        ((Display) myShape).display();  // Calls Rectangle's display method

        // Creating a Square object and using the Shape and Display interface methods
        myShape = new Square(4);
        myShape.draw();  // Calls Square's draw method
        // Using Display interface method directly
        ((Display) myShape).display();  // Calls Square's display method
    }
}
