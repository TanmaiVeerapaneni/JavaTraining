package FlowControls;
import java.util.Scanner;

public class PalindromeCheck {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input number from user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int original = number;
	        int reversed = 0;

	        // Reverse the number using for loop
	        for (int temp = number; temp > 0; temp /= 10) {
	            int digit = temp % 10;
	            reversed = reversed * 10 + digit;
	        }

	        // Check if original number equals reversed number
	        if (original == reversed) {
	            System.out.println(original + " is a palindrome number.");
	        } else {
	            System.out.println(original + " is not a palindrome number.");
	        }

	        scanner.close();
	    }
	}


