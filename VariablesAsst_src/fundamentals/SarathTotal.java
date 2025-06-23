package fundamentals;

public class SarathTotal {
	public static void main(String[] args) {
	        double depositedAmount = 500000.0;
	        int years = 5;
	        double rateOfInterest = 6.8;

	        // Calculate interest
	        double interest = (depositedAmount * years * rateOfInterest) / 100;

	        // Calculate final amount
	        double finalAmount = depositedAmount + interest;

	        System.out.println("Deposited Amount: ₹" + depositedAmount);
	        System.out.println("Interest Amount: ₹" + interest);
	        System.out.println("Final Amount after " + years + " years: ₹" + finalAmount);
	    }
	}

