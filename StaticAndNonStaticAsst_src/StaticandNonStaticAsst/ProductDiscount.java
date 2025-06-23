package StaticandNonStaticAsst;

public class ProductDiscount {
	    // Instance variables
	    int id;
	    String name;
	    double price;

	    // Constructor to initialize the productDiscount
	    public ProductDiscount(int id, String name, double price) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	    }

	    // Method to calculate and print discounted price
	    public void calculateDiscount(double discountPercent) {
	        // Local variable to hold discount amount
	        double discountAmount = (price * discountPercent) / 100;

	        // Local variable to hold final discounted price
	        double discountedPrice = price - discountAmount;

	        // Display the discounted price
	        System.out.println("Original Price: $" + price);
	        System.out.println("Discount: " + discountPercent + "%");
	        System.out.println("Discounted Price: $" + discountedPrice);
	        System.out.println("--------------------------");
	    }

	    // Method to display product details
	    public void displayProduct() {
	        System.out.println("Product ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Price: $" + price);
	    }

	    // Main method to test the class
	    public static void main(String[] args) {
	        // Create a product
	        ProductDiscount p1 = new ProductDiscount(101, "Smartphone", 799.99);

	        // Display product info
	        p1.displayProduct();

	        // Calculate and display discount
	        p1.calculateDiscount(15.0);  // 15% discount
	    }
}
