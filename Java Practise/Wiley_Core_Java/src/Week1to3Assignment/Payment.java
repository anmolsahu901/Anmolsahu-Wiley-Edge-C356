package Week1to3Assignment;

public class Payment {
	private Bill bill;
	private String cardDetails;
	public Payment(Bill bill) {
		this.bill=bill;
	}
	public void displayBill() {
		bill.display();
	}
	public void payBill(String cardDetails) {
		this.cardDetails = cardDetails;
		bill.pay(cardDetails);
	}

}
