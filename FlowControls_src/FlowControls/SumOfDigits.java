package FlowControls;
import java.util.Scanner;

public class SumOfDigits {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the number
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int sum = 0;
	        int temp = Math.abs(number); // handle negative input

	        // Use for loop to calculate sum of digits
	        for (; temp > 0; temp /= 10) {
	            int digit = temp % 10;
	            sum += digit;
	        }

	        // Display result
	        System.out.println("Sum of digits: " + sum);

	        scanner.close();
	    }
	}

