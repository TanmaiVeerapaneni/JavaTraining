package FlowControls;
import java.util.Scanner;

public class EvenorOdd {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input number from user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Check if the number is even or odd
	        if (number % 2 == 0) {
	            System.out.println(number + " is even.");
	        } else {
	            System.out.println(number + " is odd.");
	        }

	        scanner.close();
	    }
	}

