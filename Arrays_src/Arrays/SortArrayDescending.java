package Arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class SortArrayDescending {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1. Read array size
	        System.out.print("Enter the size of the array: ");
	        int n = sc.nextInt();

	        // 2. Read array elements into Integer[] (not int[] because reverseOrder needs objects)
	        Integer[] arr = new Integer[n];
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	        	arr[i] = sc.nextInt();
	        }
	        	
	        	 // 3. Sort in descending order
	            Arrays.sort(arr, Collections.reverseOrder());

	            // 4. Print sorted array
	            System.out.println("Array in descending order:");
	            for (int num : arr) {
	                System.out.print(num + " ");
	            }

	            sc.close();
	        
	        }


}
