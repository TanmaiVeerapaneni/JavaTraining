package fundamentals;

public class DominosBill {
	    public static void main(String[] args) {
	        double pizzaPrice = 399.0;
	        int quantity = 2;
	        double discountRate = 0.20;

	        // Calculate total before discount
	        double totalBeforeDiscount = pizzaPrice * quantity;

	        // Calculate discount amount
	        double discountAmount = totalBeforeDiscount * discountRate;

	        // Final bill after applying discount
	        double finalBill = totalBeforeDiscount - discountAmount;

	        System.out.println("Total before discount: ₹" + totalBeforeDiscount);
	        System.out.println("Discount @20%: ₹" + discountAmount);
	        System.out.println("Final Bill Amount: ₹" + finalBill);
	    }
	}

