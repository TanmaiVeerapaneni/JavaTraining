package FlowControls;
import java.util.Scanner;

public class DigitFrequency {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the number
	        System.out.print("Enter a number: ");
	        long number = scanner.nextLong();

	        // Array to hold frequency of digits 0–9
	        int[] freq = new int[10];

	        // Count digit frequencies
	        for (long temp = Math.abs(number); temp > 0; temp /= 10) {
	            int digit = (int)(temp % 10);
	            freq[digit]++;
	        }

	        // Print the frequency of each digit
	        System.out.println("Digit frequencies in " + number + ":");
	        for (int i = 0; i <= 9; i++) {
	            if (freq[i] > 0) {
	                System.out.println("Digit " + i + ": " + freq[i] + " time(s)");
	            }
	        }

	        scanner.close();
	    }
	}


