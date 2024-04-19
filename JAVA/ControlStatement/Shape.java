// Abstract class
abstract class Shape {
    // Abstract method (no implementation)
    public abstract double area();

    // Concrete method
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass Circle
class Circle extends Shape {
    double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
