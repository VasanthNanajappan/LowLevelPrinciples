package LisknovPrinciple;

public class Sparrow extends FlyingBird{
    public Sparrow(String name,String species,double weight){
        super(name, species, weight);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow can fly!");
    }
}
