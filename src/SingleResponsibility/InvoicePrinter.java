package SingleResponsibility;

public class InvoicePrinter {
    //it is only used for printing the invoice
    public void print(Invoice invoice){
        System.out.println("Your Invoice"+ " "+invoice.Calculation());
    }
}
