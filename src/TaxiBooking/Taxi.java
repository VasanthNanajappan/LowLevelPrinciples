package TaxiBooking;

public class Taxi implements Cloneable {
    private char currentLocation='A';
    private int customerId;
    private int taxiId;
    private char pickUpLocation;
    private char dropLocation;
    private char currentLoaction;
    private int pickUpTime;
    private int dropTime;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public char getCurrentLocation(){
        return currentLocation;
    }

    public int getCustomerId(){
        return customerId;
    }

    public void setCustomerId(int customerId){
        this.customerId=customerId;
    }

    public int getTaxiId(){
        return taxiId;
    }

    public void setTaxiId(int taxiId) {
        this.taxiId = taxiId;
    }

    public int getPickUpLocation(){
        return pickUpLocation;
    }

    public void setPickUpLocation(char pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public int getDropLocation(){
        return dropLocation;
    }

    public void setDropLocation(char dropLocation) {
        this.dropLocation = dropLocation;
    }

    public char getCurrentLoaction() {
        return currentLoaction;
    }

    public void setCurrentLocation(char currentLocation){
        this.currentLoaction=currentLocation;
    }

    public int getPickUpTime(){
        return pickUpTime;
    }

    public void setPickUpTime(int pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public int getDropTime(){
        return dropTime;
    }

    public void setDropTime(int dropTime) {
        this.dropTime = dropTime;
    }

    @Override
    public String toString(){
        return "Taxi "+getTaxiId()+"\nCurrent Location="+currentLoaction+",\nCustomer Id="+customerId+", \nPickup Location="+pickUpLocation+",\nDrop Location"+dropLocation+",\nPickup Time="+pickUpTime+",\nDrop Time="+dropTime+" ";
    }
}
