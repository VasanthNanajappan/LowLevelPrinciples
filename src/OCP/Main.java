package OCP;

public class Main {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(25,15);
        System.out.println(r.areaCalculator());

        Square s=new Square(2);
        System.out.println(s.areaCalculator());

        Circle c=new Circle(7);
        System.out.println(c.areaCalculator());
    }
}
