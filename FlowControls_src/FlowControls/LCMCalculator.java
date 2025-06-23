package FlowControls;
import java.util.Scanner;

public class LCMCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input two numbers
	        System.out.print("Enter first number: ");
	        int a = scanner.nextInt();

	        System.out.print("Enter second number: ");
	        int b = scanner.nextInt();

	        int lcm = 0;

	        // Start from the greater of a and b, check each multiple
	        for (int i = Math.max(a, b); i <= a * b; i++) {
	            if (i % a == 0 && i %  b == 0) {
	                lcm = i;
	                break; // First common multiple is the LCM
	            }
	        }

	        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);

	        scanner.close();
	    }
	}


