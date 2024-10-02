package DependencyInversionPrinciple;

public class LightBulb implements Switchable{

    @Override
    public void turnOn() {
        System.out.println("Light Bulb is turned On!!");
    }

    @Override
    public void tunrOff() {
        System.out.println("Light Bulb is turned Off!!");
    }
}
