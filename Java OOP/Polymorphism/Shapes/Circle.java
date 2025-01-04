package Polymorphism.Shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculatePerimeter() {
        return Math.PI * Math.PI * radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
