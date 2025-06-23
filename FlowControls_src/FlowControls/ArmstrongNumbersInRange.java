package FlowControls;
import java.util.Scanner;

public class ArmstrongNumbersInRange {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the upper limit
	        System.out.print("Enter the value of n: ");
	        int n = scanner.nextInt();

	        System.out.println("Armstrong numbers between 1 and " + n + " are:");

	        // Loop from 1 to n
	        for (int num = 1; num <= n; num++) {
	            int original = num;
	            int sum = 0;
	            int digits = 0;

	            // Count number of digits
	            for (int temp = num; temp > 0; temp /= 10) {
	                digits++;
	            }

	            // Calculate sum of powered digits
	            for (int temp = num; temp > 0; temp /= 10) {
	                int digit = temp % 10;
	                sum += Math.pow(digit, digits);
	            }

	            // Check if it's an Armstrong number
	            if (sum == original) {
	                System.out.print(original + " ");
	            }
	        }

	        scanner.close();
	    }
	}


