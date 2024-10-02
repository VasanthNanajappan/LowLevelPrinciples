package DependencyInversionPrinciple;

public class Fan implements Switchable{

    @Override
    public void turnOn() {
        System.out.println("Fan is Turned On!!");
    }

    @Override
    public void tunrOff() {
        System.out.println("Fan is Turned Off!!");
    }
}
