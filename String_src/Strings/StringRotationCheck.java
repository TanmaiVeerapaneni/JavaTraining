package Strings;
import java.util.Scanner;

public class StringRotationCheck {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input two strings
	        System.out.print("Enter the original string: ");
	        String str1 = sc.nextLine();

	        System.out.print("Enter the rotated string: ");
	        String str2 = sc.nextLine();

	        // Check for rotation
	        if (isRotation(str1, str2)) {
	            System.out.println("\"" + str2 + "\" is a rotation of \"" + str1 + "\".");
	        } else {
	            System.out.println("\"" + str2 + "\" is NOT a rotation of \"" + str1 + "\".");
	        }

	        sc.close();
	    }

	    public static boolean isRotation(String s1, String s2) {
	        // Both strings must be the same length and not empty
	        if (s1.length() != s2.length() || s1.isEmpty()) {
	            return false;
	        }

	        // Concatenate s1 with itself and see if s2 is a substring
	        String temp = s1 + s1;
	        return temp.contains(s2);
	    }
	}

