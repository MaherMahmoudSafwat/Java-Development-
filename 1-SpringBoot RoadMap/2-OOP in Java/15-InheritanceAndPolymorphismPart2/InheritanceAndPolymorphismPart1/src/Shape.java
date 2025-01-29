// Parent Class: Shape
class Shape {
    // This is a field that can be inherited by subclasses
    double area;

    // Constructor for Shape class
    public Shape() {
        this.area = 0.0;
    }

    // Method to calculate the area, meant to be overridden by subclasses
    public void calculateArea() {
        // Placeholder method for shape area calculation
        System.out.println("Area of shape is not defined.");
    }

    // Getter for the area
    public double getArea() {
        return area;
    }
}
