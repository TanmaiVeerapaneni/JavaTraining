package Strings;
import java.util.Scanner;

public class StringCompressor {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        // Compress the string
	        StringBuilder compressed = new StringBuilder();
	        int count = 1;

	        for (int i = 1; i <= input.length(); i++) {
	            // Check if current char equals previous char
	            if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
	                count++;
	            } else {
	                compressed.append(input.charAt(i - 1));
	                if (count > 1) {
	                    compressed.append(count);
	                }
	                count = 1; // Reset count
	            }
	        }

	        // Output
	        System.out.println("Compressed String: " + compressed.toString());

	        sc.close();
	    }
	}


