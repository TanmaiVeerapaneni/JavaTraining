package FlowControls;
import java.util.Scanner;

public class PowerCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input base and exponent
	        System.out.print("Enter the base: ");
	        int base = scanner.nextInt();

	        System.out.print("Enter the exponent (positive integer): ");
	        int exponent = scanner.nextInt();

	        int result = 1;

	        // Calculate power using for loop
	        for (int i = 1; i <= exponent; i++) {
	            result *= base;
	        }

	        System.out.println(base + " raised to the power " + exponent + " is: " + result);

	        scanner.close();
	    }
	}

