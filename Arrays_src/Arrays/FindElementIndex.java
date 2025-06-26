package Arrays;
import java.util.Scanner;

public class FindElementIndex {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input size of array
	        System.out.print("Enter the number of elements: ");
	        int n = sc.nextInt();

	        // Declare and fill the array
	        int[] numbers = new int[n];
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            numbers[i] = sc.nextInt();
	        }

	        // Input the target value to search
	        System.out.print("Enter the value to search for: ");
	        int target = sc.nextInt();

	        // Search for the target value
	        int index = -1;  // Default if not found
	        for (int i = 0; i < n; i++) {
	            if (numbers[i] == target) {
	                index = i;  // store index
	                break;      // stop at first match
	            }
	        }

	        // Display result
	        if (index != -1) {
	            System.out.println("Value " + target + " found at index " + index + ".");
	        } else {
	            System.out.println("Value " + target + " not found in the array.");
	        }

	        sc.close();
	    }
	
}
