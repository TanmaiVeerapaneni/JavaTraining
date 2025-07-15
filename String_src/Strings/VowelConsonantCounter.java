package Strings;
import java.util.Scanner;

public class VowelConsonantCounter {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        // Convert to lowercase for easier comparison
	        input = input.toLowerCase();

	        int vowels = 0, consonants = 0;

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            // Check if it's a letter
	            if (Character.isLetter(ch)) {
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowels++;
	                } else {
	                    consonants++;
	                }
	            }
	        }

	        // Output the result
	        System.out.println("Vowels: " + vowels);
	        System.out.println("Consonants: " + consonants);

	        sc.close();
	    }
	}



