
// Square class extends Shape directly and provides its own implementation for draw() and display().
class Square extends Shape {
    // Defining the side of the square
    int side;

    // Constructor to initialize the square
    Square(int side) {
        this.side = side;
    }

    // Overriding the draw() method to give specific implementation for Square
    @Override
    void draw() {
        System.out.println("Drawing a square with side " + side);
    }

    // Overriding the display() method (again showing usage of super)
    @Override
    public void display() {
        super.display();  // Calling Shape's display method
        System.out.println("This is a square.");
    }
}
