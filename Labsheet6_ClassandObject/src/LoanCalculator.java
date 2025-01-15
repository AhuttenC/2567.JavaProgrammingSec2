
public class LoanCalculator {
	
	private String productName;
	private double price;
	private double interestRate;
	private int years;
	
	public void setLoanDetails(String inputProductName, double inputPrice, double inputInterestRate, int inputYears){
		productName = inputProductName;
		price = inputPrice;
		interestRate = inputInterestRate;
		years = inputYears;
	}
	
	public double calculateMonthlyPayment() {
		int month = years*12;
		double interest = interestRate/100.0;
		do = interestRate/12;
		double simpleInterest = ( 1 + interest)
		return (productName * interest * ( 1 + ))
	}
	
}
