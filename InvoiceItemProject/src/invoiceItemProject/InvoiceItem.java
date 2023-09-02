package invoiceItemProject;

public class InvoiceItem {
	private String id;
	private String description;
	private int quantity;
	private double unitPrice;
	
	//constructor
	public InvoiceItem (String id, String description, int quantity, int unitprice, double unitPrice) {
		this.id=id;
		this.description=description;
		this.quantity=quantity;
		this.unitPrice=unitPrice;

	}
	//calculando el mètodo total 
	
	public double getTotal() {
        return this.unitPrice * this.quantity;
    }
	
	@Override
	public String toString() {
		return "InvoiceItem [id=" + id + ", description" + description + ", quantity=" + quantity + ", unitPrice=" + unitPrice + "]";
	}

	}
	
	
	
	
