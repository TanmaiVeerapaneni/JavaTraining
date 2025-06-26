package Arrays;
import java.util.Scanner;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class CommonStringInArray {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // ---------- Read first array ----------
	        System.out.print("How many strings in array-1? ");
	        int n1 = sc.nextInt();
	        sc.nextLine();                       // consume newline
	        String[] arr1 = new String[n1];
	        System.out.println("Enter " + n1 + " strings for array-1:");
	        for (int i = 0; i < n1; i++) {
	            arr1[i] = sc.nextLine().trim();
	        }

	        // ---------- Read second array ----------
	        System.out.print("\nHow many strings in array-2? ");
	        int n2 = sc.nextInt();
	        sc.nextLine();
	        String[] arr2 = new String[n2];
	        System.out.println("Enter " + n2 + " strings for array-2:");
	        for (int i = 0; i < n2; i++) {
	            arr2[i] = sc.nextLine().trim();
	        }

	        // ---------- Find common elements ----------
	        HashSet<String> set = new HashSet<>();
	        for (String s : arr1) {              // load first array into HashSet
	            set.add(s);
	        }

	        LinkedHashSet<String> common = new LinkedHashSet<>();
	        for (String s : arr2) {              // check each item in second array
	            if (set.contains(s)) {
	                common.add(s);               // LinkedHashSet keeps insertion order & uniqueness
	            }
	        }

	        // ---------- Output ----------
	        if (common.isEmpty()) {
	            System.out.println("\nNo common elements.");
	        } else {
	            System.out.println("\nCommon element(s): " + common);
	        }

	        sc.close();
	    }
	

}
