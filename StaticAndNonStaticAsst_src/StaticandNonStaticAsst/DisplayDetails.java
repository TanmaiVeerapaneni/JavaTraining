package StaticandNonStaticAsst;

public class DisplayDetails {
	    // Instance variables
	    int empId;
	    String name;
	    double salary;

	    // Method to display employee details
	    public void displayDetails(int empId,String name,double salary) {
	        System.out.println("Employee ID: " + empId);
	        System.out.println("Name: " + name);
	        System.out.println("Salary: $" + salary);
	    }

	    // Main method to test the class
	    public static void main(String[] args) {
	        // Create an Employee object
	        DisplayDetails disp = new DisplayDetails();

	        // Display details using object
	        disp.displayDetails(101,"John Doe", 75000.00);
	    }
	}

