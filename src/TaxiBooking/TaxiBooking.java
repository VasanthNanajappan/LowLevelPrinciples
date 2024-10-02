package TaxiBooking;

import java.util.ArrayList;

public class TaxiBooking {
    private static ArrayList<Taxi> taxiList=new ArrayList<Taxi>();
    //Generating taxiLimit and Id
    private static int taxiLimit=4,idGenerator=1;
    private static ArrayList<Taxi> taxiBookedHistory=new ArrayList<Taxi>();

    public static String booking(char PickupLocation,char DropLocation,int PickupTime) throws CloneNotSupportedException{

        //if all the taxi is not reserved or booked we need to create a new object and add in the list!
        if(taxiList.size()<taxiLimit){
            taxiList.add(new Taxi());
        }

        int min=Integer.MAX_VALUE;
        Taxi taxiReady=null;

        for(Taxi t:taxiList){
            //dropTime is lesser than PickUptime
            if(t.getDropTime()<=PickupTime && Math.abs(PickupLocation-t.getCurrentLocation())<min){
                //assigning the created object in taxiList to the object we created!
                taxiReady=t;
                min=Math.abs(PickupLocation-t.getCurrentLocation());
            }
        }

        if(taxiReady!=null){
            taxiReady.setCustomerId(idGenerator++);
            taxiReady.setPickUpTime(PickupTime);
            taxiReady.setPickUpLocation(PickupLocation);
            taxiReady.setDropLocation(DropLocation);
            taxiReady.setCurrentLocation(DropLocation);
            taxiReady.setDropTime(PickupTime+Math.abs(DropLocation-PickupLocation));
            taxiReady.setTaxiId(taxiList.indexOf(taxiReady)+1); //index+1 is the taxi id in the list
            taxiBookedHistory.add((Taxi)taxiReady.clone());//we are cloning the object here because,the object's value changes dynamically! and use type casting to change into older object
        }

        return taxiReady!=null?"Taxi Number"+taxiReady.getTaxiId()+"is booked!":"Taxi is not available!";
    }

    public static void display(){
        System.out.println("--------------");
        for(Taxi t:taxiBookedHistory){
            System.out.println(t.toString());
            System.out.println("--------------");
        }
    }
}
