package FlowControls;
import java.util.Scanner;

public class DivisibleByThree {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input number from user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Check divisibility using if-else
	        if (number % 3 == 0) {
	            System.out.println(number + " is divisible by 3.");
	        } else {
	            System.out.println(number + " is not divisible by 3");
	        }
	    }
}
