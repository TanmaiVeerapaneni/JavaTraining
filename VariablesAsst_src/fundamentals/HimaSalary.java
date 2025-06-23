package fundamentals;

public class HimaSalary {
	public static void main(String[] args) {
	        double baseSalary = 85000.0;

	        // Allowances
	        double ta = baseSalary * 0.15; // Travel Allowance
	        double da = baseSalary * 0.20; // Dearness Allowance
	        double hra = baseSalary * 0.18; // House Rent Allowance

	        // Deductions
	        double pf = baseSalary * 0.20; // Provident Fund
	        double tax = baseSalary * 0.25; // Tax

	        // Calculations
	        double grossSalary = baseSalary + ta + da + hra;
	        double netSalary = grossSalary - (pf + tax);

	        // Output
	        System.out.println("Base Salary: ₹" + baseSalary);
	        System.out.println("TA (15%): ₹" + ta);
	        System.out.println("DA (20%): ₹" + da);
	        System.out.println("HRA (18%): ₹" + hra);
	        System.out.println("Gross Salary: ₹" + grossSalary);
	        System.out.println("PF (20%): ₹" + pf);
	        System.out.println("Tax (25%): ₹" + tax);
	        System.out.println("Net Salary: ₹" + netSalary);
	    }
	}

