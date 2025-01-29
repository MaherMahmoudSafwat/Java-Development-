
// Main class to test polymorphism, method overriding, and the use of super and abstract methods
public class Main {
    public static void main(String[] args) {
        // Polymorphism: Shape reference can point to either Rectangle or Square object
        Shape myShape;

        // Creating a Rectangle object
        myShape = new Rectangle(10, 5);
        myShape.draw();  // Calls Rectangle's draw method
        myShape.display();  // Calls Rectangle's display method

        // Creating a Square object
        myShape = new Square(4);
        myShape.draw();  // Calls Square's draw method
        myShape.display();  // Calls Square's display method
    }
}