package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class SortArrayAscending {
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

	        // 3. Sort the array
	        Arrays.sort(arr);

	        // 4. Print the sorted array
	        System.out.println("Array in ascending order:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	        sc.close();
	    }
	}


