package Strings;
import java.util.Scanner;

public class ReverseStringManual {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        // Reverse manually using loop
	        String reversed = "";
	        for (int i = input.length() - 1; i >= 0; i--) {
	            reversed = reversed + input.charAt(i);
	        }

	        // Output
	        System.out.println("Reversed string: " + reversed);
	        
	        sc.close();
	    }
	
}
