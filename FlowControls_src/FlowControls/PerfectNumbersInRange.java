package FlowControls;	
import java.util.Scanner;

public class PerfectNumbersInRange {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input upper limit
	        System.out.print("Enter the value of n: ");
	        int n = scanner.nextInt();

	        System.out.println("Perfect numbers between 1 and " + n + " are:");

	        // Loop through numbers from 1 to n
	        for (int num = 1; num <= n; num++) {
	            int sum = 0;

	            // Find divisors of num and calculate their sum
	            for (int i = 1; i < num; i++) {
	                if (num % i == 0) {
	                    sum += i;
	                }
	            }

	            // Check if number is perfect
	            if (sum == num) {
	                System.out.print(num + " ");
	            }
	        }

	        scanner.close();
	    }
	}


