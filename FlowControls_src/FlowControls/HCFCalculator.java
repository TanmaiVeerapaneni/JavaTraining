package FlowControls;
import java.util.Scanner;

public class HCFCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input two numbers
	        System.out.print("Enter first number: ");
	        int a = scanner.nextInt();

	        System.out.print("Enter second number: ");
	        int b = scanner.nextInt();

	        int hcf = 1;

	        // Loop from 1 to the smaller of a and b
	        for (int i = 1; i <= Math.min(a, b); i++) {
	            if (a % i == 0 && b % i == 0) {
	                hcf = i;
	            }
	        }

	        System.out.println("HCF (GCD) of " + a + " and " + b + " is: " + hcf);

	        scanner.close();
	    }
	}
