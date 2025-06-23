package FlowControls;
import java.util.Scanner;

public class FactorOfNumbers {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input a number from the user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        System.out.println("Factors of " + number + " are:");

	        // Loop from 1 to number and check divisibility
	        for (int i = 1; i <= number; i++) {
	            if (number % i == 0) {
	                System.out.print(i + " ");
	            }
	        }

	        scanner.close();
	    }
	}

