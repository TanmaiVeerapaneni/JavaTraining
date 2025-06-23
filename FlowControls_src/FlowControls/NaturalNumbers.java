package FlowControls;
import java.util.Scanner;
public class NaturalNumbers {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the upper limit
	        System.out.print("Enter a number (n): ");
	        int n = scanner.nextInt();

	        // Check for valid input
	        if (n >= 1) {
	            System.out.println("Natural numbers from 1 to " + n + " are:");
	            for (int i = 1; i <= n; i++) {
	                System.out.print(i + " ");
	            }
	        } else {
	            System.out.println("Please enter a number greater than or equal to 1.");
	        }

	        scanner.close();
	    }
	}

