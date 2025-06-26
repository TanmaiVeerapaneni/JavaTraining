package Arrays;
import java.util.Scanner;


public class SecondSmallest {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1. Input array size
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        if (n < 2) {
	            System.out.println("Array must contain at least two elements.");
	            return;
	        }

	        // 2. Read array elements
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // 3. Initialize smallest and second smallest
	        int first = Integer.MAX_VALUE;
	        int second = Integer.MAX_VALUE;

	        // 4. Find second smallest
	        for (int num : arr) {
	            if (num < first) {
	                second = first;
	                first = num;
	            } else if (num < second && num != first) {
	                second = num;
	            }
	        }

	        // 5. Display result
	        if (second == Integer.MAX_VALUE) {
	            System.out.println("No distinct second smallest element found.");
	        } else {
	            System.out.println("Second smallest element: " + second);
	        }

	        sc.close();
	    }

}