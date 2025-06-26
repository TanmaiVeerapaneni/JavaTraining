package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveArrayElement {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1. Read array length
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        // 2. Populate the array
	        int[] original = new int[n];
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            original[i] = sc.nextInt();
	        }

	        // 3. Value to remove
	        System.out.print("Enter value to remove: ");
	        int target = sc.nextInt();

	        // 4. Find the first occurrence index
	        int index = -1;
	        for (int i = 0; i < n; i++) {
	            if (original[i] == target) {
	                index = i;
	                break;
	            }
	        }

	        // 5. If found, create a new array without that element
	        if (index != -1) {
	            int[] updated = new int[n - 1];
	            for (int i = 0, j = 0; i < n; i++) {
	                if (i != index) {          // skip the target element
	                    updated[j++] = original[i];
	                }
	            }
	            System.out.println("Array after removal: " + Arrays.toString(updated));
	        } else {
	            System.out.println("Value " + target + " not found in the array.");
	        }

	        sc.close();
	    }
	}

