package FlowControls;
import java.util.Scanner;

public class Primefactors {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input number
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        System.out.println("Prime factors of " + number + " are:");

	        // Print all prime factors
	        for (int i = 2; i <= number; i++) {
	            while (number % i == 0) {
	                System.out.print(i + " ");
	                number = number / i;
	            }
	        }

	        scanner.close();
	    }
	}

