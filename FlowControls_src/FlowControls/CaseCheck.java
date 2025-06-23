package FlowControls;
import java.util.Scanner;

public class CaseCheck {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input a character
	        System.out.print("Enter a single character: ");
	        char ch = scanner.next().charAt(0);

	        // Check if character is uppercase or lowercase
	        if (ch >= 'A' && ch <= 'Z') {
	            System.out.println(ch + " is an uppercase letter.");
	        } else if (ch >= 'a' && ch <= 'z') {
	            System.out.println(ch + " is a lowercase letter.");
	        } else {
	            System.out.println(ch + " is not an alphabet letter.");
	        }

	        scanner.close();
	    }
	}

