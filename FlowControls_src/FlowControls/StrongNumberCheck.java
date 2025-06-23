package FlowControls;
import java.util.Scanner;

public class StrongNumberCheck {

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

	        // Input the number
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int original = number;
	        int sum = 0;

	        // Loop through each digit and compute factorial
	        for (int temp = number; temp > 0; temp /= 10) {
	            int digit = temp % 10;
	            sum += factorial(digit);
	        }

	        // Check if it's a Strong Number
	        if (sum == original) {
	            System.out.println(original + " is a Strong Number.");
	        } else {
	            System.out.println(original + " is not a Strong Number.");
	        }

	        scanner.close();
	    }
	}



