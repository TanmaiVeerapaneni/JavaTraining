package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class KSmallestELement {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1. Read array size
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        // 2. Read array elements
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // 3. Read k
	        System.out.print("Enter k (k ≤ n): ");
	        int k = sc.nextInt();
	        if (k <= 0 || k > n) {
	            System.out.println("Invalid k. Must be between 1 and " + n);
	            return;
	        }

	        // 4. Sort array in ascending order
	        Arrays.sort(arr);

	        // 5. Print first k elements (smallest)
	        System.out.print("The " + k + " smallest element(s): ");
	        for (int i = 0; i < k; i++) {
	            System.out.print(arr[i] + (i < k - 1 ? " " : ""));
	        }

	        sc.close();
	    }
	}

