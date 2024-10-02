package LisknovPrinciple;

public class FlyingBird extends Bird{
    public FlyingBird(String name,String species,double weight){
        super(name, species, weight);
    }

    public void fly(){
        System.out.println(getName()+" "+"It can fly!");
    }
}
