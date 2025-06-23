package FlowControls;
import java.util.Scanner;

public class ArmstrongCheck {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the number
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int original = number;
	        int sum = 0;

	        // Use for loop to calculate sum of cubes of digits
	        for (int temp = number; temp > 0; temp /= 10) {
	            int digit = temp % 10;
	            sum += digit * digit * digit;
	        }

	        // Check if Armstrong
	        if (sum == original) {
	            System.out.println(original + " is an Armstrong number.");
	        } else {
	            System.out.println(original + " is not an Armstrong number.");
	        }

	        scanner.close();
	    }
	}
