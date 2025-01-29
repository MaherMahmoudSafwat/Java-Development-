// Rectangle class extends Shape and provides its own implementation of draw() and display().
class Rectangle extends Shape {
    // Defining the dimensions of the rectangle
    int length, width;

    // Constructor to initialize the rectangle
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Overriding the draw() method from Shape class
    @Override
    void draw() {
        System.out.println("Drawing a rectangle with length " + length + " and width " + width);
    }

    // Overriding the display() method from Shape class
    @Override
    void display() {
        System.out.println("Displaying a rectangle with length " + length + " and width " + width);
    }
}