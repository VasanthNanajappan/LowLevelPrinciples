package LisknovPrinciple;

public class Main {
    public static void main(String[] args) {
        FlyingBird sparrow=new Sparrow("Sparrow","smallbird",2);
        Bird penguin=new Penguin("Penguin","cold",3);

        sparrow.fly();
        penguin.eat();
    }
}
