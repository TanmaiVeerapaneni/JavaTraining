package FlowControls;
import java.util.Scanner;

public class PowerUsingMathPower {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input base number
	        System.out.print("Enter the base: ");
	        int base = scanner.nextInt();

	        // Input the maximum exponent
	        System.out.print("Enter the maximum exponent: ");
	        int maxExponent = scanner.nextInt();

	        // Loop through 1 to maxExponent and calculate power using Math.pow()
	        for (int i = 1; i <= maxExponent; i++) {
	            double result = Math.pow(base, i);
	            System.out.println(base + " raised to the power " + i + " is: " + result);
	        }

	        scanner.close();
	    }
	}



