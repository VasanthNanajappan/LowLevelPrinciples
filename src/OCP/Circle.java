package OCP;

public class Circle implements Shape{
    public double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double areaCalculator() {
        return Math.PI*radius*radius;
    }
}
