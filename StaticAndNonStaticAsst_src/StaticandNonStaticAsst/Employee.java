package StaticandNonStaticAsst;

public class Employee {
	    // Instance variables
	    int empId;
	    String name;
	    double salary;

	    // Static variables to track total employees and total salary expense
	    static int totalEmployees = 0;
	    static double totalSalaryExpense = 0;

	    // Constructor
	    public Employee(int empId, String name, double salary) {
	        this.empId = empId;
	        this.name = name;
	        this.salary = salary;

	        // Update static counters
	        totalEmployees++;
	        totalSalaryExpense += salary;
	    }

	    // Method to display individual employee details
	    public void displayEmployee() {
	        System.out.println("Employee ID: " + empId);
	        System.out.println("Name: " + name);
	        System.out.println("Salary: $" + salary);
	        System.out.println("---------------------------");
	    }

	    // Static method to display overall statistics
	    public static void displayCompanyStats() {
	        System.out.println("Total Employees: " + totalEmployees);
	        System.out.println("Total Salary Expense: $" + totalSalaryExpense);
	    }

	    // Main method to test the class
	    public static void main(String[] args) {
	        Employee e1 = new Employee(101, "Alice", 50000);
	        Employee e2 = new Employee(102, "Bob", 60000);
	        Employee e3 = new Employee(103, "Charlie", 55000);

	        // Display each employee's details
	        e1.displayEmployee();
	        e2.displayEmployee();
	        e3.displayEmployee();

	        // Display total employees and total salary expense
	        Employee.displayCompanyStats();
	    }
	}


