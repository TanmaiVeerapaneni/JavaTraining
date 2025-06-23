package FlowControls;
import java.util.Scanner;

public class SwapFirstLastDigit {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input number
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int original = number;
	        int num = number;

	        int lastDigit = num % 10;

	        // Find the number of digits and the first digit
	        int digits = 0;
	        int firstDigit = 0;

	        for (int temp = num; temp > 0; temp /= 10) {
	            digits++;
	            firstDigit = temp;
	        }

	        if (digits == 1) {
	            System.out.println("Only one digit. Swapping not needed: " + number);
	            return;
	        }

	        // Remove first and last digits from the number
	        int middlePart = (num % (int)Math.pow(10, digits - 1)) / 10;

	        // Construct the new number with swapped digits
	        int newNumber = (lastDigit * (int)Math.pow(10, digits - 1)) + (middlePart * 10) + firstDigit;

	        // Display result
	        System.out.println("Original number: " + original);
	        System.out.println("After swapping first and last digits: " + newNumber);

	        scanner.close();
	    }
	}

