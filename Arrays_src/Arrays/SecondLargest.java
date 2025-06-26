package Arrays;
import java.util.Scanner;

public class SecondLargest {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1. Read size
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        if (n < 2) {
	            System.out.println("Array must contain at least two elements.");
	            return;
	        }

	        // 2. Read elements
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // 3. Initialize max and second max
	        int first = Integer.MIN_VALUE;
	        int second = Integer.MIN_VALUE;

	        // 4. Loop to find second largest
	        for (int num : arr) {
	            if (num > first) {
	                second = first;
	                first = num;
	            } else if (num > second && num != first) {
	                second = num;
	            }
	        }

	        // 5. Output
	        if (second == Integer.MIN_VALUE) {
	            System.out.println("No distinct second largest element found.");
	        } else {
	            System.out.println("Second largest element: " + second);
	        }

	        sc.close();
	    }
	}

