// Subclass: Square (Inheriting from Shape)
class Square extends Shape {
    // Additional field specific to Square
    double sideLength;

    // Constructor for Square, taking one side length as argument
    public Square(double sideLength) {
        super();  // Call the constructor of the parent class Shape
        this.sideLength = sideLength;
        // Inheriting area from Shape class, but can be overridden
        calculateArea();
    }

    // Overriding the calculateArea method for Square
    @Override
    public void calculateArea() {
        super.calculateArea(); // Calling parent class method (can be optional here, just to show usage)
        this.area = sideLength * sideLength; // Square's area calculation
    }

    // Getter for side length
    public double getSideLength() {
        return sideLength;
    }
}