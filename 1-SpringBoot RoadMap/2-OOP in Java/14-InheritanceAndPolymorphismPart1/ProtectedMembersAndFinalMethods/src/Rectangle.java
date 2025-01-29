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
        calculateArea();  // Calculate area on instantiation
    }

    // Overriding the calculateArea method for Rectangle
    @Override
    protected void calculateArea() {
        super.calculateArea(); // Optionally call the parent class method
        this.area = length * width;  // Rectangle's area calculation
    }

    // A final method that cannot be overridden by any subclass
    public final void printDetails() {
        System.out.println("This is a rectangle with length " + length + " and width " + width);
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
