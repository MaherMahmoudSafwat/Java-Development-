// Base class Shape: A normal class (not interface), which can be extended by other classes.
class Shape {
    // Method in Shape class that can be overridden by subclasses
    void draw() {
        System.out.println("Drawing a shape");
    }

    // Another method that can be overridden by subclasses
    void display() {
        System.out.println("Displaying the shape");
    }
}