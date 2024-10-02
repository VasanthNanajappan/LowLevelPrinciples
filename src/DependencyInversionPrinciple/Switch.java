package DependencyInversionPrinciple;

public class Switch {
    private Switchable device;

    public Switch(Switchable device){
        this.device=device;
    }

    public void flipSwitch(boolean on){
        if(on){
            device.turnOn();
        }else{
            device.tunrOff();
        }
    }
}
