// Interface Shape: Interfaces can contain abstract methods and variables (attributes).
interface Shape {
    // Attributes in interfaces are implicitly public, static, and final (constants).
    int DEFAULT_SIZE = 5;  // Default size attribute

    // Abstract method: Must be implemented by any class that implements this interface
    void draw();
}