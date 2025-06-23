package FlowControls;
import java.util.Scanner;

public class ReverseNaturalNumbers {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the value of n
	        System.out.print("Enter a number (n): ");
	        int n = scanner.nextInt();

	        // Print natural numbers in reverse order
	        if (n >= 1) {
	            System.out.println("Natural numbers from " + n + " to 1:");
	            for (int i = n; i >= 1; i--) {
	                System.out.print(i + " ");
	            }
	        } else {
	            System.out.println("Please enter a number greater than or equal to 1.");
	        }

	        scanner.close();
	    }
	}