package FlowControls;
import java.util.Scanner;

public class DivisibleBy5 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input number from user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Check divisibility by 5
	        if (number % 5 == 0) {
	            System.out.println(number + " is divisible by 5.");
	        } else {
	            System.out.println(number + " is not divisible by 5.");
	        }

	        scanner.close();
	    }
	}

