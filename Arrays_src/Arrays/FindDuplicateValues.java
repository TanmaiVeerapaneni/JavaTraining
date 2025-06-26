package Arrays;
import java.util.Scanner;
import java.util.HashSet;
import java.util.LinkedHashSet;


public class FindDuplicateValues {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1. Read array length
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        // 2. Read the array
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // 3. Sets to track seen values and duplicates
	        HashSet<Integer> seen     = new HashSet<>();
	        LinkedHashSet<Integer> dup = new LinkedHashSet<>();

	        // 4. Identify duplicates
	        for (int value : arr) {
	            if (!seen.add(value)) {      // add() returns false if value already present
	                dup.add(value);          // keep a record (preserves first-seen order)
	            }
	        }

	        // 5. Display results
	        if (dup.isEmpty()) {
	            System.out.println("No duplicates found.");
	        } else {
	            System.out.println("Duplicate value(s): " + dup);
	        }

	        sc.close();
	    }
	

}
