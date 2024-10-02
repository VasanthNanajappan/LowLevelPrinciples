package InterfaceSegregationPrinciple;

public class Human implements workable, eating {

    @Override
    public void eat() {
        System.out.println("I can eat!!");
    }

    @Override
    public void work() {
        System.out.println("I can able to work!");
    }
}
