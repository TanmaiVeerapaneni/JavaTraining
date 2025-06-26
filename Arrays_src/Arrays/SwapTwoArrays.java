package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class SwapTwoArrays {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1. Read array size
	        System.out.print("Enter the size of the arrays: ");
	        int n = sc.nextInt();

	        // 2. Read first array
	        int[] arr1 = new int[n];
	        System.out.println("Enter elements of first array:");
	        for (int i = 0; i < n; i++) {
	            arr1[i] = sc.nextInt();
	        }

	        // 3. Read second array
	        int[] arr2 = new int[n];
	        System.out.println("Enter elements of second array:");
	        for (int i = 0; i < n; i++) {
	            arr2[i] = sc.nextInt();
	        }

	        // 4. Swap using temporary variable
	        for (int i = 0; i < n; i++) {
	            int temp = arr1[i];
	            arr1[i] = arr2[i];
	            arr2[i] = temp;
	        }

	        // 5. Display swapped arrays
	        System.out.println("After swapping:");
	        System.out.println("First array: " + Arrays.toString(arr1));
	        System.out.println("Second array: " + Arrays.toString(arr2));

	        sc.close();
	    }
	}

