package Strings;
import java.util.Scanner;

public class PalindromeCheck {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        // Convert to lowercase and remove spaces (optional cleanup)
	        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

	        boolean isPalindrome = true;

	        // Compare characters from start and end
	        for (int i = 0; i < cleaned.length() / 2; i++) {
	            if (cleaned.charAt(i) != cleaned.charAt(cleaned.length() - 1 - i)) {
	                isPalindrome = false;
	                break;
	            }
	        }

	        // Output result
	        if (isPalindrome) {
	            System.out.println("\"" + input + "\" is a palindrome.");
	        } else {
	            System.out.println("\"" + input + "\" is not a palindrome.");
	        }

	        sc.close();
	    }
	}


