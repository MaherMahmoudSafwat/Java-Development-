
// Rectangle class implements both Shape and Display interfaces
class Rectangle implements Shape, Display {
    // Defining the dimensions of the rectangle
    int length, width;

    // Constructor to initialize the rectangle
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Implementing the draw() method from the Shape interface
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with length " + length + " and width " + width);
    }

    // Implementing the display() method from the Display interface
    @Override
    public void display() {
        System.out.println(DISPLAY_MESSAGE + "Rectangle with length " + length + " and width " + width);
    }
}
