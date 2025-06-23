package FlowControls;
import java.util.Scanner;

public class VowelOrConsonant {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input a character
	        System.out.print("Enter a single alphabet: ");
	        char ch = scanner.next().charAt(0);

	        // Convert to lowercase to simplify comparison
	        ch = Character.toLowerCase(ch);

	        // Check if it's an alphabet first
	        if ((ch >= 'a' && ch <= 'z')) {
	            // Check if it's a vowel
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                System.out.println(ch + " is a vowel.");
	            } else {
	                System.out.println(ch + " is a consonant.");
	            }
	        } else {
	            System.out.println("Invalid input. Please enter an alphabet letter.");
	        }

	        scanner.close();
	    }
	}
