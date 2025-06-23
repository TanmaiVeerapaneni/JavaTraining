package FlowControls;
import java.util.Scanner;

public class PositiveNegativeCheck {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input a number from the user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Check if the number is positive, negative, or zero
	        if (number > 0) {
	            System.out.println(number + " is a positive number.");
	        } else if (number < 0) {
	            System.out.println(number + " is a negative number.");
	        } else {
	            System.out.println("The number is zero.");
	        }

	        scanner.close();
	    }
	}

