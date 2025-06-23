package FlowControls;
import java.util.Scanner;

public class PrimeNumbersInRange {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the upper limit
	        System.out.print("Enter the value of n: ");
	        int n = scanner.nextInt();

	        System.out.println("Prime numbers between 1 and " + n + " are:");

	        // Loop through numbers from 2 to n
	        for (int num = 2; num <= n; num++) {
	            boolean isPrime = true;

	            // Check if num is divisible by any number from 2 to num/2
	            for (int i = 2; i <= num / 2; i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }

	            // If isPrime is still true, print the number
	            if (isPrime) {
	                System.out.print(num + " ");
	            }
	        }

	        scanner.close();
	    }
	}

