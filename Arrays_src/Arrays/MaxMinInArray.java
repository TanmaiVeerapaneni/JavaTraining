package Arrays;
import java.util.Scanner;

public class MaxMinInArray {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1. Input array size
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        if (n <= 0) {
	            System.out.println("Array must have at least one element.");
	            return;
	        }

	        // 2. Declare and populate the array
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // 3. Initialize max and min with the first element
	        int max = arr[0];
	        int min = arr[0];

	        // 4. Loop through array to find max and min
	        for (int i = 1; i < n; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }

	        // 5. Display results
	        System.out.println("Maximum value: " + max);
	        System.out.println("Minimum value: " + min);

	        sc.close();
	    }
	}

