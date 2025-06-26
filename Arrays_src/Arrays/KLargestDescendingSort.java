package Arrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class KLargestDescendingSort {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1) Array length
	        System.out.print("Enter number of elements (n): ");
	        int n = sc.nextInt();

	        // 2) Read the array
	        Integer[] arr = new Integer[n];      // Integer wrapper so we can use a comparator
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // 3) Read k
	        System.out.print("Enter k (k ≤ n): ");
	        int k = sc.nextInt();
	        if (k <= 0 || k > n) {
	            System.out.println("Invalid k. It must be between 1 and n.");
	            return;
	        }

	        // 4) Sort entire array in DESCENDING order
	        Arrays.sort(arr, Collections.reverseOrder());

	        // 5) Print the first k elements
	        System.out.print("The " + k + " largest element(s): ");
	        for (int i = 0; i < k; i++) {
	            System.out.print(arr[i] + (i < k - 1 ? " " : ""));
	        }
	        System.out.println();

	        sc.close();
	    }
	}



