package OCP;

public class Rectangle implements Shape{

    public double width;
    public double height;

    Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }


    @Override
    public double areaCalculator() {
        return width*height;
    }
}
