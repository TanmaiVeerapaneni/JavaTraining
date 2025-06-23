package FlowControls;
import java.util.Scanner;

public class CharacterTypeCheck {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input a character from the user
	        System.out.print("Enter a character: ");
	        char ch = scanner.next().charAt(0);

	        // Check character type using if-else
	        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
	            System.out.println(ch + " is an alphabet.");
	        } else if (ch >= '0' && ch <= '9') {
	            System.out.println(ch + " is a digit.");
	        } else {
	            System.out.println(ch + " is a special character.");
	        }

	        scanner.close();
	    }
	}
