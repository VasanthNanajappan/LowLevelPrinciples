package SingleResponsibility;

public class Invoice {
    //It is used only for Calculating the amount
    private double amount;

    public Invoice(double amount){
        this.amount=amount;
    }

    public double Calculation(){
        return amount*1.2;
    }

    public double getAmount(){
        return amount;
    }

}
