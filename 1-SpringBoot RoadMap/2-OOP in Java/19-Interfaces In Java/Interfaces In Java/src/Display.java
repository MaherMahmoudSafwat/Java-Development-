// Another Interface Display: A separate interface to display information about the shape.
interface Display {
    // Attributes in interfaces are implicitly public, static, and final (constants).
    String DISPLAY_MESSAGE = "Shape details: "; // A display message constant

    // Abstract method to display the shape
    void display();
}