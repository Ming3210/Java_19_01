package B4;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
