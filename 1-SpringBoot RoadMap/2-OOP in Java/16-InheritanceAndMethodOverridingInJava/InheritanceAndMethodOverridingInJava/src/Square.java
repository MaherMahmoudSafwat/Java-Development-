// Square class extends Shape and provides its own implementation of draw() and display().
class Square extends Shape {
    // Defining the side of the square
    int side;

    // Constructor to initialize the square
    Square(int side) {
        this.side = side;
    }

    // Overriding the draw() method from Shape class
    @Override
    void draw() {
        System.out.println("Drawing a square with side " + side);
    }

    // Overriding the display() method from Shape class
    @Override
    void display() {
        System.out.println("Displaying a square with side " + side);
    }
}