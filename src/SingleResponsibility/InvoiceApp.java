package SingleResponsibility;

public class InvoiceApp {
    public static void main(String[] args){
        Invoice invoice=new Invoice(1200);
        InvoicePrinter ip=new InvoicePrinter();

        ip.print(invoice);
    }
}
