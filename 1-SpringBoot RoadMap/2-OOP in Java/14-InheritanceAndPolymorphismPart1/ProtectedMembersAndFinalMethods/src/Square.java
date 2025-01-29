// Subclass: Square (Inheriting from Shape)
class Square extends Shape {
    // Additional field specific to Square
    double sideLength;

    // Constructor for Square, taking one side length as argument
    public Square(double sideLength) {
        super();  // Call the constructor of the parent class Shape
        this.sideLength = sideLength;
        calculateArea();  // Calculate area on instantiation
    }

    // Overriding the calculateArea method for Square
    @Override
    protected void calculateArea() {
        super.calculateArea(); // Optionally call the parent class method
        this.area = sideLength * sideLength;  // Square's area calculation
    }

    // Getter for side length
    public double getSideLength() {
        return sideLength;
    }
}