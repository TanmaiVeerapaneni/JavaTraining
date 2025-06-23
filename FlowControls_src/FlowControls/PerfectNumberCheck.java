package FlowControls;
import java.util.Scanner;

public class PerfectNumberCheck {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the number
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int sum = 0;

	        // Find proper divisors and add them
	        for (int i = 1; i < number; i++) {
	            if (number % i == 0) {
	                sum += i;
	            }
	        }

	        // Check if number is perfect
	        if (sum == number) {
	            System.out.println(number + " is a Perfect number.");
	        } else {
	            System.out.println(number + " is not a Perfect number.");
	        }

	        scanner.close();
	    }
	}

