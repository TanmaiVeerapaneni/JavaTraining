package fundamentals;

public class JioFibre {
	    public static void main(String[] args) {
	        double basePrice = 699.00;
	        double gstRate = 0.18;

	        // Calculate GST amount
	        double gstAmount = basePrice * gstRate;

	        // Calculate total cost
	        double totalCost = basePrice + gstAmount;

	        System.out.println("JioFiber Silver Plan (Base Price): ₹" + basePrice);
	        System.out.println("GST @18%: ₹" + gstAmount);
	        System.out.println("Total Plan Cost: ₹" + totalCost);
	    }
	}
