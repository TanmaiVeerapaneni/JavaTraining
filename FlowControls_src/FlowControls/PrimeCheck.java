package FlowControls;
import java.util.Scanner;

public class PrimeCheck {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input a number
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        boolean isPrime = true;

	        // Prime check starts
	        if (number <= 1) {
	            isPrime = false;
	        } else {
	            // Check divisibility from 2 to number/2
	            for (int i = 2; i <= number / 2; i++) {
	                if (number % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }

	        // Output result
	        if (isPrime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }

	        scanner.close();
	    }
	}
