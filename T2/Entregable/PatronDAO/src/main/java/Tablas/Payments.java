package Tablas;

public class Payments {
	private final int customerNumber;
	private final String checkNumber;
	private final String date;
	private final double amount;
	
	
	public Payments(int customerNumber, String checkNumber, String date, double amount) {
		super();
		this.customerNumber = customerNumber;
		this.checkNumber = checkNumber;
		this.date = date;
		this.amount = amount;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public String getCheckNumber() {
		return checkNumber;
	}
	public String getDate() {
		return date;
	}
	public double getAmount() {
		return amount;
	}
	@Override
	public String toString() {
		return "Payments [customerNumber=" + customerNumber + ", checkNumber=" + checkNumber + ", date=" + date
				+ ", amount=" + amount + "]";
	}
	
	
}
