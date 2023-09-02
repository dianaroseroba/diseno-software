package invoiceItemProject;

public class MainInvoiceItem {

    public static void main(String[] args) {
       
        InvoiceItem invoiceItem1 = new InvoiceItem("01", "Lunch", 3, 0, 8000); 
        System.out.println(invoiceItem1);
        System.out.println("Total de la factura es: " + invoiceItem1.getTotal());
    }
}
