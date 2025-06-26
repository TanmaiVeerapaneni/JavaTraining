package Arrays;
import java.util.Scanner;

public class ArraySum {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1. Read array size
	        System.out.print("Enter the size of the array: ");
	        int n = sc.nextInt();

	        // 2. Read array elements
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // 3. Calculate sum
	        int sum = 0;
	        for (int i = 0; i < n; i++) {
	            sum += arr[i];
	        }

	        // 4. Print the sum
	        System.out.println("Sum of all elements: " + sum);

	        sc.close();
	    }
	}

