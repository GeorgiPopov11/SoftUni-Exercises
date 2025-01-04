package Polymorphism.Shapes;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5, 10);

        System.out.println(circle.calculatePerimeter());
        System.out.println(circle.calculateArea());

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
    }
}
