public class GeometryCalculator {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Circle: Area = " + circle.calculateArea() + ", Perimeter = " + circle.calculatePerimeter());
        System.out.println("Rectangle: Area = " + rectangle.calculateArea() + ", Perimeter = " + rectangle.calculatePerimeter());
        System.out.println("Triangle: Area = " + triangle.calculateArea() + ", Perimeter = " + triangle.calculatePerimeter());
    }
}