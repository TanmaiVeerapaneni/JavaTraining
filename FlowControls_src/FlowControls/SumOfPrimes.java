package FlowControls;
import java.util.Scanner;

public class SumOfPrimes {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the upper limit
	        System.out.print("Enter the value of n: ");
	        int n = scanner.nextInt();

	        int sum = 0;

	        // Loop through all numbers from 2 to n
	        for (int num = 2; num <= n; num++) {
	            boolean isPrime = true;

	            // Check if num is prime
	            for (int i = 2; i <= num / 2; i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }

	            // Add to sum if prime
	            if (isPrime) {
	                sum += num; }
	        }

	        // Print the result
	        System.out.println("Sum of all prime numbers between 1 and " + n + " is: " + sum);

	        scanner.close();
	    }
	}



