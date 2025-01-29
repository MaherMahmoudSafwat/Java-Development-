
// Square class implements both Shape and Display interfaces
class Square implements Shape, Display {
    // Defining the side of the square
    int side;

    // Constructor to initialize the square
    Square(int side) {
        this.side = side;
    }

    // Implementing the draw() method from the Shape interface
    @Override
    public void draw() {
        System.out.println("Drawing a square with side " + side);
    }

    // Implementing the display() method from the Display interface
    @Override
    public void display() {
        System.out.println(DISPLAY_MESSAGE + "Square with side " + side);
    }
}