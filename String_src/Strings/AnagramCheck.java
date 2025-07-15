package Strings;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input two strings
	        System.out.print("Enter first string: ");
	        String str1 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

	        System.out.print("Enter second string: ");
	        String str2 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

	        // Check length first
	        if (str1.length() != str2.length()) {
	            System.out.println("Not anagrams (different lengths).");
	        } else {
	            // Convert to char arrays
	            char[] arr1 = str1.toCharArray();
	            char[] arr2 = str2.toCharArray();

	            // Sort both arrays
	            Arrays.sort(arr1);
	            Arrays.sort(arr2);

	            // Compare sorted arrays
	            if (Arrays.equals(arr1, arr2)) {
	                System.out.println("They are anagrams.");
	            } else {
	                System.out.println("They are not anagrams.");
	            }
	        }

	        sc.close();
	    }
}
