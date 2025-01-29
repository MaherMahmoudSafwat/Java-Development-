// Subclass: Rectangle (Inheriting from Shape)
class Rectangle extends Shape {
    // Additional fields specific to Rectangle
    double length;
    double width;

    // Constructor for Rectangle
    public Rectangle(double length, double width) {
        super();  // Call the constructor of the parent class Shape
        this.length = length;
        this.width = width;
        // Inheriting area from Shape class, but can be overridden
        calculateArea();
    }

    // Overriding the calculateArea method for Rectangle
    @Override
    public void calculateArea() {
        super.calculateArea(); // Calling parent class method (can be optional here, just to show usage)
        this.area = length * width; // Rectangle's area calculation
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }
}