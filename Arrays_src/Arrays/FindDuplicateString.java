package Arrays;
import java.util.Scanner;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class FindDuplicateString {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1) Read array size
	        System.out.print("Enter number of strings: ");
	        int n = sc.nextInt();
	        sc.nextLine();               // consume the leftover newline

	        // 2) Read the strings
	        String[] arr = new String[n];
	        System.out.println("Enter " + n + " strings:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextLine().trim();
	        }

	        // 3) Sets to track seen values and duplicates
	        HashSet<String> seen = new HashSet<>();
	        LinkedHashSet<String> duplicates = new LinkedHashSet<>();

	        // 4) Detect duplicates
	        for (String value : arr) {
	            if (!seen.add(value)) {   // seen.add returns false if value already exists
	                duplicates.add(value);
	            }
	        }

	        // 5) Print result
	        if (duplicates.isEmpty()) {
	            System.out.println("No duplicate strings found.");
	        } else {
	            System.out.println("Duplicate string(s): " + duplicates);
	        }

	        sc.close();
	    }
	}
