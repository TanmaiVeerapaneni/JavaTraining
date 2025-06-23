package FlowControls;
import java.util.Scanner;

public class DivisibleByELeven {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input number from user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Check divisibility by 11
	        if (number % 11 == 0) {
	            System.out.println(number + " is divisible by 11.");
	        } else {
	            System.out.println(number + " is not divisible by 11.");
	        }

	        scanner.close();
	    }
	}

