// Main class to demonstrate polymorphism and method overriding
public class Main {
    public static void main(String[] args) {
        // Polymorphism: Shape reference can point to either Rectangle or Square object
        Shape myShape;

        // Creating a Rectangle object and using the Shape reference
        myShape = new Rectangle(10, 5);
        myShape.draw();  // Calls Rectangle's draw method (overriding Shape's draw method)
        myShape.display();  // Calls Rectangle's display method (overriding Shape's display method)

        // Creating a Square object and using the Shape reference
        myShape = new Square(4);
        myShape.draw();  // Calls Square's draw method (overriding Shape's draw method)
        myShape.display();  // Calls Square's display method (overriding Shape's display method)
    }
}