// Abstract class Shape: A class that cannot be instantiated directly but can be extended by other classes.
abstract class Shape {
    // Abstract method: Must be implemented by any subclass of Shape
    abstract void draw();

    // Regular method: This method can be inherited and used by subclasses.
    public void display() {
        System.out.println("Displaying the shape.");
    }
}