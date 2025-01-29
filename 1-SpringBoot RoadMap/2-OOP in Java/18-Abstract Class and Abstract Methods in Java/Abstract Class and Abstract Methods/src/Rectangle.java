
// Rectangle class extends Shape and provides implementation for the abstract method draw().
class Rectangle extends Shape {
    // Defining the dimensions of the rectangle
    int length, width;

    // Constructor to initialize the rectangle
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Overriding the draw() method from the Shape class
    @Override
    void draw() {
        System.out.println("Drawing a rectangle with length " + length + " and width " + width);
    }

    // Overriding the display() method (optional but showing usage of super)
    @Override
    public void display() {
        // Calling the display method of the superclass (Shape) using super
        super.display();
        System.out.println("This is a rectangle.");
    }
}
