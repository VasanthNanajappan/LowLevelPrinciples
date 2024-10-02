package OCP;

public class Square implements Shape {
    public double side;

    Square(double side){
        this.side=side;
    }

    @Override
    public double areaCalculator() {
        return side*side;
    }
}
