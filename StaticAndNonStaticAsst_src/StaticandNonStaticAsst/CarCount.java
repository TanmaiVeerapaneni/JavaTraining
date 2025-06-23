package StaticandNonStaticAsst;

public class CarCount {
	    // Instance variables
	    String model;
	    double price;

	    // Static variable to count the number of Car objects created
	    static int carCount = 0;

	    // Constructor to initialize model and price
	    public CarCount(String model, double price) {
	        this.model = model;
	        this.price = price;
	        carCount++;  // Increment count when a new car is created
	    }

	    // Method to display car details
	    public void displayCar() {
	        System.out.println("Model: " + model);
	        System.out.println("Price: $" + price);
	        System.out.println("--------------------------");
	    }

	    // Static method to display total number of cars
	    public static void displayCarCount() {
	        System.out.println("Total Cars Created: " + carCount);
	    }

	    // Main method to test the class
	    public static void main(String[] args) {
	        CarCount c1 = new CarCount("Toyota Corolla", 20000.00);
	        CarCount c2 = new CarCount("Honda Civic", 22000.00);
	        CarCount c3 = new CarCount("Tesla Model 3", 35000.00);

	        c1.displayCar();
	        c2.displayCar();
	        c3.displayCar();

	        // Display the total number of cars created
	        CarCount.displayCarCount();
	    }
	}

