// Parent Class: Shape
class Shape {
    // Protected member variable: Accessible within the class, subclass, and same package but can't create an object from it in main class
    protected double area;

    // Constructor for Shape class
    public Shape() {
        this.area = 0.0;
    }

    // Protected method: Can be overridden by subclasses, accessible within the class, subclass, and same package
    protected void calculateArea() {
        System.out.println("Area of shape is not defined.");
    }

    // Getter for the area
    public double getArea() {
        return area;
    }
}
