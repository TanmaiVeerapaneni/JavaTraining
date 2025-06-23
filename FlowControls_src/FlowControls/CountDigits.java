package FlowControls;
import java.util.Scanner;


public class CountDigits {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the number from user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Make a copy of the number
	        int temp = Math.abs(number); // handle negative numbers

	        int count = 0;

	        // Use for loop to count digits
	        for (; temp > 0; temp /= 10) {
	            count++;
	        }

	        // If the number is 0, count is 1
	        if (number == 0) {
	            count = 1;
	        }

	        // Display result
	        System.out.println("Total number of digits: " + count);

	        scanner.close();
	    }
	}

