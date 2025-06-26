package Arrays;
import java.util.Scanner;

public class ArrayContainsValue {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input array size
	        System.out.print("Enter the number of elements: ");
	        int n = sc.nextInt();

	        // Declare and fill the array
	        int[] numbers = new int[n];
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            numbers[i] = sc.nextInt();
	        }

	        // Value to search for
	        System.out.print("Enter the value to search: ");
	        int target = sc.nextInt();

	        // Search logic
	        boolean found = false;
	        for (int value : numbers) {
	            if (value == target) {
	                found = true;
	                break;
	            }
	        }

	        // Output result
	        if (found) {
	            System.out.println(target + " is present in the array.");
	        } else {
	            System.out.println(target + " is NOT present in the array.");
	        }

	        sc.close();
	    }
	

}
