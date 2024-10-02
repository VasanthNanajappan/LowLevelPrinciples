package LisknovPrinciple;

public class Bird {
    private String name;
    private String species;
    private double weight;

   public Bird(String name,String species, double weight){
        this.name=name;
        this.species=species;
        this.weight=weight;
    }

    public void eat(){
       System.out.println("The bird is Eating!");
    }

    public void layEggs(){
        System.out.println(name+"It can lay eggs!");
    }

    public String getName(){
       return name;
    }

    public String getSpecies(){
       return species;
    }

    public double getWeight(){
       return weight;
    }


}
