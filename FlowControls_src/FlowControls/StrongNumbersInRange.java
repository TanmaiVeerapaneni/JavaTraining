package FlowControls;
import java.util.Scanner;


public class StrongNumbersInRange {
	    // Method to calculate factorial of a digit
	    public static int factorial(int num) {
	        int fact = 1;
	        for (int i = 1; i <= num; i++) {
	            fact *= i;
	        }
	        return fact;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the upper limit
	        System.out.print("Enter the value of n: ");
	        int n = scanner.nextInt();

	        System.out.println("Strong numbers between 1 and " + n + " are:");

	        // Loop from 1 to n
	        for (int num = 1; num <= n; num++) {
	            int sum = 0;
	            int temp = num;

	            // Calculate sum of factorials of digits
	            for (; temp > 0; temp /= 10) {
	                int digit = temp % 10;
	                sum += factorial(digit);
	            }

	            // Check if the number is a Strong Number
	            if (sum == num) {
	                System.out.print(num + " ");
	            }
	        }

	        scanner.close();
	    }
	}
