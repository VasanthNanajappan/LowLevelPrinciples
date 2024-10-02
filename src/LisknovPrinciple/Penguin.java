package LisknovPrinciple;

public class Penguin extends Bird{
    public Penguin(String name,String species,double weight){
        super(name, species, weight);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" can able to eat");
    }
}
