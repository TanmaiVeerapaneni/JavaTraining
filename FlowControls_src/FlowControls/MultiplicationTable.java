package FlowControls;
import java.util.Scanner;

public class MultiplicationTable {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input number from user
	        System.out.print("Enter a number to print its multiplication table: ");
	        int num = scanner.nextInt();

	        // Print multiplication table from 1 to 10
	        System.out.println("Multiplication table for " + num + ":");
	        for (int i = 1; i <= 10; i++) {
	            int result = num * i;
	            System.out.println(num + " x " + i + " = " + result);
	        }

	        scanner.close();
	    }
	}

