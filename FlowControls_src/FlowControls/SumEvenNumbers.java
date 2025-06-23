package FlowControls;	
import java.util.Scanner;

public class SumEvenNumbers {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the value of n
	        System.out.print("Enter the value of n: ");
	        int n = scanner.nextInt();

	        int sum = 0;

	        // Loop from 1 to n
	        for (int i = 1; i <= n; i++) {
	            if (i % 2 == 0) {
	                sum += i;
	            }
	        }

	        // Display the result
	        System.out.println("Sum of all even numbers from 1 to " + n + " is: " + sum);

	        scanner.close();
	    }
	}