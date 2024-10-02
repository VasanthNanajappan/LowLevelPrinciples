package DependencyInversionPrinciple;

public class Main {
    public static void main(String[] args) {
        Switchable lightBulb=new LightBulb();
        Switch lightSwitch=new Switch(lightBulb);

        lightSwitch.flipSwitch(true);

        Switchable fan=new Fan();
        Switch fanSwitch=new Switch(fan);

        fanSwitch.flipSwitch(false);
    }
}
