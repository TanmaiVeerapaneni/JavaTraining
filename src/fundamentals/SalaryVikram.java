package fundamentals;

public class SalaryVikram {
	 public static void main(String[] args) {
	        double salary = 85000.0;
	        double taxRate = 0.20;

	        // Calculate tax amount
	        double taxAmount = salary * taxRate;

	        // Calculate remaining salary
	        double remainingSalary = salary - taxAmount;

	        System.out.println("Vikram's Total Salary: ₹" + salary);
	        System.out.println("Tax Amount (20%): ₹" + taxAmount);
	        System.out.println("Remaining Salary after Tax: ₹" + remainingSalary);
	    }
	}

